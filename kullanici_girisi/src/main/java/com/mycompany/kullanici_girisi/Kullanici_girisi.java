package com.mycompany.kullanici_girisi;

import java.util.Scanner;

public class Kullanici_girisi {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        
        int giris_hakki=3;
        String kullanici_adi="aysenur";
        String kayitli_parola="123456";
        
        System.out.println("*************************");
        System.out.println("HOSGELDINIZ!!");
        System.out.println("*************************");
        
        while(true){
            System.out.print("Kullanici adi: ");
            String kullanici =scanner.nextLine();
            System.out.print("Parola: ");
            String parola =scanner.nextLine();
            
            if(kullanici_adi.equals(kullanici) && kayitli_parola.equals(parola)){
                System.out.println("Hosgeldiniz " +kullanici);
                break;
            }
            else if(kullanici_adi.equals(kullanici) && !kayitli_parola.equals(parola)){
                System.out.println("Parola yanlis");
                giris_hakki-=1;
                System.out.println("giris hakkiniz "+giris_hakki +" kaldi");
                
            }
            else if(!kullanici_adi.equals(kullanici) && kayitli_parola.equals(parola)){
                System.out.println("kullanici adiniz yanlis");
                giris_hakki-=1;
                System.out.println("giris hakkiniz "+giris_hakki +" kaldi");
                
            }
            else{
                System.out.println("kullanici adi ve parolaniz yanlis");
                giris_hakki-=1;
                System.out.println("giris hakkiniz "+giris_hakki +" kaldi");
            }
            if(giris_hakki==0){
                System.out.println("giris hakkiniz bitti...");
                break;
            }
            
            
        }
    }
}
