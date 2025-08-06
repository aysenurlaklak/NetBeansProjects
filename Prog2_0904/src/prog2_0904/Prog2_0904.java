
package prog2_0904;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.time.LocalDateTime; //Şu anki tarih ve saati almak için
import java.time.format.DateTimeFormatter; //tarihi biçimlendirmek için

public class Prog2_0904 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Giriş Ekranı");

    JLabel label = new JLabel(); //sonuç mesajının olduğu etiket
    label.setBounds(20, 130, 350, 80);

    JPasswordField passwordField = new JPasswordField();//yıldızlı karakterlerle şifre girilmesini sağlar.
    passwordField.setBounds(100, 75, 100, 25);

    JLabel l1 = new JLabel("Username:");  //kullanıcı adı için açıklama etiketi
    l1.setBounds(20, 20, 80, 25);

    JLabel l2 = new JLabel("Password:");  //şifre için açıklama etiketi
    l2.setBounds(20, 75, 80, 25);

    JButton b = new JButton("login");
    b.setBounds(100, 120, 80, 25);

    JTextField text = new JTextField(); //kullanıcı adının girileceği yazı kutusu
    text.setBounds(100, 20, 100, 25);
    
    JLabel zamanLabel=new JLabel(); //giriş zamanı için etiket. en alttaki yazı
    zamanLabel.setBounds(20, 150, 200, 100);

    f.add(passwordField);
    f.add(l1);
    f.add(label);
    f.add(l2);
    f.add(b);
    f.add(text);
    f.add(zamanLabel);

    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   
    b.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = text.getText();
        String password = new String(passwordField.getPassword());

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        zamanLabel.setText("deneme zamani:" + formattedDateTime);

        if (username.equals("aysenur") && password.equals("1234")) {
            label.setText("giris basarili.. hosgeldiniz " + username);
        } else {
            label.setText("Hatalı kullanıcı adı veya şifre");
        }
    }
});
    }}
    
