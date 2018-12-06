/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entities.KertaJasen;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;

/**
 *
 * @author Antti Käyhkö
 */
public class KertaJasenDao extends SuperDao {


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
     *
     * @param jasen jäsen olio joka lisätään tietokantaan
     */
    public void createKertaJasen(KertaJasen jasen) {// tallentaa Kertajasen Objektin tietokantaam

        try {
            openAndBeginTransaction();

            saveAndCommitObject(jasen);
        } catch (Exception sqlException) {
            throwObjectTrasactionException(sqlException);

        } finally {
            closeTransaction();
        }
    }


    /**
     * Poistaa Kertajasenen tietokannasta jasenIdn perusteella
     *
     * @param JasenId Poistettavan Kertajasenen JasenId
     */
    public void deleteKertaJasen(int JasenId) { // poistaa kertajasenen jasenIdn Perusteella
        try {
            openAndBeginTransaction();
            //aloitetaan transaktio
            // avataan uusi sessio

            KertaJasen poistettavaJasen = getKertajasen(JasenId);
            deleteObject(poistettavaJasen);
        } catch (Exception sqlException) {
            throwObjectTrasactionException(sqlException);

        } finally {
            closeTransaction();
        }
    }


    /**
     * Poistaa Kertajasenen tietokannasta sen olion perusteella
     *
     * @param jasen Poistettava KertaJasen Olio
     */
    public void deleteKertaJasen(KertaJasen jasen) { // poistaa kertajasenen jasenIdn Perusteella
        try {
            openAndBeginTransaction(); // avataan uusi sessio

             deleteObject(jasen);
        } catch (Exception sqlException) {
            throwObjectTrasactionException(sqlException);
            // virhe tapahtui palautetaan kaikki tehdyt muutokset

        } finally {
            closeTransaction();
        }
    }

    /**
     * Päivitää Kertajasenen tietokannassa sen Olion perusteella
     *
     * @param jasen päivitettävä Kertajasen Olio
     */
    public void updateKertaJasen(KertaJasen jasen) {
        saveOrUpdateObject(jasen);
    }


    /**
     * Hakee tietokannasta Kertajasen Olion sen jasenIdn perusteella
     *
     * @param jasenId Haettavan KertaJasen Olion JasenId
     * @return haettu kertajasen olio jos on olemassa
     */
    public KertaJasen getKertajasen(int jasenId) {// hakee kertajasenen jasenidn perusteella
        KertaJasen haettu = null;
        try {
            openAndBeginTransaction(); // avataan uusi sessio

            haettu = (KertaJasen) session.load(KertaJasen.class, jasenId);

        } catch (Exception sqlException) {
            throwObjectTrasactionException(sqlException);

        } finally {
            closeTransaction();
        }
        return haettu;
    }

    /**
     * Hakee listan kaikista KertaJasen oliosta
     *
     * @return Lista kaikista Kertajasen oliosta jotka on tallennettu
     * tietokantaan
     */
    public List<KertaJasen> getALLKertajasen() { // hakee kaikki Kertajasenset tietokannasta
        List kertaJasenet = null;
        try {
            openAndBeginTransaction(); // avataan uusi sessio

            kertaJasenet = session.createQuery("FROM KertaJasen").list();

        } catch (Exception sqlException) {
            throwObjectTrasactionException(sqlException);

        } finally {
            closeTransaction();
        }
        return kertaJasenet;
    }

        /**
     * Hakee KertaJasen-olioita annetulla nimellä
     *
     * @return Lista kaikista KertaJasen-olioista, joiden nimi vastaa annettua String-parametria
     */
    public List<KertaJasen> getJasen(String nimi) {
        List<KertaJasen> haku = null;
        try {
            openAndBeginTransaction();

            String hqlString = "FROM KertaJasen AS haku WHERE nimi = :muuttuja";
            haku = session.createQuery(hqlString).setParameter("muuttuja", nimi).list();
            session.getTransaction().commit();
        } catch (Exception e) {
            throwObjectTrasactionException(e);
        } finally {
            closeTransaction();
        }
        return haku;
    }

    private static final Logger LOG = Logger.getLogger(KertaJasenDao.class.getName());
}
