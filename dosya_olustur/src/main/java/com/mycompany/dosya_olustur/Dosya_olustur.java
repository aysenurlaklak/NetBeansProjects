
package com.mycompany.dosya_olustur;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Dosya_olustur {

    public static void main(String[] args) throws IOException {
      
    
    }
        File b=new File("C:\\Users\\Huaweı\\Documents\\NetBeansProjects\\dosya_olustur");
        String[] liste= b.list();
            for(String string : liste){
                System.out.println(string);
        
        //dosya oluşturma:
        File file= new File("C:\\Users\\Huaweı\\Documents\\NetBeansProjects\\dosya_olustur\\ogrenciler.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        //klasör oluşturma:
         File a= new File("C:\\Users\\Huaweı\\Documents\\NetBeansProjects\\dosya_olustur\\ogrenciBilgisi");
        if(!a.exists()){
            a.mkdir();
        }
        //10 tane dosya oluşturma:
        for(int i=0;i<10;i++){
            String dosya = "ogrencibilgisi"+i+".txt";
            File b= new File("C:\\Users\\Huaweı\\Documents\\NetBeansProjects\\dosya_olustur\\ogrenciBilgisi"+dosya);
            if(!b.exists()){
                b.createNewFile();
            }
            
            
         
            
        }
        
        
    }

