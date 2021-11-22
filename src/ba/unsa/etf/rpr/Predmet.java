package ba.unsa.etf.rpr;

import java.util.List;

public class Predmet {
    private String nazivPredmeta;
    private int brojECTS;
    private List<Student> upisaniStudenti;
    private boolean izborni;

    public Predmet(String nazivPredmeta, int brojECTS, boolean izborni) {
        this.nazivPredmeta = nazivPredmeta;
        this.brojECTS = brojECTS;
        this.izborni = izborni;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getBrojECTS() {
        return brojECTS;
    }

    public void setBrojECTS(int brojECTS) {
        this.brojECTS = brojECTS;
    }

    public boolean isIzborni() {
        return izborni;
    }

    public void setIzborni(boolean izborni) {
        this.izborni = izborni;
    }

    public List<Student> getUpisaniStudenti() {
        return upisaniStudenti;
    }

    public void upisiStudenta(Student student) {

    }
}
