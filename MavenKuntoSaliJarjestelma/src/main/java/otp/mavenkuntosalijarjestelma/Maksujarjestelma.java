package otp.mavenkuntosalijarjestelma;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    public Maksujarjestelma() {
    }

    public int getMaksuJarjestelmaID() {
        return maksuJarjestelmaID;
    }

    public void setMaksuJarjestelmaID(int maksuJarjestelmaID) {
        this.maksuJarjestelmaID = maksuJarjestelmaID;
    }

    public int getTilillaJaljella() {
        return tilillaJaljella;
    }

    public void setTilillaJaljella(int tilillaJaljella) {
        this.tilillaJaljella = tilillaJaljella;
    }

    public int getTulot() {
        return tulot;
    }

    public void setTulot(int tulot) {
        this.tulot = tulot;
    }

    public int getMenot() {
        return menot;
    }

    public void setMenot(int menot) {
        this.menot = menot;
    }

}
