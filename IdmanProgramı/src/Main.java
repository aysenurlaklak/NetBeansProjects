
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idman programina hosgeldiniz...");
        
        String Idmanlar="Gecerli Hareketler...\n"
                +"Burpee\n"
                +"Pushup\n"
                +"Mekik\n"
                +"Squat";
        System.out.println(Idmanlar);
        
        System.out.println("Bir idman olusturun...");
        
        System.out.print("Burpee sayisi: ");
        int burpee=scanner.nextInt();
        System.out.print("pushup sayisi: ");
        int pushup=scanner.nextInt();
        System.out.print("mekik sayisi: ");
        int mekik=scanner.nextInt();
        System.out.print("squat sayisi: ");
        int squat=scanner.nextInt();
        scanner.nextLine();
        
        Idman idman =new Idman(burpee, pushup, mekik, squat);
        System.out.println("Idmaniniz Basliyor...");
        
        while(idman.idmanBittiMi()==false){
            System.out.print("Hareket Turu(Burpee,Pushup,mekik,Squat): ");
            String tur=scanner.nextLine();
            System.out.print("Bu hareketten kac tane yapacaksiniz?: ");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
            
            
        }
        System.out.println("Tebrikler! Idman programinizi basariyla tamamladiniz!");
        
        
    
}
}
