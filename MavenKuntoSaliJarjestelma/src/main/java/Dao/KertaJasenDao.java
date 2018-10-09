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
    /**
     * KertajasenDao luokan konstruktori
     * 
     * @param factory SessionFactory hibernate sessioita varten
     */
    public KertaJasenDao(SessionFactory factory) {
        this.factory = factory;
    }

    /**
     * Lisää KertaJasen Olion tietokantaan
     * @param jasen jäsen olio joka lisätään tietokantaan
     */
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
    /**
     * Poistaa Kertajasenen tietokannasta jasenIdn perusteella
     * @param JasenId Poistettavan Kertajasenen JasenId
     */
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
    /**
     * Poistaa Kertajasenen tietokannasta sen olion perusteella
     * @param jasen Poistettava KertaJasen Olio
     */
    public void deleteKertaJasen(KertaJasen jasen) { // poistaa kertajasenen jasenIdn Perusteella
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio

            session.delete(jasen);

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
    /**
     * Päivitää Kertajasenen tietokannassa sen Olion perusteella
     * @param jasen päivitettävä Kertajasen Olio
     */
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
    /**
     * Hakee tietokannasta Kertajasen Olion sen jasenIdn perusteella
     * @param jasenId Haettavan KertaJasen Olion JasenId
     * @return haettu kertajasen olio jos on olemassa
     */
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
    /**
     * Hakee listan kaikista KertaJasen oliosta
     * @return Lista kaikista Kertajasen oliosta jotka on tallennettu tietokantaan
     */
    public List<KertaJasen> getALLKertajasen() { // hakee kaikki Kertajasenset tietokannasta
        List kertaJasenet = null;
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio

            kertaJasenet = session.createQuery("FROM KertaJasen").list();

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
