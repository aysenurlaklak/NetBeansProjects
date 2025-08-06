
package prog2_calisma3;
import javax.swing.JFileChooser; // kullanıcıya dosya veya klasör seçtirmek için
import javax.swing.filechooser.FileSystemView;
import java.io.File;


public class Prog2_calisma3 {

    
    public static void main(String[] args) {
        // Dosya sisteminin varsayılan görünümünü alıyoruz
        FileSystemView fsv = FileSystemView.getFileSystemView();
        
        // JFileChooser'ı başlangıç klasörü ve FileSystemView ile oluşturuyoruz
        JFileChooser fc = new JFileChooser("C:\\Users\\Huaweı\\Desktop\\ceng2-bahar\\ED", fsv);
        
        // Dosya kaydetme penceresini açıyoruz ve sonucu alıyoruz
        int result = fc.showSaveDialog(null);
        //Burada showSaveDialog() çağrısı, kullanıcı seçim yapana kadar beklediği için, dinleyici eklemeye gerek yoktur.
        
        // Eğer kullanıcı "Kaydet" butonuna bastıysa seçilen dosyanın yolunu yazdırıyoruz
        if (result == JFileChooser.APPROVE_OPTION) { //kullanıcı dosyayı seçtiğinde bu blok çalışır, iptal etme gibi durum olursa o zaman bu kısım çalışmayacaktır.yani kullanıcı dosya seçmeden direkt cancel'e de basabilir.
            File selectedFile = fc.getSelectedFile();
            System.out.println("Seçilen dosya: " + selectedFile.getAbsolutePath());
        }
        
        // Şu an aktif olan dizini ekrana yazdırıyoruz
        File currentDirectory = fc.getCurrentDirectory();
        System.out.println("Varsayılan dizin: " + currentDirectory.getAbsolutePath());
        
        
    }
    
}
