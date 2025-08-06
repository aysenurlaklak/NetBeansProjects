package prog2_1203;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Prog2_1203 {

    public static void main(String[] args) {
        JFrame f=new JFrame("Button example"); //creating a jframe object wit the title.. JFrame penceresi oluşturuluyor. Başlık olarak "Button example" veriliyor.
        final JTextField tf=new JTextField(); //question: why final keyword is used ?is this necessary.. JTextField nesnesi (yani kullanıcıya yazı gösteren bir kutu) oluşturuluyor.
        //final kelimesi değişiklik yapmaya izin vermez. içeriği değiştirilebilir sadece. zorunlu değil ama gerekli..
        tf.setBounds(45, 75, 220, 20); //konum ve boyut ayarlandı
        JButton b=new JButton("click here"); //buton oluşturuldu içinde click here yazıyor..
        b.setBounds(100, 100, 100, 50); //hem konum hem boyut ayarlanır.
        b.addActionListener((ActionEvent e)->{//bu bir lambda ifadesidir ve butona tıklandığında içinde yazı yazıyor.. lambda ile tıklama olayına bir işlem bağlanıyor..
            tf.setText("You have just clicked button!");
        });
        f.add(b);f.add(tf); //button and test added to frame
        f.setSize(300, 300); //sadece boyut ayarlanır..
        f.setLayout(null); //bileşenlerin konumu manuel olarak ayarlanıyor (setbounds ile). eğer otomatik ayarlanmasını istersek layout türleri var..
        f.setVisible(true);
    }
    
}
