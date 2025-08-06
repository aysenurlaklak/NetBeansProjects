

package asalsayi;

public class Asalsayi {

    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int adet=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    adet++;
                    
                }
             
            }
            if(adet==2) {
                System.out.println(i);
            }
        }
     
            
        
    }
}
