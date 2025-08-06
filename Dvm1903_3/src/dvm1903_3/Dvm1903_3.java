
package dvm1903_3;


public class Dvm1903_3 {

   
    public static void main(String[] args) {
        String text="HELLO WORLD! This is a test.";
        String[] words=text.split("\\s"); //\\s ifadesi bir regex (regular expression) yani düzenli ifade olarak çalışır ve boşluk (space) karakterini temsil eder.
        
        System.out.println("kelime sayisi:" +words.length);
        for(String word:words){
            System.out.println(word);
        }

      
        
        
        
    }
    
}
