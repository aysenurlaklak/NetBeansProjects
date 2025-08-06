
package javaıo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIO {

    public static void main(String[] args) {
        //streamler sadece 1 ve 0 değerleri ile çalışır.
        //fileoutputstream ve fileinputstream mp4,mp3 gibi dosyaaların okunmasında işimize daha çok yarar aslında çünkü bu tipteki dosyalar byte şeklindedir.
        FileOutputStream a=null;
        try {
            a=new FileOutputStream("dosya.txt",true); //BURADAKİ TRUE DEĞERİ DOSYAYA YAZDIRILAN DEĞER DEĞİŞSE BİLE ÖNCEKİ DEĞERLER KALIR. GEÇMİŞİ SİLMİYOR YANİ.
           /* a.write(65);
            a.write(87);
            a.write(102);
            
            byte[] array={101,75,66,68,65};
            a.write(array);*/
           
           //dosya içine string bir ifade yazdırma:
           String s= "aysenur laklak";
           byte[] s_array=s.getBytes();
           a.write(s_array);
           
                   
        } 
        catch (Exception e) {
            System.out.println("Bir hata olustu...");
        }
        finally{
            try {
                a.close(); //arka planda iş yapmasın diye en sonunda mutlaka bu dosyayı kapatır.Ama bu işlem yapılırken de hata oluşabilir bu yüzden try catch bloğu kullanılır.
            
            } 
            catch (IOException e) {
                System.out.println("Dosya kapatilirken bir hata olustu...");
            }
        }
    }
    
}
