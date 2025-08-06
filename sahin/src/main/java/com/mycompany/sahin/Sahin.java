
package com.mycompany.sahin;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Sahin {

    public static void main(String[] args) {
        FileWriter yazici=null;
        try {
             yazici=new FileWriter("dosya2.txt");
             
             yazici.write("aysenur");
             yazici.write("laklak");
            
        } catch (IOException ex) {
            System.out.println("dosya acilirken bir hata olustu...");
        }
        finally{
            try {
                if(yazici!=null){
                    yazici.close();
                    
                }
            } 
            catch (Exception e) {
                System.out.println("dosya kapatilirken bir hata olustu...");
                
            }
        }
    }
}
