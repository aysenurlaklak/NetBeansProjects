
package aysenur;

import java.util.Scanner;

public class Bedenkutleindeksi {

    public static void main(String[] args) {
        Scanner giris1 = new Scanner(System.in);
        System.out.print("boyunuz:");
        double boy = giris1.nextDouble();
        Scanner giris2 = new Scanner(System.in);
        System.out.print("kutleniz:");
        int kutle = giris2.nextInt();
        double Bedenkutleindeksi= kutle/(boy*boy);
        System.out.print("beden kutle indeksiniz: "+Bedenkutleindeksi);
        
        
    }
}
