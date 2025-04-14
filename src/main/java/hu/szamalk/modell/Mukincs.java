package hu.szamalk.modell;

public class Mukincs {
    private String alkoto, cim;

    public Mukincs() {

    }

    enum Kategoria{
        EREDETI,
        MASOLAT,
        KIS_ERTEKU
    }

    public <kategoria> Mukincs(String alkoto, String cim, Kategoria kategoria) {
        this.alkoto = alkoto;
        this.cim = cim;

    }

    public String getAlkoto() {
        return alkoto;
    }

    public String getCim() {
        return cim;
    }
}
