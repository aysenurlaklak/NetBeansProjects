
package hesap_mak;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

//bu hesap makinesi aynı anda çoklu işlem yapmaya izin verir 5+9*7-12 gibi... 
//hata aldım daha sonra geliştireceğimmm

public class Hesap_mak extends JFrame {
    private final JTextField ekran; //final: değiştirilemez sabit referans
    private String islem="";
    private double oncekiSayi=0;
    
    public Hesap_mak(){
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
    if (tus.matches("[0-9]") || tus.matches("[+\\-*/]")) {
        ekran.setText(ekran.getText() + tus);
    }
    else if (tus.equals("=")) {
        String ifade = ekran.getText();
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            Object sonuc = engine.eval(ifade); // ifadenin sonucunu hesapla
            ekran.setText(ifade + "=" + sonuc.toString());
        } catch (ScriptException e) {
            ekran.setText("Hatalı işlem");
        }
    }
    else if (tus.equals("C")) {
        ekran.setText("");
    }
}

        
    

   
    public static void main(String[] args) {
        new Hesap_mak();
        
    }
    
}
