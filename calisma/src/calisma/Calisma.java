/*
package calisma;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

//satırın tamamını seçtiren kod ve seçilen satırları konsola yazdıran kod:

public class Calisma {

    Calisma(){
        JFrame f = new JFrame("Table");

        String data[][] = {
            {"1", "ahmet", "50000"},
            {"2", "john", "55000"},
            {"3", "salih", "70000"}
        };

        String column[] = {"NO", "NAME", "SALARY"};

        JTable t = new JTable(data,column);

        
        t.setCellSelectionEnabled(false);//Hücre seçimi devre dışı bırakıldı. Yani tek tek hücre seçilemez.
        t.setColumnSelectionAllowed(false);//Sütun seçimi aktif edildi. Kullanıcı sütunların tamamını seçebilir.
        t.setRowSelectionAllowed(true);//Satır seçimi devre dışı bırakıldı.
        
        t.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Sadece tek bir seçim yapılabilir. Yani aynı anda birden fazla sütun seçilemez.

        JScrollPane sc = new JScrollPane(t);

        t.getSelectionModel().addListSelectionListener(e -> {//sütun seçim modelini al buna listener ekle
            if (!e.getValueIsAdjusting()) { //bu kontrol ile 2 kez yazdırılma problemi önlendi..sadece seçim tamamlandığında çalışır
            
            int row = t.getSelectedRow();
            if (row != -1) {
                System.out.println("Selected Row: " + row);
                for (int col = 0; col < t.getRowCount(); col++) {
                    System.out.println("Row " + col + ": " + t.getValueAt(row, col));
                }
            }
            }
        });
        

     

        f.add(sc);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    //Burada konsola iki kez yazdırma işlemi yapılıyor.Bu listselectionlistenerden dolayı oluyor.
    //Listselectionlistener otomatik olarak 2 kez çalışıyormuş biri seçim sırasında diğeri ise seçim bittikten sonra.
    public static void main(String[] args) {
        new Calisma();
    }
    
}*/

package calisma;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

//sütunun tamamını seçtiren kod ve seçilen satırları konsola yazdıran kod:

public class Calisma {

    Calisma(){
        JFrame f = new JFrame("Table");

        String data[][] = {
            {"1", "ahmet", "50000"},
            {"2", "john", "55000"},
            {"3", "salih", "70000"}
        };

        String column[] = {"NO", "NAME", "SALARY"};

        JTable t = new JTable(data,column);

        
        t.setCellSelectionEnabled(false);//Hücre seçimi devre dışı bırakıldı. Yani tek tek hücre seçilemez.
        t.setColumnSelectionAllowed(true);//Sütun seçimi aktif edildi. Kullanıcı sütunların tamamını seçebilir.
        t.setRowSelectionAllowed(false);//Satır seçimi devre dışı bırakıldı.
        
        t.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//Sadece tek bir seçim yapılabilir. Yani aynı anda birden fazla sütun seçilemez.

        JScrollPane sc = new JScrollPane(t);

        t.getColumnModel().getSelectionModel().addListSelectionListener(e -> {//sütun seçim modelini al buna listener ekle
            if (!e.getValueIsAdjusting()) { //bu kontrol ile 2 kez yazdırılma problemi önlendi..sadece seçim tamamlandığında çalışır
            
            int col = t.getSelectedColumn();
            if (col != -1) {
                System.out.println("Selected column: " + column[col]);
                for (int row = 0; row < t.getRowCount(); row++) {
                    System.out.println("Row " + row + ": " + t.getValueAt(row, col));
                }
            }
            }
        });
        

     

        f.add(sc);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    //Burada konsola iki kez yazdırma işlemi yapılıyor.Bu listselectionlistenerden dolayı oluyor.
    //Listselectionlistener otomatik olarak 2 kez çalışıyormuş biri seçim sırasında diğeri ise seçim bittikten sonra.
    public static void main(String[] args) {
        new Calisma();
    }
    
}
