package com.kt2.salat;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proov {
    public static void main(String[] args) throws InterruptedException {
        String newLine = System.getProperty("line.separator");

        System.out.println("Alustame kartulisalati valmistamist...");
        Thread.sleep(1000);
        System.out.println("...Salati valmistamiseks vajame järgmisi tooteid:");
        Thread.sleep(2000);

        //Arvutatud protsent 100g toote kohta
        Toiduaine Kartul = new Toiduaine("Kartul, keedetud", 1.96, 0.103, 16);
        Toiduaine Muna = new Toiduaine("Muna, keedetud", 12.5, 10.3, 0.3);
        Toiduaine Kurk = new Toiduaine("Kurk, konserveeritud", 0.9, 0.1, 2.6);
        Toiduaine Mugulsibul = new Toiduaine("Mugulsibul", 1.2, 0.2, 4.8);
        Toiduaine Jogurtimajonees = new Toiduaine("Jogurtimajonees", 1.5, 15, 9.1);
        Toiduaine Hapukoor = new Toiduaine("Hapukoor", 3.3, 21.5, 3.8);
        Toiduaine Suhkur = new Toiduaine("Suhkur", 0, 0, 99.8);
        Toiduaine Petersell = new Toiduaine("Petersell, värske", 3.6, 1.2, 1.1);

        System.out.println(Kartul + newLine + Muna + newLine + Kurk + newLine + Mugulsibul + newLine + Jogurtimajonees + newLine +
                Hapukoor + newLine + Suhkur + newLine + Petersell);

        Thread.sleep(1000);
        System.out.println("...");
        System.out.println("Ühe kilogrammi salati valmistamiseks vajame:");
        System.out.println("...");
        Thread.sleep(1000);

        //1000g
        ToiduKomponent tk1 = new ToiduKomponent(Kartul, 320);
        ToiduKomponent tk2 = new ToiduKomponent(Muna, 280);
        ToiduKomponent tk3 = new ToiduKomponent(Kurk, 100);
        ToiduKomponent tk4 = new ToiduKomponent(Mugulsibul, 60);
        ToiduKomponent tk5 = new ToiduKomponent(Jogurtimajonees, 120);
        ToiduKomponent tk6 = new ToiduKomponent(Hapukoor, 100);
        ToiduKomponent tk7 = new ToiduKomponent(Suhkur, 10);
        ToiduKomponent tk8 = new ToiduKomponent(Petersell, 10);

        System.out.println(tk1 + newLine + tk2 + newLine + tk3 + newLine + tk4 + newLine + tk5 + newLine + tk6 + newLine + tk7 + newLine + tk8);

        List<ToiduKomponent> toiduained = new ArrayList<>();

        toiduained.add(tk1);
        toiduained.add(tk2);
        toiduained.add(tk3);
        toiduained.add(tk4);
        toiduained.add(tk5);
        toiduained.add(tk6);
        toiduained.add(tk7);
        toiduained.add(tk8);

        Toit kartuliSalat = new Toit("Kartuli-munasalat", toiduained);

        System.out.println("...");
        Thread.sleep(1000);

        System.out.println(kartuliSalat);

        System.out.println("...");
        Thread.sleep(1000);

        Scanner kasutajaSisendandmed = new Scanner(System.in);

        System.out.println("Sisestage soovitud kogus toitu, mida soovite valmistada (grammides): ");

        int kasutajaKogus = kasutajaSisendandmed.nextInt();

        double uusKogusTk1 = tk1.kogus * kasutajaKogus / 1000;
        double uusKogusTk2 = tk2.kogus * kasutajaKogus / 1000;
        double uusKogusTk3 = tk3.kogus * kasutajaKogus / 1000;
        double uusKogusTk4 = tk4.kogus * kasutajaKogus / 1000;
        double uusKogusTk5 = tk5.kogus * kasutajaKogus / 1000;
        double uusKogusTk6 = tk6.kogus * kasutajaKogus / 1000;
        double uusKogusTk7 = tk7.kogus * kasutajaKogus / 1000;
        double uusKogusTk8 = tk8.kogus * kasutajaKogus / 1000;

        System.out.println("* " + kasutajaKogus + " grammi vajamineva toote valmistamiseks: " + newLine +
                "- " + tk1.getToiduaineNimetus() + " " + uusKogusTk1 + " (g)" + newLine +
                "- " + tk2.getToiduaineNimetus() + " " + uusKogusTk2 + " (g)" + newLine +
                "- " + tk3.getToiduaineNimetus() + " " + uusKogusTk3 + " (g)" + newLine +
                "- " + tk4.getToiduaineNimetus() + " " + uusKogusTk4 + " (g)" + newLine +
                "- " + tk5.getToiduaineNimetus() + " " + uusKogusTk5 + " (g)" + newLine +
                "- " + tk6.getToiduaineNimetus() + " " + uusKogusTk6 + " (g)" + newLine +
                "- " + tk7.getToiduaineNimetus() + " " + uusKogusTk7 + " (g)" + newLine +
                "- " + tk8.getToiduaineNimetus() + " " + uusKogusTk8 + " (g)");

        System.out.println("...");
        Thread.sleep(1000);

        //Faili lugemine

        Scanner kasutajaFailKirVastus = new Scanner(System.in);

        System.out.println("Kas soovite oma retsepti '" + kartuliSalat.getToitNimetus() + "' faili salvestada? [Y / N]?: ");

        String kasutajaVastus = kasutajaFailKirVastus.nextLine();

        if (kasutajaVastus.equals("Y")) {
            try (FileWriter writer = new FileWriter("retsept.txt", false)) {
                String text = "Retsept: " + kartuliSalat.getToitNimetus() + " - " + kasutajaKogus + " (g)";
                writer.write(text);
                writer.append('\n');
                writer.append("- " + tk1.getToiduaineNimetus() + " " + uusKogusTk1 + " (g)" + newLine);
                writer.append("- " + tk2.getToiduaineNimetus() + " " + uusKogusTk2 + " (g)" + newLine);
                writer.append("- " + tk3.getToiduaineNimetus() + " " + uusKogusTk3 + " (g)" + newLine);
                writer.append("- " + tk4.getToiduaineNimetus() + " " + uusKogusTk4 + " (g)" + newLine);
                writer.append("- " + tk5.getToiduaineNimetus() + " " + uusKogusTk5 + " (g)" + newLine);
                writer.append("- " + tk6.getToiduaineNimetus() + " " + uusKogusTk6 + " (g)" + newLine);
                writer.append("- " + tk7.getToiduaineNimetus() + " " + uusKogusTk7 + " (g)" + newLine);
                writer.append("- " + tk8.getToiduaineNimetus() + " " + uusKogusTk8 + " (g)");
                writer.flush();
                System.out.println("Fail on edukalt kirjutatud!");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (kasutajaVastus.equals("N")) {
            System.out.println("Väga kahju ;(");
        }

        System.out.println("...");
        Thread.sleep(1000);

        Scanner kasutajaFailLugVastus = new Scanner(System.in);

        System.out.println("Kas soovite, et programm loeks failist kirjutatud retsepti? [Y / N]?: ");

        String kasutajaVastusLug = kasutajaFailLugVastus.nextLine();

        if (kasutajaVastusLug.equals("Y")) {
            try (FileReader reader = new FileReader("retsept.txt")) {
                System.out.println("...");
                System.out.println("* Loetud fail: ");
                int c;
                while ((c = reader.read()) != -1) {

                    System.out.print((char) c);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (kasutajaVastusLug.equals("N")) {
            System.out.println("Väga kahju ;(");
        }
    }
}
