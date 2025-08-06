
package com.mycompany.odev3;

import java.util.Scanner;


public class Odev3 {

    public static void main(String[] args) {
        System.out.println("Hos Geldiniz!");
        System.out.println("***************");
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("adinizi giriniz:");
        String ogr_adi=scanner.next();
        
        
        double[] dizi1= new double[3];
        double toplam1=0;
        for (int i=1;i<=3;i++){
            System.out.println("lutfen "+i+".kisa sinav notunuzu giriniz:");
            dizi1[i-1]= scanner.nextDouble();
            toplam1+=dizi1[i-1];
            
        }
        double[] dizi2= new double[2];
        double toplam2=0;
        for (int i=1;i<=2;i++){
            System.out.println("lutfen "+i+".vize notunuzu giriniz:");
            dizi2[i-1]= scanner.nextDouble();
            toplam2+=dizi2[i-1];
            
        }
        System.out.println("son olarak final notunuzu giriniz:");
        double f=scanner.nextDouble();
        
        
        
        
        
        double ort1=toplam1/3;
        double ort2=toplam2/2;
        
        double bp=(ort1*50/100+ort2*50/100)*40/100+ f * 60/100;
        
        System.out.println("sayin "+ogr_adi+" basari notun "+bp+" olarak hesaplandi");
        
        
        
        
        
        
        
    }
}
