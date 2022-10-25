/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1025stringmetodusdoga;

/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Sok lúd disznót győz.";
        String masikszoveg = "";
        
        // 1. szöveg hossza
        System.out.println(szoveg.length());
        
        // 2. szöveg első karaktere
        System.out.println(szoveg.charAt(0));
        
        // 3. szoveg egyenlő-e masikszoveg-el
        System.out.println(szoveg.equals(masikszoveg));
        
        // 4. tartalmazza-e a lúd szót
        System.out.println(szoveg.contains("lúd"));
        
        // 5. melyik pozíció a lúd
        System.out.println(szoveg.indexOf("lúd"));
        
        // 6. lúd lecserélése verébre
        System.out.println(szoveg.replace("lúd", "veréb"));
        
        // 7. első szóköz utáni szöveg
        System.out.println(szoveg.substring(szoveg.indexOf(" ")+1));
    }
    
}
