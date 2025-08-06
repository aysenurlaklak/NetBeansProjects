
package com.mycompany.odev2;

import java.util.Random;
import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {
        char devam='e';
        int dogruSayisi=0;
        int yanlisSayisi=0;
        int puan=0;
        
        
        
        
        
        do{
            Random random=new Random();
            int sayi1=random.nextInt(100);
            int sayi2=random.nextInt(100);
        
            System.out.println(sayi1);
            System.out.println(sayi2);
        
            int toplam=sayi1+sayi2;
            
            System.out.print("Bu sayilarin toplami nedir?\ncevap:");
            Scanner scanner=new Scanner(System.in);
            int cevap=scanner.nextInt();
            
            if (cevap==toplam){
                System.out.println("Tebrikler dogru bildiniz.");
                puan+=5;
                dogruSayisi++;
            }
            else{
                System.out.println("uzgunum bilemediniz.");
                puan-=2;
                yanlisSayisi++;
            }
            System.out.println("Tekrar oynamak isterseniz e ya da E basiniz");
            devam=scanner.next().charAt(0);
        }while(devam=='e' || devam=='E');
        System.out.println("Dogru cevap sayiniz:"+dogruSayisi);
        System.out.println("yanlis cevap sayiniz:"+yanlisSayisi);
        System.out.println("puaniniz:"+puan);
        
        
        
        
        
    }
}
