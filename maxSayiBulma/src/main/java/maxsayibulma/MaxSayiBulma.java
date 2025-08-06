
package maxsayibulma;

import java.util.Scanner;

public class MaxSayiBulma {

    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz: ");
        int a=scanner.nextInt();
        System.out.println("ikinci sayiyi giriniz: ");
        int b=scanner.nextInt();
        System.out.println("ucuncu sayiyi giriniz: ");
        int c=scanner.nextInt();
        
        int max= -1;
        
        if(a>=b && a>=c){
            max=a;
        }
        else if(b>=a && b>=c){
            max=b;
        
        }
        else{
            max=c;
        
        }
        System.out.println("girilen sayilardan en buyugu:" +max );
            
    
    
    }
}
