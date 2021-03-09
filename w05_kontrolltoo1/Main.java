package com.oop21.w04.kt01.a_tahed;

import java.io.*;
import java.util.Scanner;

//A-tähed tekstis
// * Loe programmi abil kokku, kui palju on tekstifailis a-tähti (nii suuri kui väikeseid)
// * Leia, kui palju oli a-tähti igas sõnas, sõnades keskmiselt, suhtarvuna tähtede üldarvu
//* Loe kokku, mitu sõna oli ühe, kahe, kolme jne a-tähega. Koosta tabel, kus ridadeks tähtede arv sõnas ning veergudeks a-tähtede arv. Lahtris näidatakse, mitu vastavat sõna oli tekstis.

public class Main {

    public static void main(String[] args) {

        try {
            File textFile = new File("/Users/maksit/IdeaProjects/w04_kt01/src/com/oop21/w04/kt01/a_tahed/text.txt");
            Scanner Reader = new Scanner(textFile);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println("\n - " + data + " - \n");
                Counter.detailCount(data);
                Counter.countWords(data);
            }
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Viga!");
            e.printStackTrace();
        }
    }
}

