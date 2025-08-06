
package com.mycompany.rakamlartop;

import java.util.Scanner;

public class RakamlarTop {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi=giris.nextInt();
        
        int toplam=0;
        do{
            toplam +=sayi%10;
            sayi=sayi/10;
            
        
        }while(sayi>0);
        System.out.println("rakamlar toplami: "+toplam);
    }
}
