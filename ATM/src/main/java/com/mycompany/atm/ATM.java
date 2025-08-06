package com.mycompany.atm;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye=1000;
        String islemler= "1.islem:Bakiye Ogrenme \n"
                +"2.islem: Para Cekme\n"
                +"3.islem: Para Yatirma\n"
                +"cikis icin q'a basiniz";
        System.out.println("***********************************");
        System.out.println(islemler);
        System.out.println("***********************************");
        while (true){
            System.out.println("islemi seciniz:");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor..");
                break;
            
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz: "+bakiye);
            }
            else if(islem.equals("2")){
                System.out.println("cekmek istediginiz tutari giriniz: ");
                int tutar=scanner.nextInt();
                if(tutar>bakiye){
                    System.out.println("Bakiyeniz yetersizdir");
                }
                else{
                    System.out.println("yeni bakiyeniz:"+(bakiye-=tutar));
                }
                scanner.nextLine();//int den sonra string alındığında hata veriyor, bunu önlemek için bu satır eklendi.
            }
            else if(islem.equals("3")){
                System.out.println("yatirmak istediginiz miktari giriniz:");
                int miktar=scanner.nextInt();
                System.out.println("yeni bakiyeniz:"+(bakiye+=miktar));
                
                scanner.nextLine();
            }
            else{
                System.out.println("gecersiz islem sectiniz. lutfen tekrar deneyin");
            }
            
        }
    }
}
