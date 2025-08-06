
public class yonetici extends Calisan {
    private int sorumlu_kisi_sayisi;
    public yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("yoneticinin sorumlu oldugu kisi sayisi: "+sorumlu_kisi_sayisi);
        
    }
    public void zamYap(int zam){
        System.out.println(getAd()+" " + zam + "tl kadar zam yapiyor..");
    }

   
    
}
