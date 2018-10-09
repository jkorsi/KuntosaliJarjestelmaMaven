package Entities;

import Entities.Jasen;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Antti
 */
@Entity
@Table(name = "kuukausijasenet")
public class KuukausiJasen extends Jasen {

    /**
     * KuukausiJasen luokan konsruktori
     */
    public KuukausiJasen() {
    }

    @Column(name = "kuukaudet_jaljella")
    private int kuukausiaJaljella;

    /**
     * Hae jäsenen kuukaudet jäljellä
     * @return kuukaudet jäljellä
     */
    public int getKuukausiaJaljella() {
        return kuukausiaJaljella;
    }

    /**
     * Aseta jäsenen kuukaudet jäljellä
     * @param kuukausiaJaljella jäsenen kuukaudet jäljellä
     */
    public void setKuukausiaJaljella(int kuukausiaJaljella) {
        this.kuukausiaJaljella = kuukausiaJaljella;
    }

}
