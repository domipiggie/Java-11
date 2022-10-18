/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beolvasasrandomizalas;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class BeolvasasRandomizalas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        /*// adat beolvasá billentyűzetről - egész szám
        System.out.print("Adj meg egy egész számot: ");
        int szam1;
        szam1 = bill.nextInt();
        System.out.println("A beolvasott érték: " + szam1);
       
        // adat beolvasása billentyűzetről - valós szám
        System.out.print("Adj meg egy valós számot: ");
        float szam2;
        szam2 = bill.nextFloat();
        System.out.println("A beolvasott érték: " + szam2);
        
        // adat beolvasása billentyűzetről - string
        System.out.print("Adj meg egy szöveget: ");
        String text1;
        text1 = bill.next();
        text1 += bill.nextLine();
        System.out.println("A beolvasott érték: " + text1);*/
        
        // random szám generálás:
        // (Math.random()*(felső-alsó+1) )+alsó;
        int randomSzam = (int)(Math.random() * 21) + 10; // 10-30 közötti szám
        System.out.println(randomSzam);
        
        // [-55;15]
        int a = (int)(Math.random() * 71) - 55;
        System.out.println(a);
        
        // [-40;5]
        int b = (int)(Math.random() * 46) - 40;
        System.out.println(b);
        
        // [60;105]
        int c = (int)(Math.random() * 46) + 60;
        System.out.println(c);
        
        // [-45;-20]
        int d = (int)(Math.random() * 26) - 45;
        System.out.println(d);
    }
}
