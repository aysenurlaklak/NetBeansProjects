package com.mycompany.nothesaplama;

import java.util.Scanner;

public class Nothesaplama {

    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        System.out.println("1. vize notunuzu girin:");
        int vize1= giris.nextInt();
        System.out.println("2. vize notunuzu girin:");
        int vize2= giris.nextInt();
        System.out.println("final notunuzu girin:");
        int finalnot= giris.nextInt();
        
        double ort= (vize1*0.3)+(vize1*0.3)+(finalnot*0.4);
        
        if(ort<55){
            System.out.println("Ortalamaniz:"+ort);
            System.out.println("Harf notunuz: FF");
        }
        else if(ort>=55 && ort<60){
            System.out.println("Ortalamaniz:"+ort);
            System.out.println("Harf notunuz: FD");
            
        }
        else if(ort>=60 && ort<65){
            System.out.println("Ortalamaniz:"+ort);
            System.out.println("Harf notunuz: DD");
            
        }
        else if(ort>=65 && ort<70){
            System.out.println("Ortalamaniz:"+ort);
            System.out.println("Harf notunuz: DC");
            
        }
        else if(ort>=70 && ort<75){
            System.out.println("Ortalamaniz:"+ort);
            System.out.println("Harf notunuz: CC");
            
        }
        else if(ort>=75 && ort<80){
            System.out.println("Ortalamaniz:"+ort);
            System.out.println("Harf notunuz: CB");
            
        }
        else if(ort>=80 && ort<85){
            System.out.println("Ortalamaniz:"+ort);
            System.out.println("Harf notunuz: BB");
            
        }
        else if(ort>=85 && ort<90){
            System.out.println("Ortalamaniz:"+ort);
            System.out.println("Harf notunuz: BA");
            
        }
        else if(ort>=90 && ort<100 ||ort==100){
            System.out.println("Ortalamaniz:"+ort);
            System.out.println("Harf notunuz: AA");
            
        }
    }
}
