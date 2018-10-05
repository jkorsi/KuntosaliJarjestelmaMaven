/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entities.KuukausiJasen;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Antti Käyhkö
 */
public class KuukausiJasenDao {

    private Session session;
    private SessionFactory factory;

    public KuukausiJasenDao(SessionFactory factory) {
        this.factory = factory;
    }

    public void createKuukausiJasen(KuukausiJasen jasen) {// tallentaa Kuukausijasen Objektin tietokantaam

        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio
            //kuukausijasenenjasenen tallennus tietokantaan alku

            session.save(jasen);

            //kuukausijasenen tallennus tietokantaan loppu
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

    public void deleteKuukausiJasen(int JasenId) { // poistaa kuukausijasenen jasenIdn Perusteella
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio

            KuukausiJasen poistettavaJasen = getKuukausiJasen(JasenId);
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

    public void updateKuukausiJasen(KuukausiJasen jasen) { // päivittää kuukausijasenen tietoja jasenId perusteella 
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

    public KuukausiJasen getKuukausiJasen(int jasenId) {// hakee kuukausijasenen jasenidn perusteella
        KuukausiJasen haettu = null;
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio

            haettu = (KuukausiJasen) session.load(KuukausiJasen.class, jasenId);

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

    public List getALLKuukausiJasen() { // hakee kaikki KuukausiJasenet tietokannasta
        List KuukausiJasenet = null;
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio

            KuukausiJasenet = session.createQuery("FROM kuukausijasenet").list();

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
        return KuukausiJasenet;
    }
}


