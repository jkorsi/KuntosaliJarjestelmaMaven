package otp.mavenkuntosalijarjestelma;

public abstract class Kuntosalilaite {

    private int ika;

    private String kunto;

    private boolean tarvitseeHuollon;

    private int kayttakerrat;

    private String viimeisinHuoltoPvm;

    private Tila tila;

    public Kuntosalilaite() {
    }

    public Kuntosalilaite(int ika, String kunto, boolean tarvitseeHuollon, int kayttakerrat, String viimeisinHuoltoPvm, Tila tila) {
        this.ika = ika;
        this.kunto = kunto;
        this.tarvitseeHuollon = tarvitseeHuollon;
        this.kayttakerrat = kayttakerrat;
        this.viimeisinHuoltoPvm = viimeisinHuoltoPvm;
        this.tila = tila;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    public String getKunto() {
        return kunto;
    }

    public void setKunto(String kunto) {
        this.kunto = kunto;
    }

    public boolean isTarvitseeHuollon() {
        return tarvitseeHuollon;
    }

    public void setTarvitseeHuollon(boolean tarvitseeHuollon) {
        this.tarvitseeHuollon = tarvitseeHuollon;
    }

    public int getKayttakerrat() {
        return kayttakerrat;
    }

    public void setKayttakerrat(int kayttakerrat) {
        this.kayttakerrat = kayttakerrat;
    }

    public String getViimeisinHuoltoPvm() {
        return viimeisinHuoltoPvm;
    }

    public void setViimeisinHuoltoPvm(String viimeisinHuoltoPvm) {
        this.viimeisinHuoltoPvm = viimeisinHuoltoPvm;
    }

    public Tila getTila() {
        return tila;
    }

    public void setTila(Tila tila) {
        this.tila = tila;
    }

}
