/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entities.KertaJasen;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Antti Käyhkö
 */
public class KertaJasenDao {

    private Session session;
    private SessionFactory factory;

    public KertaJasenDao(SessionFactory factory) {
        this.factory = factory;
    }

    public void createKertaJasen(KertaJasen jasen) {// tallentaa Kertajasen Objektin tietokantaam

        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio
            //kertajasenen tallennus tietokantaan alku

            session.save(jasen);

            //kertajasenen tallennus tietokantaan loppu
            session.getTransaction().commit();//tallennetaan muutokset tietokantaan
        } catch (Exception sqlException) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();// virhe tapahtui palautetaan kaikki tehdyt muutokset
            }
            sqlException.printStackTrace();

        } finally {
            if (session != null) {
                session.close(); //suljetaan transaktio
            }
        }
    }

    public void deleteKertaJasen(int JasenId) { // poistaa kertajasenen jasenIdn Perusteella
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio

            KertaJasen poistettavaJasen = getKertajasen(JasenId);
            session.delete(poistettavaJasen);

            session.getTransaction().commit();//tallennetaan muutokset tietokantaan
        } catch (Exception sqlException) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();// virhe tapahtui palautetaan kaikki tehdyt muutokset
            }
            sqlException.printStackTrace();

        } finally {
            if (session != null) {
                session.close(); //suljetaan transaktio
            }
        }
    }

    public void updateKertaJasen(KertaJasen jasen) { // päivittää kertajasenen tietoja jasenId perusteella 
        // olettaa että jäsen oliolla on sama jasenid kuin päivitettävällä jäsenenllä
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio

            session.saveOrUpdate(jasen);

            session.getTransaction().commit();
        } catch (Exception sqlException) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();// virhe tapahtui palautetaan kaikki tehdyt muutokset
            }
            sqlException.printStackTrace();

        } finally {
            if (session != null) {
                session.close(); //suljetaan transaktio
            }
        }
    }

    public KertaJasen getKertajasen(int jasenId) {// hakee kertajasenen jasenidn perusteella
        KertaJasen haettu = null;
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio

            haettu = (KertaJasen) session.load(KertaJasen.class, jasenId);

        } catch (Exception sqlException) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();// virhe tapahtui palautetaan kaikki tehdyt muutokset
            }
            sqlException.printStackTrace();

        } finally {
            if (session != null) {
                session.close(); //suljetaan transaktio
            }
        }
        return haettu;
    }

    public List getALLKertajasen() { // hakee kaikki Kertajasenset tietokannasta
        List kertaJasenet = null;
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio

            kertaJasenet = session.createQuery("FROM kertajasenet").list();

        } catch (Exception sqlException) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();// virhe tapahtui palautetaan kaikki tehdyt muutokset
            }
            sqlException.printStackTrace();

        } finally {
            if (session != null) {
                session.close(); //suljetaan transaktio
            }
        }
        return kertaJasenet;
    }
}
