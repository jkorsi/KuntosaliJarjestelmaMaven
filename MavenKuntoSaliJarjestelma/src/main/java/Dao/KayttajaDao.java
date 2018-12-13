package Dao;

import Entities.Kayttaja;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import otp.mavenkuntosalijarjestelma.HibernateUtil;

public class KayttajaDao extends SuperDao{
    private static KayttajaDao instance = null;
    
    /**
     * KayttajaDao-luokan konstruktori
     *
     * @param factory SessionFactory hibernate sessioita varten
     */
    
    private KayttajaDao() {
        this.factory = HibernateUtil.getSessionFactory();
    }
    
    public static KayttajaDao getInstance() {
        if (instance == null) {
            instance = new KayttajaDao();
        }
        return instance;
    }

    /**
     * Lisää Kayttaja-olion tietokantaan
     *
     * @param kayttaja
     */
    public void addKayttaja(Kayttaja kayttaja) {
        try {
            if (getKayttaja(kayttaja.getTunnus()) == null) {
                openAndBeginTransaction();
                saveAndCommitObject(kayttaja);
            } 
        } catch (Exception sqlException) {
            throwObjectTrasactionException(sqlException);
        } finally {
            closeTransaction();
        }
    }

    /**
     * Poistaa Kayttaja-olion tietokannasta id:n perusteella
     *
     * @param id
     */
    public boolean deleteKayttaja(int id) {
        boolean success = true;
        try {
            openAndBeginTransaction();
            Kayttaja k = (Kayttaja)session.get(Kayttaja.class, id);
            if (k!= null){
		deleteObject(k);
            }
        } catch (Exception sqlException) {
            throwObjectTrasactionException(sqlException);
            success = false;
        } finally {
            closeTransaction();
        }
        return success;
    }

     /**
     * Päivitää Kayttaja-olion tietokannassa sen ilmentymän perusteella
     *
     * @param jasen
     */
    public void updateKayttaja(Kayttaja kayttaja) {
        saveOrUpdateObject(kayttaja);
    }

    /**
     * Hakee tietokannasta Kayttaja-olion id:n perusteella
     *
     * @param kayttajaId
     * @return haettu Kayttaja-olio, mikäli olemassa
     */
    public Kayttaja getKayttaja(int kayttajaId) {
        Kayttaja k = null;
        try {
            openAndBeginTransaction(); // avataan uusi sessio
            k = (Kayttaja) session.load(Kayttaja.class, kayttajaId);
        } catch (Exception sqlException) {
            throwObjectTrasactionException(sqlException);
        } finally {
            closeTransaction();
        }
        return k;
    }
    
    /**
     * Hakee tietokannasta Kayttaja-olion tunnuksen perusteella
     *
     * @param tunnus
     * @return haettu Kayttaja-olio, mikäli olemassa
     */
    public Kayttaja getKayttaja(String tunnus) {
        Kayttaja k = null;
        try {
            openAndBeginTransaction();
            String hqlString = "FROM Kayttaja AS haku WHERE tunnus = :muuttuja";
            List<Kayttaja> lista = session.createQuery(hqlString).setParameter("muuttuja", tunnus).list();
            k = lista.get(0);
            session.getTransaction().commit();
        } catch (Exception e) {
            throwObjectTrasactionException(e);
        } finally {
            closeTransaction();
        }
        return k;
    }
    
    private static final Logger LOG = Logger.getLogger(KayttajaDao.class.getName());

}