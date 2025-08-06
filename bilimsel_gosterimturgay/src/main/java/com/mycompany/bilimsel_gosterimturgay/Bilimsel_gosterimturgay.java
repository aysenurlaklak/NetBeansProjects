
package com.mycompany.bilimsel_gosterimturgay;


public class Bilimsel_gosterimturgay {

    public static void main(String[] args) {
        double d1=10.52e+2; //double d1=10.52e2; //e veya E noktanın old yerden kaydırma yapıyor
        System.out.println(d1); //1052.0
        double d2=10.52e-2; //10.52 x 10-2
        System.out.println(d2); // 0.1052
        long b=1_452_785_789_785L;//okunabilirlik için _ 
        System.out.println(b);
    }
}
