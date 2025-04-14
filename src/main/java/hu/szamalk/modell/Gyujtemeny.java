package hu.szamalk.modell;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Gyujtemeny {
    protected List<Mukincs> gyujtemeny;
    public Gyujtemeny() throws IOException {
        gyujtemeny = new ArrayList<>();
        gyujtemeny.add(new Festmeny("Bob Ross","Hegyek", Mukincs.Kategoria.KIS_ERTEKU, "Modern","festék"));
        gyujtemeny.add(new Szobor("Michelangelo","Dávid",Mukincs.Kategoria.EREDETI,"Márvány",16));
    }

    public void beolvas() {
        try {
            FileInputStream file = new FileInputStream("gyujtemeny.txt");
            ObjectInputStream fileBe = new ObjectInputStream(file);
            gyujtemeny = (List<Mukincs>) fileBe.readObject();
            fileBe.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Hiba a fájl beolvasása közben");
        }
    }


    @Override
    public String toString() {
        return "Gyujtemeny{" +
                "gyujtemeny=" + gyujtemeny +
                '}';
    }
}
