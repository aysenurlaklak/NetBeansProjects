

package com.mycompany.odevfinal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OdevFinal {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public static void anaMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        char secim;
        do {
            System.out.println("********** ANA MENU'YE HOSGELDINIZ... **********");
            System.out.println("[1] BILGI GIR.");
            System.out.println("[2] OGRENCI ARAMA.");
            System.out.println("[3] OGRENCI SILME.");
            System.out.println("[4] CIKIS.");
            System.out.print("LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ: ");
            
            secim = scanner.next().charAt(0);
            
            switch (secim) {
                case '1':
                    bilgiGir();
                    break;
                case '2':
                    ogrenciArama();
                    break;
                case '3':
                    ogrenciSilme();
                    break;
                case '4':
                    System.out.println("Programdan cikis yapiliyor...");
                    break;
                default:
                    System.out.println("Gecersiz secim. Lutfen tekrar deneyin.");
            }
        } while (secim != '4');
    }   
    
}
