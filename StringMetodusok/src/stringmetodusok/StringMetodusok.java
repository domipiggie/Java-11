/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusok;

/**
 *
 * @author user3
 */
public class StringMetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Ez egy nem tetszőleges szöveg. ";
        
        // szöveg hozzáadása
        System.out.println(szoveg.length());
        
        // adott ponton lévő karakter
        System.out.println(szoveg.charAt(5));
        
        // kisbetűs
        System.out.println(szoveg.toLowerCase());
        
        // nagybetűs
        System.out.println(szoveg.toUpperCase());
        
        // sor eleji és végi szóközök levágása
        System.out.println(szoveg.trim().length());
        
        // összehasonlítás
        System.out.println(szoveg.compareTo("Ez egy nem tetszőleges szöveg."));
        System.out.println(szoveg.compareToIgnoreCase("ez egy nem tetszőleges szöveg. "));
        System.out.println(szoveg.equals("Ez egy ..."));
        System.out.println(szoveg.equalsIgnoreCase("ez egy nem tetszőleges szöveg. "));
        
        // hozzáfűzes
        System.out.println(szoveg.concat("Ez pedig egy hozzáfűzés."));
        
        // tartalmazza-e
        System.out.println(szoveg.contains("tetszőleges"));
        
        // végződik-e
        System.out.println(szoveg.endsWith(" "));
        
        // kezdődik-e
        System.out.println(szoveg.startsWith("k"));
    }
    
}
