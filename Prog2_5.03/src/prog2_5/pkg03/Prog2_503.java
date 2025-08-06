
package prog2_5.pkg03;
import javax.swing.*; //Java Swing kütüphanesindeki tüm sınıfları içeri aktarır. JFrame, JButton gibi GUI bileşenleri bu kütüphane içindedir.


public class Prog2_503 {

    public static void main(String[] args) {
        JFrame fr=new JFrame(); //creating instance of JFrame Yeni bir pencere (frame) oluşturur.
        
        JButton but=new JButton("aysenur"); //creating instance of JButton Üzerinde "aysenur" yazılı bir buton oluşturur.
        but.setBounds(100,90,100,50);   //x axis, y axis, width, height 
        
        fr.add(but);        //adding button in Jframe Butonu pencereye (JFrame) ekler.
        
        fr.setSize(500,300);    //300 width and 300 height Pencerenin boyutunu ayarlar: 300x300 piksel.
        fr.setLayout(null);   //no layout managers. Layout manager kullanmaz. Yani bileşenlerin konumu manuel olarak belirlenir (örneğin setBounds ile).
        fr.setVisible(true); //making the frame visible. Pencereyi görünür hale getirir. Eğer bu satır olmazsa pencere ekranda gösterilmez.
    }
    
}
