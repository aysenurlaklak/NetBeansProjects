
package trycatchcalismasi;

import java.io.File;
import java.io.IOException;

public class TryCatchCalismasi {

    public static void main(String[] args) throws IOException {//burda hata fırlatabilir diye uyarı vermemiz gerek
        File file= new File("ogrenciler.txt");
        if (!file.exists())
            file.createNewFile();
        
       
    }
    
}
