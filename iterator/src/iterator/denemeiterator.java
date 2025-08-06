
package iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class denemeiterator {

  
    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
        list.add("Elma");
        list.add("Armut");
        list.add("Kiraz");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            // Eğer "Armut" elemanını koleksiyondan silmek istersek:
            if (fruit.equals("Armut")) {
                iterator.remove();
            }
        }

        System.out.println("Koleksiyonun son hali: " + list);
    }
    
}
