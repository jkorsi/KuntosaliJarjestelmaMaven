package Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Table(name = "jasenet")
public abstract class Jasen {

    @Column(name = "nimi")
    private String nimi;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jasen_ID")
    private int jasenNro;

    @Column(name = "maksutapa")
    private String maksuTapa;

    @Column(name = "jasenyysvoimassa")
    private boolean onkoJasenyysVoimassa;

    public Jasen() {

    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getJasenNro() {
        return jasenNro;
    }

    public void setJasenNro(int jasenNro) {
        this.jasenNro = jasenNro;
    }

    public String getMaksuTapa() {
        return maksuTapa;
    }

    public void setMaksuTapa(String maksuTapa) {
        this.maksuTapa = maksuTapa;
    }

    public boolean isOnkoJasenyysVoimassa() {
        return onkoJasenyysVoimassa;
    }

    public void setOnkoJasenyysVoimassa(boolean onkoJasenyysVoimassa) {
        this.onkoJasenyysVoimassa = onkoJasenyysVoimassa;
    }

}
