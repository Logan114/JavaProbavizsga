package hu.szamalk.modell;


import java.io.IOException;
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

    public void beolvas(){
        try {
            List<String> sorok = Files.readAllLines(Path.of("gyujtemeny.txt"));
        } catch (IOException e) {
            throw new RuntimeException("Hiba a fájl beolvasása során");
        }
    }
}
