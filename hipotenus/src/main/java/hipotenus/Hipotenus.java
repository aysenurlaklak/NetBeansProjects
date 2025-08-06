
package hipotenus;

import java.util.Scanner;

public class Hipotenus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("lutfen ucgenin dik kenarlarini giriniz");
        a =scanner.nextInt();
        b =scanner.nextInt();
        double hipo=Math.sqrt(a*a+b*b);
        System.out.println("hipotenus uzunlugu: "+hipo);
    }
}
