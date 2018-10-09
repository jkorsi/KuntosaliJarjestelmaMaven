package Entities;

//import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Antti
 */
@MappedSuperclass
@Table(name = "maksuTapahtumat")
public class MaksuTapahtuma {

    @Column(name = "tapahtumaAika")
    private int tapahtumaAika;

    @Column(name = "maara")
    private int maara;

    @Column(name = "tuloVaiMeno")
    private int tuloVaiMeno;

    @Column(name = "kommentti")
    private String kommentti;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Viite_ID")
    private int viite;

    @Column(name = "maksuTapa")
    private String maksuTapa;

    //Konstruktori

    /**
     * Maksutapahtuma konstruktori
     */
    public MaksuTapahtuma() {
    }

    //Getterit ja setterit    

    /**
     *  Hae Maksutapahtuman aika
     * @return Maksutapahtuman aika
     */
    public int getTapahtumaAika() {
        return tapahtumaAika;
    }

    /**
     * Aseta Maksutapahtuma
     * @param tapahtumaAika
     */
    public void setTapahtumaAika(int tapahtumaAika) {
        this.tapahtumaAika = tapahtumaAika;
    }

    /**
     * Hae Maksutapahtuman määrä
     * @return int Maksutapahtuman määrä
     */
    public int getMaara() {
        return maara;
    }

    /**
     * Aseta Maksutapahtuman määrä
     * @param maara Maksutapahtuman määrä
     */
    public void setMaara(int maara) {
        this.maara = maara;
    }

    /**
     *  Hae onko Maksutapahtuma tulo vai meno
     * @return int oliko Maksutapahtuma tulo vai meno
     */
    public int getTuloVaiMeno() {
        return tuloVaiMeno;
    }

    /**
     *  Aseta Onko Maksutapahtuma tulo vai meno
     * @param tuloVaiMeno
     */
    public void setTuloVaiMeno(int tuloVaiMeno) {
        this.tuloVaiMeno = tuloVaiMeno;
    }

    /**
     * Hae Maksutapahtuman kommentti
     * @return kommentti
     */
    public String getKommentti() {
        return kommentti;
    }

    /**
     * Aseta Maksutapahtuman kommentti
     * @param kommentti Maksutapahtuman kommentti
     */
    public void setKommentti(String kommentti) {
        this.kommentti = kommentti;
    }

    /**
     *  Hae Maksutapahtuman viite
     * @return viite
     */
    public int getViite() {
        return viite;
    }

    /**
     * Aseta Maksutapahtuman viite
     * @param viite viite
     */
    public void setViite(int viite) {
        this.viite = viite;
    }

    /**
     * Hae Maksutapahtuman maksutapa
     * @return
     */
    public String getMaksuTapa() {
        return maksuTapa;
    }

    /**
     * Aseta Maksutapahtuman maksutapa
     * @param maksuTapa Maksutapahtuman maksutapa
     */
    public void setMaksuTapa(String maksuTapa) {
        this.maksuTapa = maksuTapa;
    }

}
