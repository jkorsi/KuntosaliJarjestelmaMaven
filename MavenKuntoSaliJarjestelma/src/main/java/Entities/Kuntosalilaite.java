package Entities;

import Entities.Tila;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kuntosalilaitteet")
public abstract class Kuntosalilaite {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Kuntosalilaite() {
    }

    public Kuntosalilaite(int ika, String kunto, boolean tarvitseeHuollon, int kayttakerrat, String viimeisinHuoltoPvm, Tila tila) {
        this.ika = ika;
        this.kunto = kunto;
        this.tarvitseeHuollon = tarvitseeHuollon;
        this.kayttakerrat = kayttakerrat;
        this.viimeisinHuoltoPvm = viimeisinHuoltoPvm;
        this.tilaID = tila;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    public String getKunto() {
        return kunto;
    }

    public void setKunto(String kunto) {
        this.kunto = kunto;
    }

    public boolean isTarvitseeHuollon() {
        return tarvitseeHuollon;
    }

    public void setTarvitseeHuollon(boolean tarvitseeHuollon) {
        this.tarvitseeHuollon = tarvitseeHuollon;
    }

    public int getKayttakerrat() {
        return kayttakerrat;
    }

    public void setKayttakerrat(int kayttakerrat) {
        this.kayttakerrat = kayttakerrat;
    }

    public String getViimeisinHuoltoPvm() {
        return viimeisinHuoltoPvm;
    }

    public void setViimeisinHuoltoPvm(String viimeisinHuoltoPvm) {
        this.viimeisinHuoltoPvm = viimeisinHuoltoPvm;
    }

    public Tila getTila() {
        return tilaID;
    }

    public void setTila(Tila tila) {
        this.tilaID = tila;
    }

}
