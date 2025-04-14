package hu.szamalk.view;

import hu.szamalk.modell.Gyujtemeny;
import hu.szamalk.modell.Mukincs;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Konzol extends Gyujtemeny {

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
            FileOutputStream kiir = new FileOutputStream("gyujtemeny.txt");
            ObjectOutputStream oos = new ObjectOutputStream(kiir);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
