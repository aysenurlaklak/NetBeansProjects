import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.UnknownHostException; //to catch unknown host (domain) error
public class IPFinderApp extends JFrame implements ActionListener{
    private final JTextField tf;
    private final JLabel l;
    private final JButton b;
    
    public IPFinderApp(){
        //title of the frame
        super("IP finder");
        
        //input
        tf= new JTextField("enter a domain (e.g. google.com)",20);
        tf.setForeground(Color.GRAY);
        tf.setBounds(50, 50, 250, 30);
        l= new JLabel("reult will be displayed here.");
        l.setBounds(50, 100, 300, 30);
        
        //Find IP button
        b=new JButton("find IP");
        b.setBounds(50, 150, 120, 40);
        b.addActionListener(this);
        
        setLayout(null);
        add(tf);
        add(b);
        add(l);
        
        
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
                
    }
    public void actionperformed(ActionEvent e){
        try{
            String host = tf.getText().trim();
            if(host.isEmpty() || host.equalsIgnoreCase("enter a domain (e.g. google.com)"))
            {
                JOptionPane.showMessageDialog(this, "please enter a valid domain name!","Input error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            String ip =java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of"+ host + "is:"+ ip);
            
        }
        catch(UnknownHostException ex){
            JOptionPane.showMessageDialog(this, "invalid domain or no internet connection!","error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        new IPFinderApp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
