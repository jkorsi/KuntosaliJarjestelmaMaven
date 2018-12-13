package Dao;

import Entities.Jasen;
import Entities.Kayttaja;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author juhos
 */
public class SuperDao {
    /**
     *
     */
    protected Session session;

    /**
     *
     */
    protected SessionFactory factory;

    /**
     *
     */
    public SuperDao() {
    }

    /**
     *
     * @param obj
     */
    protected void saveAndCommitObject(Object obj) {
        session.save(obj);
        session.getTransaction().commit(); //tallennetaan muutokset tietokantaan
    }

    /**
     *
     */
    protected void closeTransaction() {
        if (session != null) {
            session.close(); //suljetaan transaktio
        }
    }

    /**
     *
     * @throws HibernateException
     */
    protected void openAndBeginTransaction() throws HibernateException {
        session = factory.openSession(); // avataan uusi sessio
        session.beginTransaction(); //aloitetaan transaktio
        //kertajasenen tallennus tietokantaan alku
    }

     /**
     *
     * @param sqlException
     */
    protected void throwObjectTrasactionException(Exception sqlException) {
        if (session.getTransaction() != null) {
            session.getTransaction().rollback(); // virhe tapahtui palautetaan kaikki tehdyt muutokset
        }
        sqlException.printStackTrace();
    }

     /**
     *
     * @param obj
     */
    protected void saveOrUpdateObject(Object obj) {
        // päivittää kertajasenen tietoja jasenId perusteella
        // olettaa että jäsen oliolla on sama jasenid kuin päivitettävällä jäsenenllä
        try {
            openAndBeginTransaction(); // avataan uusi sessio
            session.saveOrUpdate(obj);
            session.getTransaction().commit();
        } catch (Exception sqlException) {
            throwObjectTrasactionException(sqlException);
        } finally {
            closeTransaction();
        }
    }

    /**
     *
     * @param obj
     */
    protected void deleteObject(Object obj) {
        session.delete(obj);
        session.getTransaction().commit(); //tallennetaan muutokset tietokantaan
    }
    
   private static final Logger LOG = Logger.getLogger(SuperDao.class.getName());
    
}
