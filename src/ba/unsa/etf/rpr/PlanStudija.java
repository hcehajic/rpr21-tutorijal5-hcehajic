package ba.unsa.etf.rpr;

import java.util.List;

public class PlanStudija {
    private List<Predmet> obavezni;
    private List<Predmet> izborni;
    private List<Predmet> upisaniStudenti;

    public List<Predmet> getIzborni() {
        return izborni;
    }

    public List<Predmet> getObavezni() {
        return obavezni;
    }

    public void upisiStudenta(Student student) {

    }
}
