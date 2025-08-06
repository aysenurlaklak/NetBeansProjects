
package com.mycompany.kabarciksiralama;

public class KabarcikSiralama {

    public static void main(String[] args) {
        
        int sayilar[]={8,20,4,7,3};
        int n = sayilar.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sayilar[j] > sayilar[j + 1]) {
                    int temp = sayilar[j];
                    sayilar[j] = sayilar[j + 1];
                    sayilar[j + 1] = temp;
                }

            }
        }
        for(int i=0;i<sayilar.length;i++){
            System.out.println(sayilar[i]);
        }
    }
}
