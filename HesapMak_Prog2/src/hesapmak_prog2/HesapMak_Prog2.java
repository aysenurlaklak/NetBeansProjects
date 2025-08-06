
package hesapmak_prog2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class HesapMak_Prog2 extends JFrame{
    private final JTextField ekran;
    private String islem = "";
    private double oncekiSayi=0;
    
    public HesapMak_Prog2(){
        setTitle("Hesap Makinesi");
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        ekran=new JTextField();
        ekran.setFont(new Font("Arial",Font.BOLD,24));
        ekran.setHorizontalAlignment(JTextField.RIGHT);
        ekran.setEditable(false);
        add(ekran, BorderLayout.NORTH);
        JPanel tusPaneli = new JPanel(new GridLayout(4,4,5,5));
        String[] tuslar= {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "C","0","=","+",
        };
        for (String yazi : tuslar){
            JButton btn = new JButton(yazi);
            btn.setFont(new Font("Arial",Font.BOLD,18));
            tusPaneli.add(btn);
            btn.addActionListener(new ActionListener(){
               @Override 
               public void actionPerformed(ActionEvent e){
                   tusTiklandi(btn.getText());
               }
            });
        }
        add(tusPaneli, BorderLayout.CENTER);
        setVisible(true);
    }
    private void tusTiklandi(String tus){
        if(tus.matches("[0-9]")){
            ekran.setText(ekran.getText()+tus);
        }
        else if(tus.matches("[+\\-*/]")){
            oncekiSayi = Double.parseDouble(ekran.getText());
            islem= tus;
            ekran.setText(ekran.getText() + tus);
        }
        else if(tus.equals("=")){
    String[] parcalar = ekran.getText().split("[+\\-*/]");
    if (parcalar.length < 2) return; // Hatalı giriş varsa hiçbir şey yapma

    double ikinciSayi = Double.parseDouble(parcalar[1]);

    double sonuc = 0;
    switch(islem){
        case "+" -> sonuc = oncekiSayi + ikinciSayi;
        case "-" -> sonuc = oncekiSayi - ikinciSayi;
        case "*" -> sonuc = oncekiSayi * ikinciSayi;
        case "/" -> sonuc = oncekiSayi / ikinciSayi;
    }

    ekran.setText(ekran.getText() + "=" + sonuc);
    islem = "";
}
        else if(tus.equals("C")){
            ekran.setText("");
            oncekiSayi=0;
            islem="";
        }
        
}
        
    

    
    public static void main(String[] args) {
        new HesapMak_Prog2();
        
    }
    
}
