
package prog2_menuexample;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;//menü başlığı
import javax.swing.JMenuBar;//menü çubuğu
import javax.swing.JMenuItem;//menü içindeki seçenekler
import javax.swing.JToolBar;

public class Prog2_MenuExample {

    public Prog2_MenuExample(){
          JFrame f = new JFrame();
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenu m3 = new JMenu("View");
        JMenu m4 = new JMenu("Help");
        
        JMenuItem i1 = new JMenuItem("New File");
        JMenuItem i2 = new JMenuItem("Open File");
        m1.add(i1);m1.add(i2);
        JMenuItem i3 = new JMenuItem("Undo");
        JMenuItem i4 = new JMenuItem("Cut");
        JMenuItem i5 = new JMenuItem("Copy");
        
        JMenu submenu= new JMenu("aysenur");
        JMenuItem i6 = new JMenuItem("sahin");
        JMenuItem i7 = new JMenuItem("kavsara");
        
        m2.add(i3);m2.add(i4);m2.add(i5);m2.add(submenu);
        submenu.add(i6);submenu.add(i7);
        
       
        mb.add(m1);mb.add(m2);mb.add(m3);mb.add(m4);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        /*
        //DERSTE GÖRMEDİK 
        JToolBar toolbar = new JToolBar();
        toolbar.add(new JButton("Aç"));
        toolbar.add(new JButton("Kaydet"));
        f.add(toolbar, BorderLayout.CENTER);*/
        





    }
    public static void main(String[] args) {
        new Prog2_MenuExample();
    }
    
}
