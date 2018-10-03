/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entities.KertaJasen;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Antti Käyhkö
 */
public class KertaJasenDao {

    private static Session session;
    private static SessionFactory factory;

    public static void createKertaJasen(KertaJasen jasen) {// tallentaa Kertajasen Objektin tietokantaam

        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio
            //kertajasenen tallennus tietokantaan alku
            
            
            
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

    public static void deleteKertaJasen(int JasenId) { // poistaa kertajasenen jasenIdn Perusteella
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio
            
            
            
            
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

    public static void updateKertaJasen(int JasenId) { // päivittää kertajasenen tietoja jasenId perusteella
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio
            
            
            
            
            
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

    public static void getKertajasen(int jasenId) {// hakee kertajasenen jasenidn perusteella
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio
            
            
            
            
            
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

    public static void getALLKertajasen() { // hakee kaikki Kertajasenset tietokannasta
        try {
            session = factory.openSession(); // avataan uusi sessio
            session.beginTransaction(); //aloitetaan transaktio
            
            
            
            
            
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
}
