
package prog2_jeditorpane;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Prog2_JEditorPane {

    public static void main(String[] args) {
         JFrame frame = new JFrame("JEditorPane Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText("""
                           <html><boddy>
                           <h1>Mehaba Dünya!</h1>
                           <p>Bu bir <b>JEditorPane</b> örneğidir. </p> 
                           <ul style="color: green; font-size: 12px; font-style: italic; font-family: Arial; "> <b>1.</b> HTML görüntüleyebilir </ul>
                           <ul style="color: blue; font-size: 10px; font-family: Times New Roman;"> <b>2.</b>  RTF destekler </ul>
                           <ul style="color: #87CEFA; font-size: 26px; font-weight: bold; font-family: Calibri;"> <b>3.</b> Text te olur </ul>
                           </ul>
                           </body></html>
                                              // buraya birde fotoğraf ekleme cart curt olayı yap. 
                                              // <img src="dosyayolu.png">                                      
        """);
        editorPane.setEditable(false);
        
        frame.add(new JScrollPane(editorPane));
        frame.setVisible(true);
    }

}

    

