
public class yazilimci extends Calisan {
    private String diller;
    
    //üst sınıftaki değişkenler private olduğu için doğrudan kullanım yapılamaz o yüzden constructor yazdık..
    public yazilimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id); //Burada üst sınıfın constructorı çağrılıyor..
        this.diller=diller;
        
    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd()+" "+ isletim_sistemi +"'u yukluyor..");
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("yazilimcinin bildigi diller: "+diller);
    }
    
}
