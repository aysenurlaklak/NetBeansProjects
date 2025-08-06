
package prog2_3004;

//checkbox örneği**
import javax.swing.JCheckBox;
import javax.swing.JFrame;



public class Prog2_3004 {
    Prog2_3004(){
        //Jframe oluşturuluyor.
        JFrame frame= new JFrame("checkbox Example");
        //checkboxlar oluşturuluyor..
        JCheckBox checkBox1=new JCheckBox("No");
        checkBox1.setBounds(120, 200, 50, 25);
        
        JCheckBox checkBox2=new JCheckBox("Yes",true);//yes seçeneği seçili olarak geliyor
        checkBox2.setBounds(120, 230, 80, 25);
        
        //checkboxlar ekleniyor..
        frame.add(checkBox1);
        frame.add(checkBox2);
        
        //pencere ayarları
        frame.setSize(300, 300);//sadece genişlik,yükseklik
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
  
        
        
    }
    public static void main(String[] args) {
        new Prog2_3004();
        
        
    }
    
}
