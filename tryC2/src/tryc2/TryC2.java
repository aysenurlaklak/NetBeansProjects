
package tryc2;

public class TryC2 {
    static void hataOlusturanMetot()throws ArithmeticException{
        
        System.out.println("Bu metot hata olusturabilir.");
        
    }
    static void hataOlusturmaMetodu(){
        
        throw new ArithmeticException();
        
    }
    

    public static void main(String[] args){
        hataOlusturanMetot();
        hataOlusturmaMetodu();
        
    }
    
}
