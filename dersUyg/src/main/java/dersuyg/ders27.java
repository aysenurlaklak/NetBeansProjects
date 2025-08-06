package dersuyg;

import java.util.Random;

public class ders27 {

    public static void main(String[] args) {
        int[] dizi=new int[20];
        int toplam=0;
        int ort;
        int adet=0;
        Random random= new Random();
        for(int i=0;i<dizi.length;i++){
            dizi[i]=random.nextInt(100);//0 ile 100 arasında
            toplam+=dizi[i];
            System.out.println(dizi[i]);
        }
        ort  =toplam / dizi.length;
        System.out.println("dizinin ortalaması:"+ort);
        
        for(int i=0;i<dizi.length;i++){
            if(dizi[i]>ort){
                 adet++;
            }
               
                
        }
        System.out.println("ortalamadan buyuk elemanlarin sayisi:"+adet);
    }
    
}
