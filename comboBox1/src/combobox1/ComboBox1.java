
package combobox1;
import javax.swing.*;
import java.awt.FlowLayout;//Pencere içindeki bileşenlerin sırayla soldan sağa dizilmesini sağlayan düzen yöneticisi.
import java.awt.event.ActionListener;

//Buna buton  ve action listener eklenecek, seçim yapıldığında ekrana şu dersi seçtiniz diye yazdırın..


public class ComboBox1 {
    JFrame f;

   ComboBox1() {
       f=new JFrame("combobox1");
       
       String lectures []={"prog2","web aplications","data structures","english","data science"};
       JComboBox cb=new JComboBox(lectures);
       JButton button = new JButton("onayla");
       JLabel label=new JLabel();
       
       //burada flowlayout kullanıldığı için setbounds'ların bi önemi yok, gereksiz
       /*button.setBounds(50, 60, 50, 30);
       label.setBounds(50, 30, 50, 50);
       cb.setBounds(50, 40, 70, 70);*/
       
       f.add(cb);
       f.add(button);
       f.add(label);
       
       f.setLayout(new FlowLayout()); //soldan sağa doğru sıralar otomatik olarak ayarlama yapılıyor
       f.setSize(200, 200);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    
    }
    

 
    public static void main(String[] args) {
        new ComboBox1();
        
    }
    
}
/*
DÜZEN YÖNETİCİSİ setlayout için: 
null---> setbounds ile manuel olarak ayarlama yapılmalı..
flowlayout--> soldan sağa satır satır sıralar..
borderlayout--> pencereyi 5 bölgeye ayırır: north(üst),south(alt),east(sağ),west(sol),center şeklinde.

*/

