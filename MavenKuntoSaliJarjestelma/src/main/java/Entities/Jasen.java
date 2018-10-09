package Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 *
 * @author Antti
 */
@MappedSuperclass
@Table(name = "jasenet")
public abstract class Jasen {

    @Column(name = "nimi")
    private String nimi;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jasen_ID")
    private int jasenID;

    @Column(name = "maksutapa")
    private String maksuTapa;

    @Column(name = "jasenyysvoimassa")
    private boolean onkoJasenyysVoimassa;

    /**
     * Jasen luokan konstruktori
     */
    public Jasen() {

    }

    /**
     *
     * @return Jäsenen nimi
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * Aseta Jäsenen nimi
     * @param nimi
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     *  Palauttaa jäsenen jäsenIdn
     * @return jäsenen jäsenId
     */
    public int getJasenID() {
        return jasenID;
    }

    /**
     *  Aseta Jääsenen Jäsenid
     * @param jasenID jäsenen jäsenID
     */
    public void setJasenID(int jasenID) {
        this.jasenID = jasenID;
    }

    /**
     * Palauta maksutapa
     * @return palauttaa jäsenen maksutavan
     */
    public String getMaksuTapa() {
        return maksuTapa;
    }

    /**
     *  Aseta Jäsenen maksutapa
     * @param maksuTapa Jäsenene maksutapa
     */
    public void setMaksuTapa(String maksuTapa) {
        this.maksuTapa = maksuTapa;
    }

    /**
     * Tarkista onkoJäsenyysVoimassa
     * @return boolean onkoJäsenyysVoimassa
     */
    public boolean isOnkoJasenyysVoimassa() {
        return onkoJasenyysVoimassa;
    }

    /**
     *  Aseta onkoJäsenyysVoimassa
     * @param onkoJasenyysVoimassa boolean
     */
    public void setOnkoJasenyysVoimassa(boolean onkoJasenyysVoimassa) {
        this.onkoJasenyysVoimassa = onkoJasenyysVoimassa;
    }

}
