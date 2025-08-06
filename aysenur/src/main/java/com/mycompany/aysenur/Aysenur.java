
package com.mycompany.aysenur;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class Aysenur {

    public static void main(String[] args) {
         File file = new File("C:\\Users\\Huaweı\\Documents\\NetBeansProjects\\aysenur");
        if (!file.exists())
            file.mkdirs();

        klasorOlustur();
    }

    public static void klasorOlustur(){
        String yol ="C:\\Users\\Huaweı\\Documents\\NetBeansProjects\\aysenur";
        int adet = 1;
        for (int i = 0; i < 20; i++) {
            String yeniKlasor = yol+adet;
            adet++;
            File file = new File(yeniKlasor);
            if (!file.exists())
                file.mkdir();

        }
      
  
    }
    }

