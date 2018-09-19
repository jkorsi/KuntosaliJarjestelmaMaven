package otp.mavenkuntosalijarjestelma;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class KuukausiJasen extends Jasen {

    @Column(name = "kuukaudet_jaljella")
    private int kuukausiaJaljella;

    public int getKuukausiaJaljella() {
        return kuukausiaJaljella;
    }

    public void setKuukausiaJaljella(int kuukausiaJaljella) {
        this.kuukausiaJaljella = kuukausiaJaljella;
    }

}
