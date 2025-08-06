
package com.mycompany.trywithresource;

import java.io.FileWriter;
import java.util.Scanner;

public class TryWithResource {

    public static void main(String[] args) {
        try (FileWriter yazici1 =new FileWriter("diller.txt")){
            Scanner scanner=new Scanner(System.in);
            String dil;
            
            while(true){
                System.out.println("Bir dil giriniz: ");
                dil=scanner.nextLine();
                
                if(dil.equals("-1")){
                    System.out.println("Programdan cikiliyor..");
                    System.out.println("girilen bilgiler dosyaya eklendi.");
                    break;
                }
            yazici1.write(dil+"\n");
                
            }
            
        } 
        catch (Exception e) {
            System.out.println("Bir hata olustu...");
        }
    }
}
