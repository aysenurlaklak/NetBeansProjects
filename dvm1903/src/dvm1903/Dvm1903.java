

package dvm1903; //Javada paketler sınıfları düzenlemek ve gruplamak için kullanılır.
import javax.swing.*; //GUI bileşenlerini kullanabilmek için gerekli. 
import java.awt.event.*; //olay yani butona tıklama gibi etkileşimler için 



public class Dvm1903 implements ActionListener{ //bu sınıf bir olay dinleyicisi olacak mesela butona basıldığında ne yapılacağını tanımlar.
    JLabel l1,l2; //ekranda yazı göstermek için etiketler
    JTextArea area; //Kullanıcının metin gireceği çok satırlı alan.
    JButton b; //Kullanıcının tıklayabileceği buton.
    Dvm1903(){ //constructor.. program başladığında GUI burada oluşturulacak
        JFrame f= new JFrame(); //Yeni bir pencere (frame) oluşturuluyor.
        l1=new JLabel(); //l1 adlı etiket oluşturuluyor ve pencere içindeki konumu ve boyutu ayarlanıyor
        l1.setBounds(120, 75, 100, 30);
        l2=new JLabel(); //İkinci etiket l2 de aynı şekilde oluşturuluyor ve konumlandırılıyor.
        l2.setBounds(200, 75, 100, 30);
        area=new JTextArea(); //Metin alanı oluşturuluyor. Kullanıcı buraya yazı yazacak.
        area.setBounds(130, 100, 200, 200);
        b=new JButton("count words"); //Buton oluşturuluyor ve üzerine "count words" yazılıyor.
        b.setBounds(165, 300, 120, 30);
        b.addActionListener(this); //ile bu sınıf, butonun tıklama olayını dinleyecek şekilde ayarlanıyor.
        f.add(l1);f.add(l2);f.add(area);f.add(b); //Tüm bileşenler pencereye (frame) ekleniyor.
        f.setSize(450, 450); //Pencerenin boyutu ayarlanıyor.
        f.setLayout(null);  // bileşenlerin konumları manuel olarak ayarlanacak 
        f.setVisible(true); // pencere görünür hale getiriliyor
        
        
    }
    public void actionPerformed(ActionEvent e){ //Butona tıklanıırsa çalışacak metot ActionListener arayüzünden gelen zorunlu metot.


        String text=area.getText(); //Kullanıcının metin alanına yazdığı içerik alınıyor.
        String words[]=text.split("\\s"); //Metin boşluk karakterlerine göre bölünüp kelimelere ayrılıyor
        l1.setText("words: " +words.length); //Kelime sayısı l1 etiketinde gösteriliyor.
        l2.setText("characters: " +text.length()); //Karakter sayısı da l2 etiketinde gösteriliyor.
    }
    

   
    public static void main(String[] args) {
        new Dvm1903(); //Programın başlangıç noktası. Yeni bir Dvm1903 nesnesi oluşturuluyor, bu da GUI’yi başlatıyor.
       
    }

   
    
}
