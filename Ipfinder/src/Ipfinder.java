import javax.swing.*; // GUI bileşenleri için
import java.awt.*; //// Renk ve yerleşim ayarları için
import java.awt.event.*; // Olay (event) yönetimi için
import java.net.UnknownHostException; // Ağ hatalarını yakalamak için




public class Ipfinder extends JFrame implements ActionListener 
        //burada Jframe den kalıtım alınmış..  tek tek Jframe nesnesi oluşturmakla uğraşılmıyor.
        // interface implement ediliyor
{
    //private final birlikte kullanıldığında bu demektir:
    //"Bu değişken sadece bu sınıf içinde erişilebilir ve başka bir nesne atanamaz." Bu da yazılımın daha güvenli, daha tutarlı ve bakımı kolay olmasını sağlar. 
    private final JTextField tf;  //***final için açıklama: ➤ O nesneye yeni bir referans atanamaz,➤ Ama nesnenin içeriği hâlâ değişebilir. 
    private final JLabel l;
    private final JButton b;   
  
    public Ipfinder(){
        super("IP Finder");// JFrame üst sınıfının yapıcı metodunu çağırarak, pencerede "IP Finder" başlığını gösteren bir pencere oluşturur. 
        //super genelde üst sınıfın yapıcı metodunu çağırmak için kullanılıyor..
        tf=new JTextField("Enter a domain (e.g google.com)");
        tf.setForeground(Color.BLUE);//yazının rengini mavi yapar.
        tf.setBounds(50,50,250,30);
        
        l= new JLabel("result will be displayed here.");//Sonuçları gösterecek olan etiket oluşturuluyor.
        l.setBounds(50,100,300,30);
        
        b=new JButton("Find IP");//"Find IP" yazılı bir buton oluşturulur.
        b.setBounds(50,150,120,40);
        b.addActionListener(this); //Butona tıklama olayını dinler. Bu, Ipfinder sınıfının ActionListener arayüzünü uyguladığı için, butona tıklama olayını kendisi yönetir.
        
        setLayout(null);
        add(tf);
        add(b);
        add(l);
        
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Pencereyi kapattığınızda uygulamanın tamamen kapanmasını sağlar.
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) //butona tıklanması gibi bir olay gerçekleştiğinde çalışacak olan metoddur.
    {
        try {
            String host=tf.getText().trim(); //Metin kutusundaki yazıyı alır ve başındaki/sonundaki boşlukları temizler.
            if(host.isEmpty() || host.equalsIgnoreCase("Enter a domain (e.g google.com)"))
            {
            JOptionPane.showMessageDialog(this,"Please enter a valid domain name","Input Error",JOptionPane.ERROR_MESSAGE); 
            return; //Eğer kullanıcı geçerli bir alan adı girmemişse (boş bırakmış ya da varsayılan metni kullanmışsa), bir hata mesajı gösterir.
            }
            String ip=java.net.InetAddress.getByName(host).getHostAddress();// Alan adından (domain) IP adresini bulur.


            l.setText("IP of "+host+" is: "+ip);// Bulunan IP adresini etiket üzerinde gösterir.
        }
        catch(UnknownHostException ex){
            JOptionPane.showMessageDialog(this,"Invalid domain or no internet connection","Error",JOptionPane.ERROR_MESSAGE);
        } //Eğer geçersiz bir alan adı girilirse veya internet bağlantısı yoksa, bir hata mesajı gösterir.
    }
    public static void main(String[] args)
    {
        new Ipfinder();
    }
}
/* 
ÖRNEK FİNAL KULLANIMI: 
final JLabel label = new JLabel("ilk yazı");
label.setText("yeni yazı"); // BU OLUR!
label = new JLabel("başka label"); // BU HATA!

*/