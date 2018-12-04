package otp.mavenkuntosalijarjestelma;

import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

/**
 *
 * @author Antti
 */
@Entity
public class Maksujarjestelma {

    @Id
    @GeneratedValue(strategy = IDENTITY)
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
     * Hae MaksuJarjesteltelman idn
     * @return MaksuJarjesteltelman id
     */
    public int getMaksuJarjestelmaID() {
        return maksuJarjestelmaID;
    }

    /**
     * Aseta MaksuJarjesteltelman id
     * @param maksuJarjestelmaID MaksuJarjesteltelman id
     */
    public void setMaksuJarjestelmaID(int maksuJarjestelmaID) {
        this.maksuJarjestelmaID = maksuJarjestelmaID;
    }

    /**
     * Hae paljonko tilillä on jäljellä
     * @return paljonko tilillä on jäljellä
     */
    public int getTilillaJaljella() {
        return tilillaJaljella;
    }

    /**
     * Aseta paljonko tilillä on jäljellä
     * @param tilillaJaljella paljonko tilillä on jäljellä
     */
    public void setTilillaJaljella(int tilillaJaljella) {
        this.tilillaJaljella = tilillaJaljella;
    }

    /**
     * Hae Tulot
     * @return tulot
     */
    public int getTulot() {
        return tulot;
    }

    /**
     * Aseta tulot
     * @param tulot per kk
     */
    public void setTulot(int tulot) {
        this.tulot = tulot;
    }

    /**
     * Hae menot
     * @return menot per kk
     */
    public int getMenot() {
        return menot;
    }

    /**
     * Aseta menot
     * @param menot per kk
     */
    public void setMenot(int menot) {
        this.menot = menot;
    }
    private static final Logger LOG = Logger.getLogger(Maksujarjestelma.class.getName());

}
