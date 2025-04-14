package hu.szamalk.modell;

public class Szobor extends Mukincs {

    private String anyag;
    private int szazad;

    public Szobor(String alkoto,String cim,Kategoria kategoria, String anyag ) {
        super(cim,alkoto, kategoria);
        this.anyag = anyag;
        szazad = 20;
    }

    public Szobor(String alkoto, String cim, Kategoria kategoria, String anyag, int szazad) {
        super(alkoto, cim, kategoria);
        this.anyag = anyag;
        this.szazad = szazad;
        if (szazad>21){
            throw new RuntimeException("A jelenlegi századnál nem lehet nagyobb!");
        }
    }

    @Override
    public String toString() {
        return "Szobor{" +
                "alkoto='" + getAlkoto() +'\'' +
                ", cim='" + getCim() +'\'' +
                ", anyag='" + anyag + '\'' +
                ", szazad=" + szazad +
                '}';
    }
}
