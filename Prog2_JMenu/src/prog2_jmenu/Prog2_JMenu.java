
package prog2_jmenu;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Prog2_JMenu {
    public Prog2_JMenu(){
      JFrame f=new JFrame("Menu Example");
      JMenuBar mb=new JMenuBar();
      JMenu menu=new JMenu("ŞAHİNLE EVLEN");
      
      JMenu submenu=new JMenu("EVET");
      JMenuItem i1=new JMenuItem("merhaba");
      JMenuItem i2=new JMenuItem("nasılsın");
      JMenuItem i3=new JMenuItem("naber");  
      JMenuItem i4=new JMenuItem("TABİKİDE EVET");
      JMenuItem i5=new JMenuItem("TABİKİDE");
      
      menu.add(i1); menu.add(i2); menu.add(i3); 
      submenu.add(i4); submenu.add(i5);
      
      menu.add(submenu);
      mb.add(menu);
      
      f.setJMenuBar(mb);
      f.setSize(400,400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
        
    }

    
    public static void main(String[] args) {
        new Prog2_JMenu();
        
    }
    
}
