
package ınputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inputstream {

    public static void main(String[] args) {
        FileInputStream b =null;
        try {
            b = new FileInputStream("dosya1.txt");
            /*System.out.println("Birinci karakter: "+(char)(b.read()));
            System.out.println("ikinci karakter: "+(char)(b.read()));
            System.out.println("ucuncu karakter: "+(char)(b.read()));
            
            //istenilen karakterden itibaren okuma yaptırır.
            b.skip(23);
            System.out.println((char)(b.read()));
            System.out.println((char)(b.read()));
            System.out.println((char)(b.read()));
            System.out.println((char)(b.read()));*/
            
            //tüm dosyayı okumak için:
            
            /*int deger;
            String s="";
            
            
            while((deger=b.read())!=-1){
                
                s+=(char)deger;
                
                
            }
            System.out.println("Dosya icerigi: \n"+s);*/
            int deger;
            int say=0;
            b.skip(5);
            String s="";
            
            while((deger=b.read())!=-1){
                s+=(char)deger;
                say++;
                if(say==11){
                    break;
                }
                
            }
            System.out.println("Dosyanin 5. yerinden itibaren 10 karakter: "+s);
            
            


            
            
            
        } 
        catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi...");
        } catch (IOException ex) {
            System.out.println("Dosya okunurken bir hata olustu...");
        } 
        finally {
            try {
                if(b!=null){ //BURADA İF AÇILMASININ SEBEBİ: EĞER BU DOSYA BULUNAMAZSA NULL POİNTER HATASI VERECEK YANİ OLMAYAN BİR ŞEYİ KAPATMAYA ÇALIŞACAK.
                    b.close();
                }
                
            } 
            catch (IOException e) {
                System.out.println("dosya kapatilirken bir hata olustu...");
            }
        }
    }
    
}
