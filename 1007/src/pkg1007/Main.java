package pkg1007;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.println("Írjon be egy nullánál nagyobb, kettővel osztható számot!");
        int szam = bill.nextInt();
        
        // Előltesztelő
        while (!(szam > 0 & szam % 2 == 0)){
            szam = bill.nextInt();
        }
        System.out.println("Továbbhaladási szám: " + szam);
        
        
        // Hátultesztelő
        do {
            szam = bill.nextInt();
        }
        while (!(szam > 0 & szam % 2 == 0));
        System.out.println("Továbbhaladási szám: " + szam);
        System.out.println("");
        
        
        
        // számkitatláló
        int kitalalando = (int)(Math.random() * 10) + 1;
        System.out.println("Gondoltam egy számra 1 és 10 között.");
        System.out.println("Kérem az első számot: ");
        int tipp = bill.nextInt();
        
        while (tipp != kitalalando){
            System.out.println("");
            if (tipp > kitalalando){
                System.out.println("A gondolt szám ennél kisebb.");
            }
            else{
                System.out.println("A gondolt szám ennél nagyobb.");
            }
            
            System.out.println("Kérem a következő számot: ");
            tipp = bill.nextInt();
        }
        
        System.out.println("Siker!");
    }
    
}
