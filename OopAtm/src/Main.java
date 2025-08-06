
public class Main {

   
    public static void main(String[] args) {
        ATM atm=new ATM();
        
        Hesap hesap=new Hesap("Aysenur Laklak","1234" , 2000); //Hesap classından hesap adında bir obje oluşturuldu..
        
        atm.calis(hesap);
        System.out.println("Programdan cikiliyor...");
        
    }
    
}
