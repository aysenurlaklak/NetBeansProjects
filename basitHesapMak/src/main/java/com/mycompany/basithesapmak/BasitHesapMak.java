

package com.mycompany.basithesapmak;

import java.util.Scanner;

public class BasitHesapMak {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Yapmak istediginiz islemi seciniz (+,-,*,/ seklinde)");
        String secim = giris.nextLine();
        
        Scanner sayi = new Scanner(System.in);
        System.out.println("islem yapilacak sayilari girin: ");
        double sayi1 = sayi.nextDouble();
        double sayi2 = sayi.nextDouble();
        
        double sonuc=0;
        switch (secim) {
            case "+":
                sonuc=sayi1+sayi2;
                break;
            case "-":
                sonuc = sayi1-sayi2;
                break;
            case "*":
                sonuc = sayi1*sayi2;
                break;
            case "/":
                sonuc = sayi1/sayi2;
                break;
            
            
            default:
                System.out.println("gecersiz islem sectiniz");
                
        }
        System.out.println("sonuc: "+sonuc);
        
       
    }
}
