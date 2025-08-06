
package com.mycompany.mavenproject1;

public class Mavenproject1 {

    public static void main(String[] args) {
        int[][] sayilar= new int[2][3];
        sayilar[0][0]=11;
        sayilar[0][1]=12;
        sayilar[0][2]=13;
        
        sayilar[1][0]=21;
        sayilar[1][1]=22;
        sayilar[1][2]=23;
        
        System.out.println(sayilar[0][2]);
        System.out.println("dizinin elemanlari");
        
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(sayilar[i][j]+"\t");
            }
            System.out.println("");
        }
  
    }
}
