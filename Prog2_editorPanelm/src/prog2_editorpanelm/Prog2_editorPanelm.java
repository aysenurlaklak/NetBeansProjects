
package prog2_editorpanelm;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class Prog2_editorPanelm {

    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        JEditorPane editorpane = new JEditorPane();//Label'dan farklı olarak çok satırlı ve biçimlendirilmiş içerik destekler.
        editorpane.setContentType("text/html");//içeiğin html old belirtir
        editorpane.setText("""
                          <html>
                            <body>
                                <h1>Merhaba Dünya!</h1>
                                <p>Bu bir <b>JEditorPane</b> örneğidir.</p>
                                <ul>
                                    <li>HTML görüntüleyebilir</li>
                                    <li>RTF destekler </li>
                                    <li>Text de olur</li>
                                </ul> 
                           </body>
                          </html>
                        """);
        editorpane.setEditable(false);//kullanıcının metin üzerinde değişiklik yapmasını engeller. sadece görüntülenir yazılamaz
        frame.add(new JScrollPane(editorpane));
        frame.setVisible(true);
       
    }
    
}
//ul sırasız liste, ol sıralı liste
