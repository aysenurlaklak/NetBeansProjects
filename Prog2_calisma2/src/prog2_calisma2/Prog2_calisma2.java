
package prog2_calisma2;
import javax.swing.*;
import java.awt.event.*;


public class Prog2_calisma2 {

    public static void main(String[] args) {
    JFrame frame = new JFrame("Ana Pencere");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton buttonNull = new JButton("Save Dialog with null");
        buttonNull.setBounds(50, 50, 200, 30);

        JButton buttonFrame = new JButton("Save Dialog with frame");
        buttonFrame.setBounds(50, 100, 200, 30);

        frame.add(buttonNull);
        frame.add(buttonFrame);

        // null ile açılan dosya kaydetme penceresi
        buttonNull.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            int result = fc.showSaveDialog(null);//burada frameden bağımsız bir yerde açılıyor
            if (result == JFileChooser.APPROVE_OPTION) {
                System.out.println("Seçilen dosya (null): " + fc.getSelectedFile().getAbsolutePath());
            }
        });

        // frame'e bağlı açılan dosya kaydetme penceresi
        buttonFrame.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            int result = fc.showSaveDialog(frame);//burada frame'in üstünde açılıyor..
            if (result == JFileChooser.APPROVE_OPTION) {
                System.out.println("Seçilen dosya (frame): " + fc.getSelectedFile().getAbsolutePath());
            }
        });

        frame.setVisible(true);

        
        
    }
    
}
