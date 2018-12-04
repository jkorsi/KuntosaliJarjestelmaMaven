package Entities;
import javax.persistence.*;

@Entity
@Table(name="kayttajat")
public class Kayttaja {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private int id;

    @Column(name="etunimi")
    private String etunimi;

    @Column(name="sukunimi")
    private String sukunimi;

    @Column(name="tunnus")
    private String tunnus;

    @Column(name="salasana")
    private String salasana;

    @Column(name="esimies_status")
    private boolean esimies_status;

    public Kayttaja() {
    }

    public Kayttaja(String etunimi, String sukunimi, String tunnus, String pw, boolean status) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.tunnus = tunnus;
        this.salasana = pw;
        this.esimies_status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int tyontekijaId) {
        this.id = tyontekijaId;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getTunnus() {
        return tunnus;
    }

    public void setTunnus(String tunnus) {
        this.tunnus = tunnus;
    }

    public String getSalasana() {
        return salasana;
    }

    public void setSalasana(String salasana) {
        this.salasana = salasana;
    }

    public boolean getEsimiesStatus() {
        return this.esimies_status;
    }
}
