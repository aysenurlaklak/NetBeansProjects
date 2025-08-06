
public class Hesap {
    private String kullanici_adi;
    private String parola;
    private double Bakiye;

    public Hesap(String kullanici_adi, String parola, double Bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.Bakiye = Bakiye;
    }

    
    public String getKullanici_adi() {
        return kullanici_adi;
    }

    
    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    
    public String getParola() {
        return parola;
    }

    
    public void setParola(String parola) {
        this.parola = parola;
    }

    
    public double getBakiye() {
        return Bakiye;
    }

   
    public void setBakiye(double Bakiye) {
        this.Bakiye = Bakiye;
    }
    
    public void paraYatir(int miktar){
        Bakiye+=miktar;
        System.out.println("Yeni Bakiye: "+Bakiye);
        
    }
    public void paraCekme(int miktar){
        if(Bakiye<miktar){
            System.out.println("Bakiyeniz yetersiz!");
        }
        else{
        Bakiye-=miktar;
        System.out.println("Yeni Bakiye: "+Bakiye);
        }
    }
    
    
    
}
