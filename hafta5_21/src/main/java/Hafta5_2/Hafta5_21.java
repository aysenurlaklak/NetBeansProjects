
package Hafta5_2;

import java.util.Scanner;

public class Hafta5_21 {

    public static void main(String[] args) {
        //Klavyeden girilen 3 basamaklı bir sayının basamaklardaki sayı değerlerini ekrana yazdırınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen 3 basamaklibir sayi giriniz: ");
        int sayi=scanner.nextInt();
        
        for(int i=0;i<3;i++){
            int deg= sayi%10;
            System.out.println(deg);
            sayi=sayi/10;
        }
    }
}
