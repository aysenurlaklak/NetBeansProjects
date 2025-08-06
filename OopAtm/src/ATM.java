
import java.util.Scanner;


public class ATM {
    public void calis(Hesap hesap){
        Login login =new Login();
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Bankamiza Hosgeldiniz....");
        System.out.println("*******************************************");
        System.out.println("Kullanici Girisi");
        System.out.println("********************************************");
        
        int giris_hakki=3;
        while(true){
           if(login.login(hesap)){
                System.out.println("giris basarili..");
                break;
            
            }
            else{
                System.out.println("giris basarisiz..");
                giris_hakki-=1;
                System.out.println("kalan giris hakkiniz: "+giris_hakki);
            }
          
        if(giris_hakki==0){
            System.out.println("giris hakkiniz bitti..");
            return;
        }
        }
        
        System.out.println("**************");
        String islemler="1. bakiye goruntuleme\n"
                +"2. para cekme\n"
                +"3. para yatirma\n"
                +"cikis icin q'ya basin";
        
        System.out.println(islemler);
        
        
        while(true){
            System.out.print("lutfen yapmak istediginiz islemi seciniz: ");
            String islem=scanner.nextLine();
            switch (islem) {
                case "1":
                    System.out.println("bakiyeniz: "+hesap.getBakiye());
                    
                    break;
                    
                case "2":
                    System.out.println("Cekmek istediginiz tutari giriniz: ");
                    int tutar=scanner.nextInt();
                    scanner.nextLine();
                    hesap.paraCekme(tutar);
                    break;
                
                case "3":
                    System.out.println("lutfen yatirmak istediginiz tutari girin: ");
                    int yTutar=scanner.nextInt(); //şimdi burada int değeri alıp entera basılıyor fakat nextInt sadece int değerini alıyor boşluk karakterini almıyor..
                    scanner.nextLine(); //dolayısıyla boşluk karakterini bu satırda alıyoruz..
                    hesap.paraYatir(yTutar);
                    break;
                    
                case "q":
                    return;
                    
                default:
                    System.out.println("gecersiz islem...");
                    break;
                    
                    
                
                    
               
            }
            
        }
        
        
        
        
        
        
        
    }
    
    
}
