
package listexample;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

//14/05

public class ListExample {

   
    public static void main(String[] args) {
        JFrame f = new JFrame("JList Example");

        f.setSize(500, 500);
        f.setLayout(null);  // Bileşenleri elle yerleştirmek için
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Buton oluştur
        JButton b = new JButton("TIKLA");
        b.setBounds(150, 200, 200, 50);

        // Şehir listesi oluştur
        String[] cities = {"Istanbul", "Ankara", "Izmir", "Bursa", "Antalya"};
        JList<String> cityList = new JList<>(cities);
        cityList.setBounds(150, 50, 200, 100);  // Konumlandır

        // ScrollPane içine listeyi koy (isteğe bağlı)
        JScrollPane sc = new JScrollPane(cityList);
        sc.setBounds(150, 50, 200, 100);  // ScrollPane de aynı yere konmalı

        // Bileşenleri pencereye ekle
        f.add(b);
        f.add(sc);

        // Butona tıklanınca seçilen şehir ekrana yazdırılır
        b.addActionListener(e -> {
            String selectedCity = cityList.getSelectedValue();  // Seçilen şehir
            if (selectedCity != null) {
                System.out.println("Secilen sehir: " + selectedCity);
            } else {
                System.out.println("Lutfen bir sehir secin.");
            }
        });

        // Pencereyi görünür yap
        f.setVisible(true);
    }
    
}
