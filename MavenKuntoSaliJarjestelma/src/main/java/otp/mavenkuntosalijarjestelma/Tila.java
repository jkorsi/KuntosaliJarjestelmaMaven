package otp.mavenkuntosalijarjestelma;

import javax.persistence.Id;

public class Tila {

    @Id
    private int tilaID;

    private int suosituinKuntoSaliLaite;

    private int laitteidenMaara;

    private int tilanKulut;

    private Kuntosalilaite[] kuntosalilaite;

    public Tila() {
    }

    public Tila(int tilaID, int suosituinKuntoSaliLaite, int laitteidenMaara, int tilanKulut, Kuntosalilaite[] kuntosalilaite) {
        this.tilaID = tilaID;
        this.suosituinKuntoSaliLaite = suosituinKuntoSaliLaite;
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
        return suosituinKuntoSaliLaite;
    }

    public void setSuosituinKuntoSaliLaite(int suosituinKuntoSaliLaite) {
        this.suosituinKuntoSaliLaite = suosituinKuntoSaliLaite;
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
