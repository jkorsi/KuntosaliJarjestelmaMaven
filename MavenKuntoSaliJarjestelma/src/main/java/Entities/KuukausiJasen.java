package Entities;

import Entities.Jasen;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "kuukausijasenet")
public class KuukausiJasen extends Jasen {

    public KuukausiJasen() {
    }

    @Column(name = "kuukaudet_jaljella")
    private int kuukausiaJaljella;

    public int getKuukausiaJaljella() {
        return kuukausiaJaljella;
    }

    public void setKuukausiaJaljella(int kuukausiaJaljella) {
        this.kuukausiaJaljella = kuukausiaJaljella;
    }

}