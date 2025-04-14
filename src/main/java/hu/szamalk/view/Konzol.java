package hu.szamalk.view;

import hu.szamalk.modell.Gyujtemeny;
import hu.szamalk.modell.Mukincs;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Konzol extends Gyujtemeny implements Comparable<Gyujtemeny> {

    public Konzol() throws IOException {
        KonzolKiir();
        fajlbair();
    }

    public void KonzolKiir() {
        for (Mukincs gyujtemenyKiirva : gyujtemeny) {
            System.out.println(gyujtemenyKiirva.toString());
        }
    }

    public void fajlbair() {
        try {
            FileOutputStream file = new FileOutputStream("gyujtemeny.txt");
            ObjectOutputStream kiir = new ObjectOutputStream(file);
            file.close();
        } catch (IOException e) {
            throw new RuntimeException("Hiba a fájl írása közben");
        }
    }


    @Override
    public int compareTo(Gyujtemeny o) {
        return 0;
    }
}
