package otp.mavenkuntosalijarjestelma;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Maksujarjestelma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maksuJarjestelmaID")
    private int maksuJarjestelmaID;

    private int tilillaJaljella;

    private int tulot;

    private int menot;

    private int attribute0;

    private jasenMaksu[] jasenMaksu;

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

    public int getAttribute0() {
        return attribute0;
    }

    public void setAttribute0(int attribute0) {
        this.attribute0 = attribute0;
    }

    public jasenMaksu[] getJasenMaksu() {
        return jasenMaksu;
    }

    public void setJasenMaksu(jasenMaksu[] jasenMaksu) {
        this.jasenMaksu = jasenMaksu;
    }

    

}
