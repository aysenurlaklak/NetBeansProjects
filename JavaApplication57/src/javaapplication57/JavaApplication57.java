
package javaapplication57;

public class JavaApplication57 {

    
    public static void main(String[] args) {
          String[][][] dizi = {
            {
                {"Elma", "Armut"},
                {"Muz", "Karpuz"}
            },
            {
                {"Domates", "Salatalık"},
                {"Patlıcan", "Biber"}
            }
        };

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("==== BLOK " + i + " ====");
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length; k++) {
                    System.out.print(dizi[i][j][k] + "\t"); // Tab boşluğu ile hizalama
                }
                System.out.println(); // Satır sonu
            }
            System.out.println(); // Bloklar arası boşluk
        }
    }
    
}
