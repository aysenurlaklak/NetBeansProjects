
package radiobutton1;

//30/04 prog2

import java.awt.event.ItemEvent;//Radyo butonlarının seçilme/çıkarılma olaylarını algılamak için kullanılır.
import javax.swing.ButtonGroup; //Radyo butonlarını gruplayarak sadece bir tanesinin seçilmesini sağlar.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class RadioButton1 {

   
    public static void main(String[] args) {
        JFrame frame= new  JFrame("jRadioButton Example");
        JLabel label=new JLabel();
        
        //create radio buttons
        
        JRadioButton r1=new JRadioButton("1.Öğretim");
        JRadioButton r2=new JRadioButton("2.Öğretim");
        
        r1.setBounds(100, 50, 100, 30);
        r2.setBounds(100, 100, 100, 30);
        
        //Group the Buttons so ONLY ONE CAN BE SELECTED
        ButtonGroup group=new ButtonGroup();//gruplandırma ile radyo butonlarının biri seçildiğinde diğerindeki seçim kalkar yani tek seçim hakkı oluyor.
        group.add(r1);
        group.add(r2);
        
        //gruplandırma kaldırılırsa butonların ikisi de seçilebiliyor..
        
        r1.addItemListener((e) -> {
            label.setText((e.getStateChange()==ItemEvent.SELECTED ? "Siz 1.öğretimsiniz.":"unchecked"));
        });
        
         r2.addItemListener((e) -> {
            label.setText((e.getStateChange()==ItemEvent.SELECTED ? "Siz 2.öğretimsiniz.":"unchecked"));
        });
        label.setBounds(100, 20, 200, 30);
        frame.add(r1);
        frame.add(r2);
        frame.add(label);
        
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
    }
    
}
//ödev: butona tıklandığında 1. öğretimse siz 1. öğretimsiniz, 2. öğretimse siz 2. öğretimsiniz yazdırın