/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entities.Jasen;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author juhos
 */
public class JasenDao {
    
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
    public JasenDao() {
    }

    /**
     *
     * @param jasen
     */
    protected void saveAndCommitJasen(Jasen jasen) {
        session.save(jasen);
        //kertajasenen tallennus tietokantaan loppu
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
    protected void throwJasenTrasactionException(Exception sqlException) {
        if (session.getTransaction() != null) {
            session.getTransaction().rollback(); // virhe tapahtui palautetaan kaikki tehdyt muutokset
        }
    }

    /**
     *
     * @param jasen
     */
    protected void saveOrUpdateJasen(Jasen jasen) {
        // päivittää kertajasenen tietoja jasenId perusteella
        // olettaa että jäsen oliolla on sama jasenid kuin päivitettävällä jäsenenllä
        try {
            openAndBeginTransaction(); // avataan uusi sessio
            session.saveOrUpdate(jasen);
            session.getTransaction().commit();
        } catch (HibernateException sqlException) {
            throwJasenTrasactionException(sqlException);
        } finally {
            closeTransaction();
        }
    }

    /**
     *
     * @param jasen
     */
    protected void deleteJasen(Jasen jasen) {
        session.delete(jasen);
        session.getTransaction().commit(); //tallennetaan muutokset tietokantaan
    }
    private static final Logger LOG = Logger.getLogger(JasenDao.class.getName());
    
}
