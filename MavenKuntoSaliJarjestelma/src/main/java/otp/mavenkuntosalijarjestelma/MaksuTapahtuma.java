package otp.mavenkuntosalijarjestelma;

//import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

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
    public MaksuTapahtuma() {
    }

    //Getterit ja setterit    
    public int getTapahtumaAika() {
        return tapahtumaAika;
    }

    public void setTapahtumaAika(int tapahtumaAika) {
        this.tapahtumaAika = tapahtumaAika;
    }

    public int getMaara() {
        return maara;
    }

    public void setMaara(int maara) {
        this.maara = maara;
    }

    public int getTuloVaiMeno() {
        return tuloVaiMeno;
    }

    public void setTuloVaiMeno(int tuloVaiMeno) {
        this.tuloVaiMeno = tuloVaiMeno;
    }

    public String getKommentti() {
        return kommentti;
    }

    public void setKommentti(String kommentti) {
        this.kommentti = kommentti;
    }

    public int getViite() {
        return viite;
    }

    public void setViite(int viite) {
        this.viite = viite;
    }

    public String getMaksuTapa() {
        return maksuTapa;
    }

    public void setMaksuTapa(String maksuTapa) {
        this.maksuTapa = maksuTapa;
    }

}
