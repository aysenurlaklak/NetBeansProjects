
package constructor;
import javax.swing.*;
public class Constructor {

    //JFrame f; eğer f nesnesi burada tanımlanırsa bu sınıf içindeki diğer metotlar tarafından kullanılabilir. GUI nesnelerinin bu şekilde tanımlanması daha kullanışlıdır.
    Constructor(){
        JFrame f;   // fakat burada tanımlama yapıldığında sadece constructor içinde geçerlidir constructor dışında f değişkenine erişilemez. 
        //Burada yapıcı metot tamamlandıktan sonra f bellekten silinecektir.
        
        f =new JFrame();
        JButton b=new JButton("click");
        b.setBounds(100,100,90,50);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        
    
    }
    public static void main(String[] args) {
        new Constructor();
    }
    
}
