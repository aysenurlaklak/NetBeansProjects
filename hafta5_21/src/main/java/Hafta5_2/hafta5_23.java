package Hafta5_2;


public class hafta5_23 {

    
    public static void main(String[] args) {
        
        long a1=1;
        long a2=1;
        System.out.println(a1);
        System.out.println(a2);
        for(int i=1;i<50;i++){
            a1+=a2;
            System.out.println(a1);
            a2=a1+a2;
            System.out.println(a2);
        }
        
        //do while döngüsü ile:
        /*int a1=1;
        int a2=1;
        int i=1;
        
        do {
            
            System.out.println(a1);
            System.out.println(a2);
            a1=a1+a2;
            a2=a1+a2;
            i++;
            
            
            
        } while(i<50);*/
            
    }
}
    

