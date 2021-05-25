package com.kt2.salat;

public class ToiduKomponent {

    Toiduaine toiduaine;

    double kogus;

    public ToiduKomponent(Toiduaine toiduaine, double kogus) {
        this.toiduaine = toiduaine;
        this.kogus = kogus;
    }


    public double getToidukomponendiRasv() {
        return kogus * toiduaine.getRasvadeProtsent() / 100;
    }

    public double getToidukomponendiValk() {
        return kogus * toiduaine.getValkudeProtsent() / 100;
    }

    public double getToidukomponendiSusivesik() {
        return kogus * toiduaine.getSusivesikuteProtsent() / 100;
    }

    public double getKogus() {
        return kogus;
    }

    public String getToiduaineNimetus() {
        return toiduaine.getNimetus();
    }

    public String toString() {
        return "- " + toiduaine.nimetus + " | Neto (g): " + kogus + " | Rasvakogus (%): " + getToidukomponendiRasv();
    }
}
