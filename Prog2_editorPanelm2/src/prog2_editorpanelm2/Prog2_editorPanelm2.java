
package prog2_editorpanelm2;
import javax.swing.*;

public class Prog2_editorPanelm2 {

    public static void main(String[] args) {
       JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
                          
                          
        JEditorPane editorpane = new JEditorPane();//Metin veya HTML gibi içerikleri göstermek için kullanılır.
        editorpane.setContentType("text/html");
        editorpane.setText("""
                          <html>
                          <body> 
                              <h1>Merhaba Dünya!</h1> 
                              <p>Bu bir <b>JEditorPane</b> örneğidir.</p> 
                              <ol>
                                  <li style="color:green; 
                                            font-family:Arial; 
                                            font-size:12pt;
                                            font-style:italic;"> 
                                            HTML görüntüleyebilir
                                  </li>
                                  <li style="color:blue; 
                                            font-family:'Times New Roman'; 
                                            font-size:10pt;">
                                            RTF destekler
                                  </li>
                                  <li style="color:rgb(30,144,255); 
                                            font-family:Calibri; 
                                            font-size:26pt;"> 
                                            Text de olur
                                  </li>
                              </ol> 
                           <p><b>Fotograf:</b></p>
                           <img src="file:///C:\\Users\\Huaweı\\Desktop\\pcmuh.jpg" />
                          <img src="file:///C:/Users/Huaweı/Desktop/pcmuh.jpg" />
                          </body>
                          </html>
                           """);
        editorpane.setEditable(false);
        frame.add(new JScrollPane(editorpane));
        frame.setVisible(true);
        
    }
    
}
