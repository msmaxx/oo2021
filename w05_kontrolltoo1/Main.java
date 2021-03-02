package com.oop21.w04.kt01.a_tahed;

import java.util.Scanner;

//A-tähed tekstis
// * Loe programmi abil kokku, kui palju on tekstifailis a-tähti (nii suuri kui väikeseid)
// * Leia, kui palju oli a-tähti igas sõnas, sõnades keskmiselt, suhtarvuna tähtede üldarvu
//* Loe kokku, mitu sõna oli ühe, kahe, kolme jne a-tähega. Koosta tabel, kus ridadeks tähtede arv sõnas ning veergudeks a-tähtede arv. Lahtris näidatakse, mitu vastavat sõna oli tekstis.

public class Main {

    public static void main(String[] args) {
        String str = "Tallink ldksdalala andis TallinnA SAdama kohtusse";

        //String str = "Kolm endist TransferWise’i inseneri Aitavad nüüd teistel idufirmAdel lendu tõusta";

        //Scanner in = new Scanner(System.in);
        // System.out.print("Sisestage analüüsimiseks soovitud tekst: ");
        // String str = in.nextLine();

        Counter.countALetters(str);
        Counter.detailCount(str);
        System.out.println("--------------------------------------------------------------------");
        Counter.countAllWordsDetail(str);
    }
}

