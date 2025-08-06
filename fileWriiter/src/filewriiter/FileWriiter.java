
package filewriiter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileWriiter {

    public static void main(String[] args) {
        try {
            FileWriter yazici=new FileWriter("Dosya2.txt");
            yazici.close();
            } 
        catch (IOException ex) {
            Logger.getLogger(FileWriiter.class.getName()).log(Level.SEVERE, null, ex);
        }
            /*FileWriter writer=null;
            try {
            writer= new FileWriter("dosya2.txt");
            
            }
            catch (Exception e) {
            System.out.println("dosya acilirken bir hata olustu...");
            }
            finally {
            if(writer!=null){
            try{
            writer.close();
            }
            catch(IOException e){
            System.out.println("Dosya kapatilirken bir hata olustu...");
            }
            }
            }*/
        
    }
    
}
