package com.kt2.salat;

import java.util.List;

public class Toit {

    String toitNimetus;
    List<ToiduKomponent> toidukomponendid;

    public Toit(String toitNimetus, List<ToiduKomponent> toidukomponendid) {
        this.toitNimetus = toitNimetus;
        this.toidukomponendid = toidukomponendid;
    }

    String newLine = System.getProperty("line.separator");

    public String ToiteVaartus() {
        double valgud = 0;
        double rasvad = 0;
        double susivesikud = 0;

        for (ToiduKomponent toiduKomponent : toidukomponendid) {
            valgud += toiduKomponent.getToidukomponendiValk();
            rasvad += toiduKomponent.getToidukomponendiRasv();
            susivesikud += toiduKomponent.getToidukomponendiSusivesik();
        }
        System.out.println("Toote nimi: " + toitNimetus + newLine + " * Valku kokku sisaldab: " + valgud + newLine + " * Rasva kokku sisaldab: " + rasvad + newLine + " * Süsivesikud kokku sisaldab: " + susivesikud);
        return null;
    }

    public String getToitNimetus() {
        return toitNimetus;
    }

    public String toString() {
        return ToiteVaartus();
    }
}
