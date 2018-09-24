package otp.mavenkuntosalijarjestelma;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tilat")
public class Tila implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tilaID")
    private int tilaID;

    @Column(name = "suosituinLaite_ID")
    private int suosituinLaite_ID;
    
    @Column(name = "laitteidenMaara")
    private int laitteidenMaara;
    
    @Column(name = "tilanKulut")
    private int tilanKulut;
    
    @Column(name = "kuntosalilaite")
    private Kuntosalilaite[] kuntosalilaite;
    
    
    public Tila() {
    }

    public Tila(int tilaID, int suosituinKuntoSaliLaite, int laitteidenMaara, int tilanKulut, Kuntosalilaite[] kuntosalilaite) {
        this.tilaID = tilaID;
        this.suosituinLaite_ID = suosituinKuntoSaliLaite;
        this.laitteidenMaara = laitteidenMaara;
        this.tilanKulut = tilanKulut;
        this.kuntosalilaite = kuntosalilaite;
    }

    public int getTilaID() {
        return tilaID;
    }

    public void setTilaID(int tilaID) {
        this.tilaID = tilaID;
    }

    public int getSuosituinKuntoSaliLaite() {
        return suosituinLaite_ID;
    }

    public void setSuosituinKuntoSaliLaite(int suosituinKuntoSaliLaite) {
        this.suosituinLaite_ID = suosituinKuntoSaliLaite;
    }

    public int getLaitteidenMaara() {
        return laitteidenMaara;
    }

    public void setLaitteidenMaara(int laitteidenMaara) {
        this.laitteidenMaara = laitteidenMaara;
    }

    public int getTilanKulut() {
        return tilanKulut;
    }

    public void setTilanKulut(int tilanKulut) {
        this.tilanKulut = tilanKulut;
    }

    public Kuntosalilaite[] getKuntosalilaite() {
        return kuntosalilaite;
    }

    public void setKuntosalilaite(Kuntosalilaite[] kuntosalilaite) {
        this.kuntosalilaite = kuntosalilaite;
    }

}
