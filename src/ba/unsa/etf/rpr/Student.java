package ba.unsa.etf.rpr;

import java.util.Map;

public class Student {
    private String imePrezime;
    private PlanStudija planStudija;
    private Map<Integer, Predmet> polozeniPredmeti;

    public Student(String imePrezime, PlanStudija planStudija) {
        this.imePrezime = imePrezime;
        this.planStudija = planStudija;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public PlanStudija getPlanStudija() {
        return planStudija;
    }

    public Map<Integer, Predmet> getPolozeniPredmeti() {
        return polozeniPredmeti;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setPlanStudija(PlanStudija planStudija) {
        this.planStudija = planStudija;
    }

    public void dodajPolozeniPredmet(Predmet predmet, int ocjena) {

    }
}
