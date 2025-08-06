
public class Test {
     public static void main(String[] args) {
        /*
         //2. constructor sayesinde buradaki gibi tek tek tanımlama yapmaktan kurtulduk.Direkt nesne oluşturulduğunda 2. constructor çalıştı ve girdiğim parametreler kullanıldı.
        Account account1=new Account();
        account1.setHesapNo("123456");
        account1.setBakiye(1000.0);
        account1.setIsim("Aysenur Laklak");
        account1.setEmail("aysenurlaklak@gmail.com");
        account1.setTelefonNo("795451");
        
        System.out.println("Bakiye: "+  account1.getBakiye());
        System.out.println("isim: "+account1.getIsim());
        */
        /*
        Account account2=new Account("12123",1000.0,"Aysenur Laklak","aysenurlaklak@gmail.com","4569985");
        account2.paraYatir(500);
        account2.paraCekme(800);
        account2.paraYatir(300);
        account2.paraCekme(8000);
        
        Account account3=new Account();
         System.out.println("Mail adresi: " +account3.getEmail());*/
         
        Account account4= new Account();
        account4.bilgileriGoster();
        
        
        
        
        
        
        
        
        
    }
}
