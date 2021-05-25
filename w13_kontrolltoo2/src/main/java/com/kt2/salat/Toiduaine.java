package com.kt2.salat;

public class Toiduaine {

    String nimetus;
    double valkudeProtsent;
    double rasvadeProtsent;
    double susivesikuteProtsent;
    double protsentKokku;

    public Toiduaine(String nimetus, double valkudeProtsent, double rasvadeProtsent, double susivesikuteProtsent) {
        protsentKokku = valkudeProtsent + rasvadeProtsent + susivesikuteProtsent;

        if (protsentKokku >= 100) {
            System.out.println("Protsent kokku ei saa ületada 100%.");
            protsentKokku = 0;
        } else {
            this.nimetus = nimetus;
            this.valkudeProtsent = valkudeProtsent;
            this.rasvadeProtsent = rasvadeProtsent;
            this.susivesikuteProtsent = susivesikuteProtsent;
        }
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getValkudeProtsent() {
        return valkudeProtsent;
    }

    public void setValkudeProtsent(double valkudeProtsent) {
        this.valkudeProtsent = valkudeProtsent;
    }

    public double getRasvadeProtsent() {
        return rasvadeProtsent;
    }

    public void setRasvadeProtsent(double rasvadeProtsent) {
        this.rasvadeProtsent = rasvadeProtsent;
    }

    public double getSusivesikuteProtsent() {
        return susivesikuteProtsent;
    }

    public void setSusivesikuteProtsent(double susivesikuteProtsent) {
        this.susivesikuteProtsent = susivesikuteProtsent;
    }

    public String toString() {
        return "Toiduaine nimi: " + nimetus + " | Valkude protsent: " + valkudeProtsent + " | Rasvade protsent: "
                + rasvadeProtsent + " | Süsivesikute protsent: " + susivesikuteProtsent + " | Protsent kokku: " + protsentKokku + ".";
    }

}
