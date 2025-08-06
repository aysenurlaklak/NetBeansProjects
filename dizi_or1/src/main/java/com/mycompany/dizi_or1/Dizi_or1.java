package com.mycompany.dizi_or1;

import java.util.Random;

public class Dizi_or1 {

    public static void main(String[] args) {
        int adet1=0;
        int toplam=0;
        int adet2=0;
        int ort=0;
        int adet3=0;
       int[] dizi= new int[100];
       for(int i=0;i<100;i++){
           Random random=new Random();
           dizi[i]=random.nextInt(201);
           
           if(dizi[i]>100){
               adet1++;
               
           }
        
           if(dizi[i]<200){
               toplam+=i;
               adet2++;
               
               
           }
           
           if(dizi[i]%2==0){
               adet3++;
               
           }
           
           
       }
       for(int i=0;i<100;i++){
           System.out.println(dizi[i]);
       }
        System.out.println("***************************************");
       ort=toplam/adet2;
       System.out.println(adet1);
       System.out.println(ort);
       System.out.println(adet3);
    }
}
