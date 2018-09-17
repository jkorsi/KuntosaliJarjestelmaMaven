package otp.mavenkuntosalijarjestelma;

public class MaksuTapahtumaLista {

    private Maksujarjestelma maksujarjestelma;

    private MaksuTapahtumaItem[] maksuTapahtumaItem;

    public void luoTapahtuma() {

    }

    public MaksuTapahtumaItem haeTapathuma() {
        return null;
    }

    public MaksuTapahtumaLista() {
    }

    //Getterit ja setterit    
    public Maksujarjestelma getMaksujarjestelma() {
        return maksujarjestelma;
    }

    public void setMaksujarjestelma(Maksujarjestelma maksujarjestelma) {
        this.maksujarjestelma = maksujarjestelma;
    }

    public MaksuTapahtumaItem[] getMaksuTapahtumaItem() {
        return maksuTapahtumaItem;
    }

    public void setMaksuTapahtumaItem(MaksuTapahtumaItem[] maksuTapahtumaItem) {
        this.maksuTapahtumaItem = maksuTapahtumaItem;
    }

}
