
package crcv_panel;
import javax.swing.*;

public class Crcv_panel {

   
    public static void main(String[] args) {
        //frame örneği
        JFrame frame = new JFrame("Frame Örneği");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
      
        
        JFrame frame1 = new JFrame("Panel Örneği");
        frame1.setSize(400, 300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel oluştur
        JPanel panel = new JPanel();
        
        // Bileşenler ekle
        JLabel label = new JLabel("Bu bir JPanel!");
        JButton button = new JButton("Tıkla");

        // Panel içine bileşenleri ekle
        panel.add(label);
        panel.add(button);

        // Frame içine paneli ekle
        frame1.add(panel);

        // Görünürlüğü aç
        frame1.setVisible(true);
        
        
    }
    
}
