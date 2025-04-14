package hu.szamalk.view;

import hu.szamalk.modell.Gyujtemeny;
import hu.szamalk.modell.Mukincs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Konzol extends Gyujtemeny{


    public Konzol() throws IOException {
    }

    public void KonzolKiir(){
        for (Mukincs gyujtemenyKiirva : gyujtemeny){
            System.out.println(gyujtemenyKiirva.toString());
        }
    }
    public void fajlbair(){
        try {
            FileWriter kiir = new FileWriter("gyujtemeny.txt");
            kiir.write(gyujtemeny.toString());
        } catch (IOException e) {
            throw new RuntimeException("Hiba a fájl írásakor");
        }

    }


}

