package hu.szamalk.modell;

import java.util.ArrayList;
import java.util.List;

public class Festmeny extends Mukincs implements Comparable<Festmeny>{
    private final String stilus, technika;

    public Festmeny(String alkoto, String cim, Kategoria kategoria, String stilus, String technika) {
        super(alkoto, cim, kategoria);
        this.stilus = stilus;
        this.technika = technika;
    }

    public String getTechnika() {
        return technika;
    }



    @Override
    public int compareTo(Festmeny o) {
        return this.getTechnika().compareTo(o.getTechnika());
    }

    @Override
    public String toString() {
        return "Festmeny{" +
                "alkoto='" + getAlkoto() +'\'' +
                ", cim='" + getCim() +'\'' +
                ", stilus='" + stilus + '\'' +
                ", technika='" + technika + '\'' +
                '}';
    }
}
