
package dvm1903_2;
import javax.swing.*;


public class Dvm1903_2 {

    //şifre girişi içeren bir GUI 
    public static void main(String[] args) {
        JFrame f= new JFrame("Password field example");//yeni bir pencere oluşturulur. Başlık çubuğunda "Password field example" yazacaktır.
        JPasswordField passf= new JPasswordField(); //Şifre girişi yapılabilecek bir alan oluşturulur.
        //JPasswordField, JTextField'a benzer, fakat içine yazılan metni nokta veya yıldız gibi maskelerle gizler.
        JLabel l1=new JLabel("password: "); //Kullanıcıya bilgi vermek için bir etiket (label) oluşturulur.
        l1.setBounds(20, 100, 80, 30);
        passf.setBounds(100, 100, 100, 30);
        f.add(passf);f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}
