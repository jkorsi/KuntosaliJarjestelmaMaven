package otp.mavenkuntosalijarjestelma;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class jasenMaksu {
    
    @Column(name="kkhinta")
    private int kkHinta;
    @Column(name="kertahinta")
    private int kertaHinta;
    
    @Id
    private int maksutapahtumaID;
    
    @ManyToOne
    @JoinColumn(name="jasen_ID")
    private int jasenID;

    public int getMaksutapahtumaID() {
        return maksutapahtumaID;
    }

    public void setMaksutapahtumaID(int maksutapahtumaID) {
        this.maksutapahtumaID = maksutapahtumaID;
    }

}
