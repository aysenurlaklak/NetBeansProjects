
package prog2_jeditorpaneodev;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class Prog2_jEditorPaneOdev {

   
    public static void main(String[] args) {
       JFrame frame = new JFrame("Stilli HTML Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JEditorPane editorpane = new JEditorPane();
        editorpane.setContentType("text/html");
        editorpane.setText("""
            <html> 
            <head> 
                <style> 
                    li.item1 { 
                        font-family: Arial; 
                        font-size: 12pt; 
                        font-style: italic; 
                        color: green; 
                    } 
                    li.item2 { 
                        font-family: 'Times New Roman'; 
                        font-size: 10pt; 
                        font-style: normal; 
                        color: blue; 
                    } 
                    li.item3 { 
                        font-family: Calibri; 
                        font-size: 26pt; 
                        font-weight: bold; 
                        color: #66ccff; /* Açık mavi */ 
                    } 
                </style> 
            </head> 
            <body> 
                <h1>Yeni Liste</h1> 
                <ol> 
                    <li class="item1">HTML görüntüleyebilir</li> 
                    <li class="item2">RTF destekler</li> 
                    <li class="item3">Text de olur</li> 
                </ol> 
                           
                   <h2>Resim Örneği</h2>
                    <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Globe_icon.svg/1024px-Globe_icon.svg.png"
                                 width="300" height="200" alt="Dünya resmi"/>
                           
            </body> 
            </html>
        """);

        editorpane.setEditable(false); // sadece görüntüleme için
        JScrollPane scrollPane = new JScrollPane(editorpane);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
    
}
