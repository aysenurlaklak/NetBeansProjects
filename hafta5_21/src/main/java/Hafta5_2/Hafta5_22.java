
package Hafta5_2;

public class Hafta5_22 {

   
    public static void main(String[] args) {
    /* -30 ve 30 aralığında x,y'den farklı olmak üzere |x|+|y|<=30 
    eşitsizliğini sağlayan tamsayı çiftlerini ekrana yazan programın kodlarını yazınız*/
    
    for(int x=-30;x<=30;x++){
        for(int y=-30;y<=30;y++){
            if(Math.abs(x)+Math.abs(y)<=30 && x!=y){
                System.out.println("("+x+","+y+")");
            }
        }
    }
        
       
    }
    
}
