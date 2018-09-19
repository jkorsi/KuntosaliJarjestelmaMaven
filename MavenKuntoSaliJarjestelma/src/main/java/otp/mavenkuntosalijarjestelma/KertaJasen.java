package otp.mavenkuntosalijarjestelma;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.Table;

@Entity
//@Table(name = "kerta_jasenet")
public class KertaJasen extends Jasen {

    @Column(name = "kayntikerrat")
    private int kayntikertojaJaljella;

    public KertaJasen() {
    }

    public KertaJasen(int kayntikertojaJaljella) {
        this.kayntikertojaJaljella = kayntikertojaJaljella;
    }

    public int getKayntikertojaJaljella() {
        return kayntikertojaJaljella;
    }

    public void setKayntikertojaJaljella(int kayntikertojaJaljella) {
        this.kayntikertojaJaljella = kayntikertojaJaljella;
    }

}
