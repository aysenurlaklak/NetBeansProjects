package com.mycompany.faizuyg;

import java.util.Scanner;

public class Faizuyg {

    public static void main(String[] args) {
        // faiz oranı %6 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamiza hosgeldiniz.. Faiz orani %6");
        
        System.out.println("Yatirmak istediginiz tutari girin:");
        int anapara=scanner.nextInt();
        
        System.out.println("kac yil vadeli yatiracaksiniz?:");
        int kac_yil=scanner.nextInt();
        
        double toplam_para=anapara;
        double faizorani=0.06;
        for(int i=0;i<kac_yil;i++){
            toplam_para+= toplam_para*faizorani;
            System.out.println(i+1 +".yil sonra toplam paraniz: "+toplam_para);
            
        }
        
        
        
    }
}
