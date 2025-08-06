
package oopgiris;

public class OOPGiris {

    
    public static void main(String[] args) {
        Araba araba1=new Araba(); //obje oluşturuldu..
        
        araba1.setModel("mercedes");
        
        System.out.println("Arabanin modeli:"+araba1.getModel());
        araba1.setKapilar(-7);
        araba1.setKapilar(8);
        System.out.println("Arabanin kapi sayisi:"+araba1.getKapilar());
        
        
       
    }
    
}
