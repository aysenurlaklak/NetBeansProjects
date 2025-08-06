package kilometrehesaplama;

import java.util.Scanner;
public class Kilometrehesaplama {

    public static void main(String[] args) {
        Scanner miktar = new Scanner(System.in);
        System.out.println("Araciniz kilometrede ne kadar yakmaktadir?");
        double yakit= miktar.nextDouble();
        Scanner gidilen_yol = new Scanner(System.in);
        System.out.println("kac kilometre yol gittiniz? ");
        double yol= gidilen_yol.nextDouble();
        double ucret=yakit*yol;
        System.out.println("Odemeniz gereken yakit miktari:" + ucret);
        
    }
}
