
package combobox2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//7 mayıs 

public class ComboBox2 {
    JFrame frame;

    public ComboBox2() {
        frame = new JFrame("course selection");
        JLabel label=new JLabel("",JLabel.CENTER);//x ekseninde ortalatıyor.
        label.setBounds(50, 30, 300, 30);
        
        String[] courses={"programing languages","data structures","english","web aplications"};
        
        JComboBox<String> comboBox = new JComboBox<>(courses); //generic kullanıldı <> bu işaret generic demek.. 
        //<String> ifadesi generic —> yani ComboBox’ın sadece String türünde öğeler tutacağını belirtir.
        comboBox.setBounds(50, 80, 150, 25);
        
        JButton button =new JButton("show selection");
        button.setBounds(220, 80, 130, 25);
        
        //lambda ifadesi kullandık..
        button.addActionListener(e ->{ //Bu metodun dönüş tipi Object olduğu için String'e dönüştürmek (cast etmek) gerekiyor.
            String selected= (String) comboBox.getSelectedItem(); //casting: dönüşüm yapılması demek yine detaylı bak.. Burada alınan öge string olarak alınmak zorunda mı ? casting hangi durumlarda yapılır? 
            label.setText("selected course: "+selected);
            
        });
        frame.add(label);
        frame.add(comboBox);
        frame.add(button);
        frame.setSize(420, 200);
       
       frame.setLayout(new FlowLayout()); //soldan sağa doğru sıralar otomatik olarak ayarlama yapılıyor.. setbounds satırı burada gereksizdir..
       
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    


    public static void main(String[] args) {
        new ComboBox2();
        
    }
    
}
/*
31. satırda alınan ögenin dönüş tipi object olarak alınıyor genel bir tanım yapılmış yani bunu stringe dönüştürmek gereklidir..
eğer generic kullansaydık burada da cast etmemize gerek kalmazdı:
JComboBox<String> comboBox = new JComboBox<>(courses);
String selected = comboBox.getSelectedItem(); // artık cast gerekmez (Java 7+ ile)


***yukarıdaki generic kullanımı ile comboboxın string değerler alabileceğini belirtirken
aşağıdaki casting işlemi ile getselecteditem ile alınan object tipini stringe çevirdik.

*/
