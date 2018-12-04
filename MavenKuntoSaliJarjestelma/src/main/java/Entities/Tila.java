package Entities;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Antti
 */
@Entity
@Table(name = "tilat")
public class Tila implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
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
    
    /**
     * Tila luokan konstruktori
     */
    public Tila() {
    }

    /**
     * Luo tila olio
     * @param tilaID tila id
     * @param suosituinKuntoSaliLaite suosituin kuntolaite
     * @param laitteidenMaara kuntolaitteiden määrä
     * @param tilanKulut tilan kulut per kk
     * @param kuntosalilaite kuntosalletetaulu
     */
    public Tila(int tilaID, int suosituinKuntoSaliLaite, int laitteidenMaara, int tilanKulut, Kuntosalilaite[] kuntosalilaite) {
        this.tilaID = tilaID;
        this.suosituinLaite_ID = suosituinKuntoSaliLaite;
        this.laitteidenMaara = laitteidenMaara;
        this.tilanKulut = tilanKulut;
        this.kuntosalilaite = kuntosalilaite;
    }

    /**
     * Hae tilan id
     * @return tilan id
     */
    public int getTilaID() {
        return tilaID;
    }

    /**
     * Aseta tilan id
     * @param tilaID tilan id
     */
    public void setTilaID(int tilaID) {
        this.tilaID = tilaID;
    }

    /**
     * Hae tilaun suosituin laite
     * @return tilan suosituin laite
     */
    public int getSuosituinKuntoSaliLaite() {
        return suosituinLaite_ID;
    }

    /**
     * Aseta Tilan suosituin laite
     * @param suosituinKuntoSaliLaite suosituin laite
     */
    public void setSuosituinKuntoSaliLaite(int suosituinKuntoSaliLaite) {
        this.suosituinLaite_ID = suosituinKuntoSaliLaite;
    }

    /**
     *  Hae tilassa olevien laitteiden määrä
     * @return kuntosaliLaitteiden määrä
     */
    public int getLaitteidenMaara() {
        return laitteidenMaara;
    }

    /**
     * Aseta Tilassa Olevien laitteiden määrä
     * @param laitteidenMaara kuntosalilaitteiden määrä
     */
    public void setLaitteidenMaara(int laitteidenMaara) {
        this.laitteidenMaara = laitteidenMaara;
    }

    /**
     * Hae tilan kulut per kk
     * @return tilan kulut per kk
     */
    public int getTilanKulut() {
        return tilanKulut;
    }

    /**
     * Aseta Tilan kulut
     * @param tilanKulut tilan kulut per kk
     */
    public void setTilanKulut(int tilanKulut) {
        this.tilanKulut = tilanKulut;
    }

    /**
     *  Hae tilan laitteet
     * @return tilan laitteet
     */
    public Kuntosalilaite[] getKuntosalilaite() {
        return kuntosalilaite;
    }

    /**
     * Aseta tilan laittet
     * @param kuntosalilaite aseta kuntosalilaittet
     */
    public void setKuntosalilaite(Kuntosalilaite[] kuntosalilaite) {
        this.kuntosalilaite = kuntosalilaite;
    }
    private static final Logger LOG = Logger.getLogger(Tila.class.getName());

}
