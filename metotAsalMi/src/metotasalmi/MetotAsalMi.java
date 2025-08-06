
package metotasalmi;
public class MetotAsalMi {


    public static void main(String[] args) {
        System.out.println(asalMİ(4));
    }
    
    public static boolean asalMİ(int sayi){
        int adet=0;
        
        for(int i=1;i<=sayi;i++){
            if(sayi%i==0){
                adet++;
            }
        }
           
            
            
        
        
        if(adet==2){
           return true;
                }
        else 
            return false;
        
       
     
    }   
        
        
        
        
            
        
    
        
    
    
}
