package otp.mavenkuntosalijarjestelma;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Antti
 */
@Entity
public class Maksujarjestelma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maksuJarjestelmaID")
    private int maksuJarjestelmaID;
    
    @Column(name = "tilillaJaljella")
    private int tilillaJaljella;
    
    @Column(name = "tulot")
    private int tulot;
    
    @Column(name = "menot")
    private int menot;

    /**
     * Maksujarjestelman konstruktori
     */
    public Maksujarjestelma() {
    }

    /**
     * Hea MaksuJarjesteltelman idn
     * @return
     */
    public int getMaksuJarjestelmaID() {
        return maksuJarjestelmaID;
    }

    /**
     *
     * @param maksuJarjestelmaID
     */
    public void setMaksuJarjestelmaID(int maksuJarjestelmaID) {
        this.maksuJarjestelmaID = maksuJarjestelmaID;
    }

    /**
     *
     * @return
     */
    public int getTilillaJaljella() {
        return tilillaJaljella;
    }

    /**
     *
     * @param tilillaJaljella
     */
    public void setTilillaJaljella(int tilillaJaljella) {
        this.tilillaJaljella = tilillaJaljella;
    }

    /**
     *
     * @return
     */
    public int getTulot() {
        return tulot;
    }

    /**
     *
     * @param tulot
     */
    public void setTulot(int tulot) {
        this.tulot = tulot;
    }

    /**
     *
     * @return
     */
    public int getMenot() {
        return menot;
    }

    /**
     *
     * @param menot
     */
    public void setMenot(int menot) {
        this.menot = menot;
    }

}
