/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entities.KuukausiJasen;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

/**
 *
 * @author Antti Käyhkö
 */
public class KuukausiJasenDao extends JasenDao {

    /**
     * KuukausiJasenDao luokan konstruktori
     *
     * @param factory SessionFactory hibernate sessioita varten
     */
    public KuukausiJasenDao(SessionFactory factory) {
        this.factory = factory;
    }

    /**
     * Lisää KuukausiJasen Olion tietokantaan
     *
     * @param jasen jäsen olio joka lisätään tietokantaan
     */
    public void createKuukausiJasen(KuukausiJasen jasen) {// tallentaa Kuukausijasen Objektin tietokantaam

        try {
            openAndBeginTransaction();
            saveAndCommitJasen(jasen);

        } catch (HibernateException sqlException) {
            throwJasenTrasactionException(sqlException);

        } finally {
            closeTransaction();
        }
    }

    /**
     * Poistaa KuukausiJasenen tietokannasta jasenIdn perusteella
     *
     * @param JasenId Poistettavan KuukausiJasenen JasenId
     */
    public void deleteKuukausiJasen(int JasenId) { // poistaa kuukausijasenen jasenIdn Perusteella
        try {
            openAndBeginTransaction();

            KuukausiJasen poistettavaJasen = getKuukausiJasen(JasenId);
            deleteJasen(poistettavaJasen);
        } catch (HibernateException sqlException) {
            throwJasenTrasactionException(sqlException);

        } finally {
            closeTransaction();
        }
    }

    /**
     * Poistaa KuukausiJasenen tietokannasta sen olion perusteella
     *
     * @param jasen Poistettava KuukausiJasen Olio
     */
    public void deleteKuukausiJasen(KuukausiJasen jasen) { // poistaa kuukausijasenen jasenIdn Perusteella
        try {
            openAndBeginTransaction();

            deleteJasen(jasen);
        } catch (HibernateException sqlException) {
            throwJasenTrasactionException(sqlException);

        } finally {
            closeTransaction();
        }
    }

    /**
     * Päivitää KuukausiJasenen tietokannassa sen Olion perusteella
     *
     * @param jasen päivitettävä KuukausiJasen Olio
     */
    public void updateKuukausiJasen(KuukausiJasen jasen) { // päivittää kuukausijasenen tietoja jasenId perusteella 
        // olettaa että jäsen oliolla on sama jasenid kuin päivitettävällä jäsenenllä
        saveOrUpdateJasen(jasen);
    }

    /**
     * Hakee tietokannasta KuukausiJasen Olion sen jasenIdn perusteella
     *
     * @param jasenId Haettavan KuukausiJasen Olion JasenId
     * @return haettu KuukausiJasen olio jos on olemassa
     */
    public KuukausiJasen getKuukausiJasen(int jasenId) {// hakee kuukausijasenen jasenidn perusteella
        KuukausiJasen haettu = null;
        try {
            openAndBeginTransaction();

            haettu = session.load(KuukausiJasen.class, jasenId);

        } catch (HibernateException sqlException) {
            throwJasenTrasactionException(sqlException);

        } finally {
            if (session != null) {
                session.close(); //suljetaan transaktio
            }
        }
        return haettu;
    }

    /**
     * Hakee listan kaikista KuukausiJasen oliosta
     *
     * @return Lista kaikista KuukausiJasen oliosta jotka on tallennettu
     * tietokantaan
     */
    public List<KuukausiJasen> getALLKuukausiJasen() { // hakee kaikki KuukausiJasenet tietokannasta
        List KuukausiJasenet = null;
        try {
            openAndBeginTransaction();

            KuukausiJasenet = session.createQuery("FROM KuukausiJasen").list();

        } catch (HibernateException sqlException) {
            throwJasenTrasactionException(sqlException);

        } finally {
            closeTransaction();
        }
        return KuukausiJasenet;
    }

    // HAKU NIMELLÄ
    /**
     *
     * @param nimi
     * @return
     */
    public List<KuukausiJasen> getJasen(String nimi) {
        List<KuukausiJasen> lista = null;
        KuukausiJasen eka;
        try {
            openAndBeginTransaction();

            String hqlString = "FROM KuukausiJasen AS haku WHERE nimi = :muuttuja";
            lista = session.createQuery(hqlString).setParameter("muuttuja", nimi).list();
            if (!lista.isEmpty()) {
                    eka = lista.get(0);   
            }else{
                System.out.println("Ei löytynyt");
            }

            session.getTransaction().commit();
        } catch (HibernateException e) {
            throwJasenTrasactionException(e);
        } finally {
            closeTransaction();
        }
        return lista;
    }
    private static final Logger LOG = Logger.getLogger(KuukausiJasenDao.class.getName());

}
