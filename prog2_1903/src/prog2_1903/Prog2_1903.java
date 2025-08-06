
package prog2_1903;
import javax.swing.*; 


public class Prog2_1903 {
    Prog2_1903(){ //constructor--> sınıftan bir nesne oluştuğunda çalışacaktır.
        JFrame f=new JFrame(); //ana pencere oluşturulur.
        JTextArea area =new JTextArea("This a textArea"); //yazı kutusu oluşturulur. içine tırnak içindeki yazılıyor
        area.setBounds(20, 40, 300, 300);// konumu ve boyutları ayarlanıyor
        f.add(area); //areayı pencereye ekler
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }

    
    public static void main(String[] args) {
        new Prog2_1903(); // sınıftan bir nesne oluşturuldu.. böylece constructor çalışır, GUI oluşturulur
        
    } // JTextArea --> Kullanıcı, bu alanda yazı yazabilir veya içeriği okuyabilir.
    
}
