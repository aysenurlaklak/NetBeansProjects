
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        System.out.println("Calisanlar programina Hosgeldiniz....");
             Scanner scanner=new Scanner(System.in);
        String islemler="islemler...\n"+
                "1.yazilimci islemcileri\n"+
                "2.yonetici islemcileri\n"+
                "cikis icin q'ya basiniz..\n";
        System.out.println("*****************************");
        System.out.println(islemler);
        System.out.println("*****************************");
            System.out.print("islemi seciniz: ");
            String islem = scanner.nextLine();
       
        
        while (true) {
        
        
            
            if(islem.equals("q")){
                System.out.println("programdan cikiliyor...");
                break;
            }
            else if(islem.equals("1")){
                yazilimci yazilimci=new yazilimci("aysenur" , "laklak", 12,"java,C ,python");
                String yazilimci_islemleri="1.Format at\n"+
                "2.Bilgileri goster\n"+
                "cikis icin q'ya basiniz..\n";
                System.out.println(yazilimci_islemleri);
                
                while (true) {
                    System.out.print("islem seciniz:");
                    String y_islem=scanner.nextLine();
                    
                    if(y_islem.equals("q")){
                        System.out.println("yazilimci islemlerinden cikis yapiliyor..");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.print("isletim sistemi: ");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                        break;
                    }
                    else if(y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                        System.out.println("*****************************");
                        break;
                    }
                    else{
                        System.out.println("Gecersiz yazilimci islemi...");
                    }
                
                }
                
           
            }
            else if(islem.equals("2")){
                yonetici yonetici=new yonetici("sahin", "kavsara", 1, 20);
                 String yonetici_islemleri="1.Bilgileri goster\n"+
                        "2.Zam yap\n"+
                        "cikis icin q'ya basiniz..";
                System.out.println(yonetici_islemleri);
                
                while (true) {
                   
                
                    System.out.print("islem seciniz:");
                    
                    String yo_islem=scanner.nextLine();
                    System.out.println("**************************************");
                    
                    if(yo_islem.equals("q")){
                        System.out.println("yonetici islemlerinden cikis yapiliyor..");
                        break;
                    }
                    else if(yo_islem.equals("1")){
                        yonetici.bilgileriGoster();
                    }
                    else if(yo_islem.equals("2")){
                        System.out.print("Zam miktarini giriniz: ");
                        int zam=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam);
                    }
                    else{
                        System.out.println("Gecersiz yonetici islemi...");
                    }
                }
                
                
            }
            else{
                System.out.println("gecersiz islem..");
            }
            
            
            
        }
        
    }
    
}
