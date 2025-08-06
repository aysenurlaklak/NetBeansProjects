
public class Idman {
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int mekik_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int sinav_sayisi, int mekik_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = sinav_sayisi;
        this.mekik_sayisi = mekik_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getMekik_sayisi() {
        return mekik_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public void setMekik_sayisi(int mekik_sayisi) {
        this.mekik_sayisi = mekik_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    
    public void hareketYap(String hareketTuru,int sayi){
        if(hareketTuru.equals("burpee")){
            burpeeYap(sayi);
        }
        else if(hareketTuru.equals("pushup")){
            pushupYap(sayi);
            
        }
        else if(hareketTuru.equals("mekik")){
            mekikCek(sayi);
            
        }
        else if(hareketTuru.equals("squat")){
            squatYap(sayi);
            
        }
        else{
            System.out.println("Bu hareket icin bu idman programi uygun degildir..");
        }
    }
        
    public void burpeeYap(int sayi){
        
        if(burpee_sayisi==0){
            System.out.println("Yapilacak burpee sayisini tamamladiniz..");
        }
        else if(burpee_sayisi<sayi){
            System.out.println("Tebrikler..Hedeflenen burpee sayisini gectiniz..");
            
        }
        
        else{
            burpee_sayisi-=sayi;
            System.out.println("Kalan burpee sayisi: "+burpee_sayisi);
        }
        
            
        }
        
            
    
    public void pushupYap(int sayi){
        
        if(pushup_sayisi==0){
            System.out.println("Yapilacak pushup sayisini tamamladiniz..");
        }
        else if(pushup_sayisi<sayi){
            System.out.println("Tebrikler..Hedeflenen pushup sayisini gectiniz..");
            
        }
        
        else{
            pushup_sayisi-=sayi;
            System.out.println("Kalan pushup sayisi: "+pushup_sayisi);
        }
        
            
    }
        
        
            
    
    public void mekikCek(int sayi){
        
        if(mekik_sayisi==0){
            System.out.println("Yapilacak mekik sayisini tamamladiniz..");
        }
        else if(mekik_sayisi<sayi){
            System.out.println("Tebrikler..Hedeflenen mekik sayisini gectiniz..");
            
        }
        else{
            mekik_sayisi-=sayi;
            System.out.println("Kalan mekik sayisi: "+mekik_sayisi);
        }
        
            
        }
        
            
    
      public void squatYap(int sayi){
        
        if(squat_sayisi==0){
           System.out.println("Yapilacak squat sayisini tamamladiniz..");
        }
        else if(squat_sayisi<sayi){
            System.out.println("Tebrikler..Hedeflenen squat sayisini gectiniz..");
            
        }
        
        else{
            squat_sayisi-=sayi;
            System.out.println("Kalan squat sayisi: "+squat_sayisi);
        }
        
            
        }
        
            
    
    public boolean idmanBittiMi(){
        return (burpee_sayisi==0)&& (pushup_sayisi==0)&& (mekik_sayisi==0)&& (squat_sayisi==0);
    }
    
        
        
}

    
    
    
    

