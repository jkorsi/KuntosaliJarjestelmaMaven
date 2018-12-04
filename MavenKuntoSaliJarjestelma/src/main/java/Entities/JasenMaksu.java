package Entities;
import java.util.logging.Logger;
 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Antti
 */
@Entity
@Table(name = "jasenmaksut")
public class JasenMaksu extends MaksuTapahtuma {

    /**
     * Jäsenmaksu luokan konstruktori
     */
    public JasenMaksu() {
    }
     
    @Column(name="kkhinta")
    private int kkHinta;
    @Column(name="kertahinta")
    private int kertaHinta;
    
    //HUOM!! Ei kk-jäsentä, jäsenID:tä ei voida ottaa abstraktista jasen-luokasta.
    @ManyToOne(targetEntity = KertaJasen.class)
    @JoinColumn(referencedColumnName="jasen_ID")
    private int jasenID;
    
    /**
     * Hae kkhinta
     * @return int kkhinta
     */
    public int getKkHinta() {
        return kkHinta;
    }

    /**
     * Aseta kkhinta
     * @param kkHinta int kkhinta
     */
    public void setKkHinta(int kkHinta) {
        this.kkHinta = kkHinta;
    }

    /**
     * Hae kertahinta
     * @return int kertahinta
     */
    public int getKertaHinta() {
        return kertaHinta;
    }

    /**
     * Aseta kertahinta
     * @param kertaHinta int kertahinta
     */
    public void setKertaHinta(int kertaHinta) {
        this.kertaHinta = kertaHinta;
    }

    /**
     * Hae jäsenId
     * @return int jasenId
     */
    public int getJasenID() {
        return jasenID;
    }

    /**
     *  Aseta jäsenId
     * @param jasenID int jasenId
     */
    public void setJasenID(int jasenID) {
        this.jasenID = jasenID;
    }
    private static final Logger LOG = Logger.getLogger(JasenMaksu.class.getName());
 }