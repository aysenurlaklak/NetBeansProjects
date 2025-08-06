
package prog2_popupmenuexample;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;


public class Prog2_PopupMenuExample {

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPopupMenu Örneği");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextArea textArea = new JTextArea("Buraya sağ tıkla!");
        textArea.setBounds(0, 0, 400, 300);

        // Popup menü oluşturuluyor
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem kes = new JMenuItem("Kes");
        JMenuItem kopyala = new JMenuItem("Kopyala");
        JMenuItem yapistir = new JMenuItem("Yapıştır");

        popupMenu.add(kes);
        popupMenu.add(kopyala);
        popupMenu.add(yapistir);

        // Menü öğelerine basıldığında yapılacak işlemler
        kes.addActionListener(e -> textArea.cut());
        kopyala.addActionListener(e -> textArea.copy());
        yapistir.addActionListener(e -> textArea.paste());

        // Sağ tıklama algılama (MouseListener)
        textArea.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(textArea, e.getX(), e.getY());
                }
            }
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(textArea, e.getX(), e.getY());
                }
            }
        });

        frame.add(textArea);
        frame.setVisible(true);
        
    }
    
}
