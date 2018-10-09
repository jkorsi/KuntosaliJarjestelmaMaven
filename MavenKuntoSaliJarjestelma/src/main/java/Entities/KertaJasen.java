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
@Table(name = "kertajasenet")
public class KertaJasen extends Jasen {

    @Column(name = "kayntikerrat")
    private int kayntikertojaJaljella;

    /**
     * Kertajasen luokan konstruktori
     */
    public KertaJasen() {
    }

    /**
     * Ketajasen luokan konstruktori
     * @param kayntikertojaJaljella int käyntikertojaJaljella
     */
    public KertaJasen(int kayntikertojaJaljella) {
        this.kayntikertojaJaljella = kayntikertojaJaljella;
    }

    /**
     * Hae KäyntikertojaJaljella
     * @return int KäyntikertojaJaljella
     */
    public int getKayntikertojaJaljella() {
        return kayntikertojaJaljella;
    }

    /**
     * Aseta KäyntikertojaJaljella
     * @param kayntikertojaJaljella int KäyntikertojaJaljella
     */
    public void setKayntikertojaJaljella(int kayntikertojaJaljella) {
        this.kayntikertojaJaljella = kayntikertojaJaljella;
    }

}
