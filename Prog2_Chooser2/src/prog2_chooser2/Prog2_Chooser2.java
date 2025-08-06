
//28mayıs
package prog2_chooser2;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;



//Kullanıcıya dosya kaydedilirken dosyanın kaydedileceği yeri seçmesi için bir pencere oluşturuluyor ama kaydetme işlemi yapılmıyor..
public class Prog2_Chooser2 {

    
    public static void main(String[] args) {
        JFileChooser fc=new JFileChooser("c:"); //direkt c dizinine götürüyor.
        fc.showSaveDialog(null);
    }
    
}
