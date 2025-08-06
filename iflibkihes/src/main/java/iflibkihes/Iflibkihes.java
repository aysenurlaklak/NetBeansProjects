
package iflibkihes;

import java.util.Scanner;


public class Iflibkihes {

    public static void main(String[] args) {
        int kilo;
        Scanner giris= new Scanner(System.in);
        System.out.print("kilonuzu girin :");
        kilo = giris.nextInt();
        System.out.print("boyunuzu girin (m olarak):");
        double boy = giris.nextDouble();
        
        double bki= kilo /(boy*boy);
        if(bki<18.5){
            System.out.println("zayif");
        }
        else if(bki>=18.5 && bki<25){
            System.out.println("normal");
        }
        else if(bki>=25 && bki<30){
            System.out.println("fazla kilolu");
        
        }
        else {
            System.out.println("obez");
        
        }
        

        
    }
}
