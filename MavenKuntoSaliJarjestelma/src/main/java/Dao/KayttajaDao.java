package Dao;

import Entities.Kayttaja;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class KayttajaDao {
    
    protected SessionFactory factory;
    protected Session session;
    
    public KayttajaDao (SessionFactory factory) {
        this.factory = factory;
    }

    public void addKayttaja(Kayttaja kayttaja) {
        try {
            if (getKayttaja(kayttaja.getTunnus()) == null) {
                openAndBeginTransaction();
                saveAndCommitKayttaja(kayttaja);
            } 
        } catch (Exception sqlException) {
            throwKayttajaTrasactionException(sqlException);
        } finally {
            closeTransaction();
        }
    }

    public boolean deleteKayttaja(int id) {
        boolean success = true;
        try {
            openAndBeginTransaction();
            Kayttaja k = (Kayttaja)session.get(Kayttaja.class, id);
            if (k!= null){
		deleteKayttaja(k);
            }
        } catch (Exception sqlException) {
            throwKayttajaTrasactionException(sqlException);
            success = false;
        } finally {
            closeTransaction();
        }
        return success;
    }

    public void updateKayttaja(Kayttaja kayttaja) {
        saveOrUpdateKayttaja(kayttaja);
    }

    // HAKU ID-NUMEROLLA
    public Kayttaja getKayttaja(int kayttajaId) {
        Kayttaja k = null;
        try {
            openAndBeginTransaction(); // avataan uusi sessio
            k = (Kayttaja) session.load(Kayttaja.class, kayttajaId);
        } catch (Exception sqlException) {
            throwKayttajaTrasactionException(sqlException);
        } finally {
            closeTransaction();
        }
        return k;
    }
    
    // HAKU TUNNUKSELLA
    public Kayttaja getKayttaja(String tunnus) {
        Kayttaja k = null;
        try {
            openAndBeginTransaction();
            String hqlString = "FROM Kayttaja AS haku WHERE tunnus = :muuttuja";
            List<Kayttaja> lista = session.createQuery(hqlString).setParameter("muuttuja", tunnus).list();
            k = lista.get(0);
            session.getTransaction().commit();
        } catch (Exception e) {
            throwKayttajaTrasactionException(e);
        } finally {
            closeTransaction();
        }
        return k;
    }
    
    // apumetodit
    
    protected void saveAndCommitKayttaja(Kayttaja k) {
        session.save(k);
        session.getTransaction().commit();
    }
    protected void closeTransaction() {
        if (session != null) {
            session.close();
        }
    }
    protected void openAndBeginTransaction() throws HibernateException {
        session = factory.openSession();
        session.beginTransaction();
    }
    protected void throwKayttajaTrasactionException(Exception sqlException) {
        if (session.getTransaction() != null) {
            session.getTransaction().rollback();
        }
        sqlException.printStackTrace();
    }
    protected void saveOrUpdateKayttaja(Kayttaja k) {
        try {
            openAndBeginTransaction(); // avataan uusi sessio
            session.saveOrUpdate(k);
            session.getTransaction().commit();
        } catch (Exception sqlException) {
            throwKayttajaTrasactionException(sqlException);
        } finally {
            closeTransaction();
        }
    }
    protected void deleteKayttaja(Kayttaja k) {
        session.delete(k);
        session.getTransaction().commit(); //tallennetaan muutokset tietokantaan
    }

}