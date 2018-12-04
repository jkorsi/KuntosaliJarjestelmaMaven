package Entities;

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
@Table(name = "kuntosalilaitteet")
public class Kuntosalilaite {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "kuntosalilaite_ID")
    private int kuntosalilaiteID;
    
    @Column(name = "ika")
    private int ika;
    
    @Column(name = "kunto")
    private String kunto;
    
    @Column(name = "tarvitseeHuollon") 
    private boolean tarvitseeHuollon;
    
    @Column(name = "kayttokerrat")
    private int kayttakerrat;

    @Column(name = "Viimeisin_Huolto_Pvm")
    private String viimeisinHuoltoPvm;

    @Column(name = "tila_ID")
    private Tila tilaID;

    /**
     * KuntosaLilaite luokan konstruktori
     */
    public Kuntosalilaite() {
    }

    /**
     * Luo kuntosaliLaite
     * @param ika laitteen ikä
     * @param kunto laitteen kunto 
     * @param tarvitseeHuollon tarvitseeko laite huollon
     * @param kayttakerrat montako kertaa laitetta on käytetty
     * @param viimeisinHuoltoPvm päivämäärä milloin laite on viimeksi huollettu
     * @param tila tila jossa kuntosaliLaite sijaitsee
     */
    public Kuntosalilaite(int ika, String kunto, boolean tarvitseeHuollon, int kayttakerrat, String viimeisinHuoltoPvm, Tila tila) {
        this.ika = ika;
        this.kunto = kunto;
        this.tarvitseeHuollon = tarvitseeHuollon;
        this.kayttakerrat = kayttakerrat;
        this.viimeisinHuoltoPvm = viimeisinHuoltoPvm;
        this.tilaID = tila;
    }

    /**
     * Hae kuntosalilaitteen ikä
     * @return int ika
     */
    public int getIka() {
        return ika;
    }

    /**
     *  Aseta kuntosalilaitteen ikä 
     * @param ika int ikä
     */
    public void setIka(int ika) {
        this.ika = ika;
    }

    /**
     * Hae Laitten kunto
     * @return String kunto
     */
    public String getKunto() {
        return kunto;
    }

    /**
     *  Aseta laitteen kunto
     * @param kunto String kunto
     */
    public void setKunto(String kunto) {
        this.kunto = kunto;
    }

    /**
     * Tarvitseeko laite huollon
     * @return boolean 
     */
    public boolean isTarvitseeHuollon() {
        return tarvitseeHuollon;
    }

    /**
     *  Aseta tarvitseeko laite huollon
     * @param tarvitseeHuollon boolean
     */
    public void setTarvitseeHuollon(boolean tarvitseeHuollon) {
        this.tarvitseeHuollon = tarvitseeHuollon;
    }

    /**
     * Hae laitteen käyttökerrat
     * @return int käyttökerrat
     */
    public int getKayttakerrat() {
        return kayttakerrat;
    }

    /**
     * Aseta Laitteen käyttökerrat
     * @param kayttakerrat käyttökerrat
     */
    public void setKayttakerrat(int kayttakerrat) {
        this.kayttakerrat = kayttakerrat;
    }

    /**
     * Hae viimeisin huolto pvm
     * @return  viimeisin huolto pvm
     */
    public String getViimeisinHuoltoPvm() {
        return viimeisinHuoltoPvm;
    }

    /**
     * Aseta viimeisin huolto pvm
     * @param viimeisinHuoltoPvm viimeisin huolto pvm
     */
    public void setViimeisinHuoltoPvm(String viimeisinHuoltoPvm) {
        this.viimeisinHuoltoPvm = viimeisinHuoltoPvm;
    }

    /**
     * Hae tila jossa laite on
     * @return tila jossa laite on
     */
    public Tila getTila() {
        return tilaID;
    }

    /**
     * Aseta tila jossa laite on
     * @param tila tila jossa laite on
     */
    public void setTila(Tila tila) {
        this.tilaID = tila;
    }
    private static final Logger LOG = Logger.getLogger(Kuntosalilaite.class.getName());

}
