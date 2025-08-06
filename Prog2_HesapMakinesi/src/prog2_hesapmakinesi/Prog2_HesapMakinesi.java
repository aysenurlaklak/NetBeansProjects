
package prog2_hesapmakinesi;

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


public class Prog2_HesapMakinesi extends JFrame{ //jframe sınıfından türetilmiş bir hesap makinesi penceresi oluşturuluyor
    private final JTextField ekran; //final: değiştirilemez sabit referans
    private String islem="";
    private double oncekiSayi=0;
    
    public Prog2_HesapMakinesi(){
        setTitle("Hesap Makinesi");
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); //pencere içindeki nesneleri konumlandırmak için
        
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
            "C","0","=","+",
            
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
    private void tusTiklandi(String tus){
        if(tus.matches("[0-9]")){
            ekran.setText(ekran.getText()+tus);
        }
        else if(tus.matches("[+\\-*/]")){ //burada kaçış karakteri kullanılmış 
            oncekiSayi =Double.parseDouble(ekran.getText());
            islem=tus;
            ekran.setText("");//ekran temizlenir..
        }
        else if(tus.equals("=")){
            double ikincisayi=Double.parseDouble(ekran.getText());
            double sonuc=0;
            
            switch (islem) {
                case "+" -> sonuc=oncekiSayi + ikincisayi;
                case "-" -> sonuc=oncekiSayi - ikincisayi;
                case "*" -> sonuc=oncekiSayi * ikincisayi;
                case "/" -> sonuc=oncekiSayi / ikincisayi;
                
               
            }
            ekran.setText(String.valueOf(sonuc)); //double olan sonuc değeri stringe dönüştürülür
            islem="";
        }
        else if(tus.equals("C")){
            ekran.setText("");
            oncekiSayi=0;
            islem="";
        }
        
    }
    

    
    public static void main(String[] args) {
        new Prog2_HesapMakinesi();
    }
    
}

/*
matches metodu--> girilen string ifade verdiğimiz şablonla eşleşiyorsa true döner.
burada 0-9 şablonu verildi, herhangi bir rakam girildiğinde true döner..
*/
