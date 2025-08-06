
package ebobbulma;

import java.util.Scanner;

public class EbobBulma {
    
    public static int ebobBul(int sayi1,int sayi2){
        int ebob=1;
        for(int i=1;i<=sayi1 && i<=sayi2;i++){
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("birinci sayi: ");
        int sayi1=scanner.nextInt();
        
        System.out.print("ikinci sayi: ");
        int sayi2=scanner.nextInt();
        
        System.out.println("girilen sayilarin ebobu: "+ ebobBul(sayi1, sayi2));
        
        
        
        
        
        
    }
    
}
