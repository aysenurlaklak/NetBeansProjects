
package oopgiris;


public class Araba {
    /* ****ERİŞİM BELİRLEYİCİLER ****
    PUBLİC: başka java dosyalarından doğrudan erişilebilir.
    PRİVATE: doğrudan erişim sağlanamaz. getter ve setter dediğimiz metotların kullanılması gerekiyor.
    
    ***ENCAPSULATION: Kapsülleme.. kontrollü erişim sağlamak için belli metotların kullanılmasıdır. (getter-setter)
    
    */
    
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private  String model;
    
    
    public void setModel(String model){
        this.model=model; //this anahtar kelimesi nesneyi işaret eder. karışıklık olmasın diye..
        
    }
    
    public String getModel(){
        return this.model;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kapilar the kapilar to set
     */
    public void setKapilar(int kapilar) {
        if (kapilar<0){
            System.out.println("Kapi sayisi sifirdan kucuk olamaz!"); //bunun gibi istenmeyen durumlarda uyarı verebilmek için set metodu içinde ayarlamalar yapılabilir..
        }
        else{
            this.kapilar = kapilar;
        }
        
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }
    
}
