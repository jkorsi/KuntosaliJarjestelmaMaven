package otp.mavenkuntosalijarjestelma;

//import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "maksuTapahtumat")
public class MaksuTapahtumaItem {

    private int tapahtumaAika;

    private int maara;

    private int tuloVaiMeno;

    private String kommentti;

    private int viite;

    private String maksuTapa;

    private MaksuTapahtumaLista maksuTapahtumaLista;

    //Konstruktori
    public MaksuTapahtumaItem() {
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

    public MaksuTapahtumaLista getMaksuTapahtumaLista() {
        return maksuTapahtumaLista;
    }

    public void setMaksuTapahtumaLista(MaksuTapahtumaLista maksuTapahtumaLista) {
        this.maksuTapahtumaLista = maksuTapahtumaLista;
    }

}
