
package checkbox2_3004;

import java.awt.event.ItemEvent;//checkbox olaylarını yakalamak için..
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//koda dinleyici ekleyelim: hangi box işaretli ise ya da değilse o box işaretli ya da değil yazsın..
public class CheckBox2_3004 {

    CheckBox2_3004() {
        JFrame frame=new JFrame("Checkbox2");
        JLabel label =new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);//metin ortalanıyor..
        label.setBounds(50, 20, 300, 30);//konum ve boyut ayarlanıyor..(x,y,genişlik,yükseklik)
        
        
        
        JCheckBox checkBox1 =new JCheckBox("No");//no yazan checkbox oluşturuluyor..
        checkBox1.setBounds(160, 100, 80, 25);
        
        JCheckBox checkBox2 =new JCheckBox("Yes");//yes yazan başka bir checkbox oluşturuluyor.. 
        checkBox2.setBounds(160, 120, 100, 30);
        
        
        //checkboxlara dinleyici ekleniyor..
        checkBox1.addItemListener(e ->{
            label.setText("No checkbox: "+ (e.getStateChange()==ItemEvent.SELECTED ? "checked":"unchecked"));//eğer checkbox işaretlendiyse checked, kaldırıldıysa unchecked yazsın
            
        });
         checkBox2.addItemListener(e ->{
            label.setText("Yes checkbox: " + (e.getStateChange()==ItemEvent.SELECTED ? "checked":"unchecked"));
            
        });
         
         //bileşenler pencereye ekleniyor
         frame.add(checkBox1);
         frame.add(checkBox2);
         frame.add(label);
         
         //pencere ayarları
         frame.setSize(300, 300);
         frame.setLayout(null);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
        
        
        
        
    }
    

    
    public static void main(String[] args) {
        new CheckBox2_3004();
        
    }
    
}
