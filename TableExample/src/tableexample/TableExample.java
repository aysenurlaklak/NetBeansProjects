
package tableexample;
//14/05

import javax.swing.JFrame; //Pencere oluşturmak için.
import javax.swing.JScrollPane; //Tabloya kaydırma çubuğu eklemek için.
import javax.swing.JTable; //Verileri tablo şeklinde göstermek için.





public class TableExample {

        public TableExample() {
        
    JFrame frame=new JFrame("table");
    
    //2 boyutlu bir dizi oluşturuluyor.. örneğin; [0][1]--> Ahmet [2][2]-->70000 değeri oluyor
    String data[][]={
        {"1","Ahmet","50000"},
        {"2","john","55000"},
        {"3","salih","70000"}
    };
    String column[]={"NO","NAME","SALARY"};
    JTable table=new JTable(data,column); //burada tabloya önce veriler sonra da sütun adları verilir..
    JScrollPane scrollPane=new JScrollPane(table);
    frame.add(scrollPane);
    frame.setSize(300,200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    

}

   
    public static void main(String[] args) {
        new TableExample();
    }
    
}
