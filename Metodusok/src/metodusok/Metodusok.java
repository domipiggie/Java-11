/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusok;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Metodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);

        double szam1 = bill.nextDouble();
        double szam2 = bill.nextDouble();

        System.out.println(atlag(szam1, szam2));
        
        feladatKiir();
        
        int randomHatar1, randomHatar2;
        
        do{
            randomHatar1 = bill.nextInt();
            randomHatar2 = bill.nextInt();
        } while(randomHatar1 == randomHatar2);
        
        int[] randomSzamok = new int[20];
        
        for(int i = 0; i < 20; i++){
            randomSzamok[i] = randomHatarokkal(randomHatar1, randomHatar2);
            System.out.print(randomSzamok[i] + "\t");
        }
        System.out.print("Kérem adja meg a gúla alapjának hosszát: ");
        double gulaAlapHossz = bill.nextDouble();
        System.out.print("Kérem adja meg a gúla magasságát: ");
        double gulaMagassag = bill.nextDouble();
        
        System.out.println("\n" + negyzetGulaTerfogat(gulaAlapHossz, gulaMagassag));
    }

    public static double atlag(double szam1, double szam2) {
        double atl = (szam1 + szam2) / 2.0;

        return atl;
    }
    
    public static void feladatKiir(){
        System.out.println("*********************");
        System.out.println("*      Feladat      *");
        System.out.println("*********************");
    }
    
    public static int randomHatarokkal(int hatar1, int hatar2){
        int alsoHatar = Math.min(hatar1, hatar2);
        int felsoHatar = Math.max(hatar1, hatar2);
        
        int random = (int)(Math.random()*(felsoHatar-alsoHatar+1))+alsoHatar;
        
        return random;
    }
    
    public static double negyzetGulaTerfogat(double a, double m){
        return (Math.pow(a, 2) * m)/3;
    }
}
