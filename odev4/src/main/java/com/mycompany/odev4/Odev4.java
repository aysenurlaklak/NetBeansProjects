
package com.mycompany.odev4;

import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {
        System.out.println("ek ders ucreti hesaplama");
        System.out.println("*************************");
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("ek ders saatinizi girin(saat olarak):");
        int saat=scanner.nextInt();
        double ucret=0;
        if(saat>0 && saat<10){
            ucret=saat*50;
        }
        else if (saat>=10 && saat<20) {
            ucret=saat*51.5;
            
        }
        else if(saat>=20){
            ucret=saat*53.5;
        }
        else {
            System.out.println("Gecersiz tusa bastiniz.");
        }
        System.out.println("Almaniz gereken ucret tutari:" +ucret +" TL'dir.");
            
        
      
               
        
        
    }
}
