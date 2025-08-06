
package prog2_hesapmakodev;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Prog2_HesapMakOdev extends JFrame {
    private final JTextField ekran; //final: değiştirilemez sabit referans
    private String islem="";
    private double oncekiSayi=0;
    
    public Prog2_HesapMakOdev(){
        setTitle("Hesap Makinesi");
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); //pencere içindekinesneleri konumlandırmak için
        
        ekran=new JTextField();
        ekran.setFont(new Font("Arial",Font.BOLD,24));
        ekran.setHorizontalAlignment(JTextField.RIGHT);//yazılar sağdan hizalanır
        ekran.setEditable(false); //kullanıcı doğrudan yazamaz, sadece butonla girer
        add(ekran,BorderLayout.NORTH);//pencerenin üst kısmına eklenir
        
        JPanel tusPaneli=new JPanel(new GridLayout(4,4,5,5));//4e4 lük tuşları oluşturduk, 5 piksel de aralarındaki boşlukları temsil ediyor..
        
        String[] tuslar={
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "C","0","=","+"
            
        }; 
        
        for(String yazi: tuslar){
            JButton btn=new JButton(yazi);
            btn.setFont(new Font("Arial",Font.BOLD,18));
            tusPaneli.add(btn);
            btn.addActionListener(new ActionListener(){
                @Override //bunu kullanmazsak kod çalışır ama hatayı yakalayıp yakalayamadığını anlamak için kullanılması tavsiye edilir...
                public void actionPerformed(ActionEvent e){
                    tusTiklandi(btn.getText()); // Tıklanan tuşun yazısı alınır ve işlenir
                }
            });
            
        }
        add(tusPaneli,BorderLayout.CENTER);
        setVisible(true);
        
    }
   private void tusTiklandi(String tus) {
    // Eğer sayı veya işlemse, doğrudan ekrana ekle
    if (tus.matches("[0-9]") || tus.matches("[+\\-*/]")) {
        ekran.setText(ekran.getText() + tus); // işlemi biriktir
    }

    // "=" tuşuna basıldıysa
    else if (tus.equals("=")) {
        try {
            // Mevcut ekran metnini işle
            String ifade = ekran.getText();
            double sonuc = hesapla(ifade);
            ekran.setText(ifade + "=" + sonuc); // işlemi ve sonucu birlikte göster
        } catch (Exception e) {
            ekran.setText("Hatalı işlem");
        }
    }

    // "C" tuşuna basıldıysa ekranı temizle
    else if (tus.equals("C")) {
        ekran.setText("");
    }
   }

    private double hesapla(String ifade) {
    // Sadece 2 operand ve 1 işlem destekleyen basit yorumlayıcı
    if (ifade.contains("+")) {
        String[] parcalar = ifade.split("\\+");
        return Double.parseDouble(parcalar[0]) + Double.parseDouble(parcalar[1]);
    } else if (ifade.contains("-")) {
        String[] parcalar = ifade.split("\\-");
        return Double.parseDouble(parcalar[0]) - Double.parseDouble(parcalar[1]);
    } else if (ifade.contains("*")) {
        String[] parcalar = ifade.split("\\*");
        return Double.parseDouble(parcalar[0]) * Double.parseDouble(parcalar[1]);
    } else if (ifade.contains("/")) {
        String[] parcalar = ifade.split("/");
        return Double.parseDouble(parcalar[0]) / Double.parseDouble(parcalar[1]);
    }

    return 0; // hiçbir işlem yoksa 0 döner
    }

public static void main(String[] args) {
        new Prog2_HesapMakOdev();
        
    }
    
}
