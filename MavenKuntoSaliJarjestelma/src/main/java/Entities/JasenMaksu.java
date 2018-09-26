package Entities;
import Entities.MaksuTapahtuma;
 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "jasenmaksut")
public class JasenMaksu extends MaksuTapahtuma {
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
    
    public int getKkHinta() {
        return kkHinta;
    }
     public void setKkHinta(int kkHinta) {
        this.kkHinta = kkHinta;
    }
     public int getKertaHinta() {
        return kertaHinta;
    }
     public void setKertaHinta(int kertaHinta) {
        this.kertaHinta = kertaHinta;
    }
     public int getJasenID() {
        return jasenID;
    }
     public void setJasenID(int jasenID) {
        this.jasenID = jasenID;
    }
 }