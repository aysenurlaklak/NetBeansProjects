
package com.mycompany.bufferedreader;

import java.io.FileReader;
import java.util.Scanner;

public class BufferedReader {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))) {
            while(scanner.hasNextLine()){
                //System.out.println("okunan satir: "+scanner.nextLine());
                //sadece bilg müh okuyan öğrencileri yazdırma:
                
                String ogrenciBilgisi=scanner.nextLine();
                
                String[] array= ogrenciBilgisi.split(",");
                
                if(array[1].equals("bilgisayar muhendisligi")){
                    System.out.println("ogrenciler: " + ogrenciBilgisi);
                }
            }
            
            
        } catch (Exception e) {
            System.out.println("bir hata olustu...");
        }
    }
}
