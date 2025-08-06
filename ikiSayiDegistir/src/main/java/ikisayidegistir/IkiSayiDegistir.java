

package ikisayidegistir;

import java.util.Scanner;


public class IkiSayiDegistir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birinciSayi;
        int ikinciSayi;
        System.out.print("Lutfen birinci sayiyi giriniz: ");
        birinciSayi=scanner.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        ikinciSayi=scanner.nextInt();
        
        System.out.println("degistirilmeden once");
        System.out.println("birinci sayi: "+birinciSayi);
        System.out.println("ikinci sayi: "+ikinciSayi);
        
        int gecici=birinciSayi;
        birinciSayi=ikinciSayi;
        ikinciSayi=gecici;
        
        System.out.println("degistirilince");
        System.out.println("birinci sayi: "+birinciSayi);
        System.out.println("ikinci sayi: "+ikinciSayi);
    }
}
