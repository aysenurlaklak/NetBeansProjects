package com.mycompany.odev1;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {
        double top=0;
        double ort=0;
        System.out.println("HOS GELDINIZ!");
        System.out.println("*******************");
        
        Scanner giris=new Scanner(System.in);
        
        
        System.out.println("AYLAR");
        System.out.println("1-OCAK\n2-SUBAT\n3-MART\n4-NISAN\n5-MAYIS\n6-HAZIRAN\n7-TEMMUZ\n"
                + "8-AGUSTOS\n9-EYLUL\n10-EKIM\n11-KASIM\n12-ARALIK\n");
        System.out.println("*******************");
        System.out.print("HANGI AY ICIN SICAKLIK ORTALAMASI HESAPLANSIN?\nay:");
        int ay =giris.nextInt();
        
        if(ay==2){
            for(int i=1;i<=28;i++){
                System.out.println("Ayin"+i+".gunu icin sicaklik degeri:");
                double sicaklik= giris.nextDouble();
                top+=sicaklik;
            }
            ort=top/28;
            System.out.print("subat ayina ait ortalama sicaklik degeri:"+ort);
        }
        else{
            for(int i=1;i<=30;i++){
                System.out.println("Ayin " +i+".gunu icin sicaklik degeri girin:");
                double sicaklik= giris.nextDouble();
                top+=sicaklik;
            }
            ort=top/30;
            System.out.print("girilen aya ait ortalama sicaklik degeri:"+ort);
            
            
        }
        
        
    }
}
