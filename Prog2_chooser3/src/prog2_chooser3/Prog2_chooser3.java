
package prog2_chooser3;


import javax.swing.JFileChooser; //kullanıcıya dosya veya klasör seçtirmek için

import javax.swing.filechooser.FileSystemView;

public class Prog2_chooser3 {

  
    public static void main(String[] args) {
        
        //FileSystemView.getFileSystemView()---> dosya ve klasörlerim bilgisayarımda nasıl görünüyor ise javada da aynısını göster demek..ikon vs de gösterir. 
        //eğer kullanılmazsa karışıklıklar olabilir..
        JFileChooser fc=new JFileChooser("C:/Users/Huaweı/Desktop/ceng2-bahar/ED",FileSystemView.getFileSystemView()); //escape karakter.. ya sadece tek slash olacak ya da iki tane ters slash
        fc.showSaveDialog(null);
    }
    
}
/*
JFileChooser ile FileSystemView birlikte verilirse Dosya sistemiyle ilgili özel ayar ve kontroller yapılabilir.
escape(kaçış) karakteri \-->  özel karakterleri belirtmek için kullanılır...
*/
