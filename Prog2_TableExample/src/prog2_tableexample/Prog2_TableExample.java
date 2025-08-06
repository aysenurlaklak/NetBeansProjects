
package prog2_tableexample;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Prog2_TableExample {

    public Prog2_TableExample() {
        // Pencere oluştur
        JFrame frame = new JFrame("Table Example");

        // Tablo verisi ve sütun başlıkları
        String[][] data = {
            {"1", "Ahmet", "50000"},
            {"2", "John", "55000"},
            {"3", "Salih", "70000"}
        };
        String[] columns = {"No", "Name", "Salary"};

        // JTable oluştur
        JTable table = new JTable(data, columns);
        table.setCellSelectionEnabled(true);
        
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Çoklu seçim

        // ScrollPane'e tabloyu ekle ve pencereye yerleştir
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Pencere ayarları
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Hem satır hem sütun seçimlerini dinlemek için iki farklı dinleyici ekle
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int row = table.getSelectedRow();
                    int col = table.getSelectedColumn();
                    if (row != -1 && col != -1) {
                        System.out.println("Selected: " + table.getValueAt(row, col));
                    }
                }
            }
        });

        table.getColumnModel().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int row = table.getSelectedRow();
                    int col = table.getSelectedColumn();
                    if (row != -1 && col != -1) {
                        System.out.println("Selected: " + table.getValueAt(row, col));
                    }
                }
            }
        });
        
    }
    

   
    public static void main(String[] args) {
        new Prog2_TableExample();
        
    }
    
}
