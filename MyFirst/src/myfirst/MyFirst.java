/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirst;

/**
 *
 * @author user3
 */
public class MyFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("H");

        // deklaráció
        int szam = 15;
        System.out.println("\nA megadott érték: "+szam);
        
        double magassag = 1.83;
        System.out.println("Magasságom: "+magassag+" méter");
        System.out.println("Magasságom: "+magassag*100+" centiméter");
        
        
        // Very menő loop
        for(int i=0; i<=3; i++){
            System.out.println(i);
        }
    }
    
}
