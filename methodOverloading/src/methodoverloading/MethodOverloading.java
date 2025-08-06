
package methodoverloading;

import java.util.Scanner;

public class MethodOverloading {
    public static int cikarma(int a, int b){
        return a-b;
    }
    public static double bolme(int a, int b){
        return ((double)a/b);
    }
    public static int toplama(int a, int b){
        return a+b;
    }
    public static int toplama(int a, int b, int c){
        return a+b+c;
    }
    public static int carpma(int a, int b){
        return a*b;
    }
    public static int carpma(int a, int b,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
       String islemler = "1. Toplama islemi"+
               "2.cikarma islemi"+
               "3.carpma islemi"+
               "4.bolme islemi"+
               "cikis icin q'ya basin.";
       
        System.out.println("***********************************************");
        System.out.println(islemler);
        System.out.println("***********************************************");
        
        while(true){
            System.out.println("lutfen islem seciniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                
            }
            else if(islem.equals("1")){
                System.out.print("kac sayi toplamak istersiniz(2 veya 3): ");
                int kacsayi= scanner.nextInt();
                
                
             
                
                if(kacsayi==2){
                    System.out.print("a: ");
                    int a= scanner.nextInt();
                    System.out.print("b: ");
                    int b= scanner.nextInt();
                    System.out.print("girilen sayilarin toplami: "+toplama(a,b));
                    
                }
                else if(kacsayi==3){
                    System.out.print("a: ");
                    int a= scanner.nextInt();
                    System.out.print("b: ");
                    int b= scanner.nextInt();
                    System.out.print("c: ");
                    int c= scanner.nextInt();
                    System.out.print("girilen sayilarin toplami: "+toplama(a,b,c));
                    
                }
                else{
                    System.out.println("bunun icin uygun metot bulunamiyor...");
                    
                }
                
                    
            else if(islem.equals("2")){
                System.out.print("a: ");
                int a= scanner.nextInt();
                System.out.print("b: ");
                int b= scanner.nextInt();
                System.out.println("girilen sayilarin farki: "+cikarma(a, b));
                        
            }    
                //bölüm7 udemy son video tekrar bakk!!
                
                    
            }
           
            
        }
    }
    
}
