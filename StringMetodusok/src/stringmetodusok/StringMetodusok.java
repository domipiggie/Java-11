/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusok;

import java.util.Scanner;

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
        
        //a keresett karakter(ek) első poziciója
        System.out.println(szoveg.indexOf("t"));
        System.out.println(szoveg.indexOf("egy"));
        
        //a keresett karakter(ek) utolsó poziciója
        System.out.println(szoveg.lastIndexOf("t"));
        
        //string üres-e
        System.out.println(szoveg.isEmpty());
        String szoveg2 = "";
        System.out.println(szoveg2.isEmpty());
        
        //lecseréli a szövegben a megadott karakter(ek)et más karakter(ek)re
        System.out.println(szoveg.replace("tetszőleges", "akármilyen"));
        System.out.println(szoveg.replace("e", "b"));
        
        //lecseréli a szövegben az első megadott karakter(ek)et más megadott karakter(ek)re
        System.out.println(szoveg.replaceFirst("e", "b"));
        
        //szétszedése tömbbe megadott karakterek mentén
        System.out.println(szoveg.split(" "));
        
        //nem string típusú adat tringgé alakítása
        Integer szam = 512;
        System.out.println(szam.toString());
        
        //stringből substring kivétele
        System.out.println(szoveg.substring(3, 6));
        
        
        
        //FELADATOKSZ:
        //1: Kérjük be egy diák teljes nevét a fullName változóba!
        Scanner bill = new Scanner(System.in);
        
        String fullName = bill.next() + bill.nextLine();
        
        
        //2: Szedjük szét a nevet firstName és lastName változókba.
        String[] darabolt = fullName.split(" ");
        String firstName = darabolt[1];
        String lastName = darabolt[0];
        
        
        //3: Kérjük be az osztály azonosítóját a classId változóba. pl 2022ea vagy 2018ce
        String classId = bill.next();
        
        
        //4: Ha a betűjele 'e'-vel kezdődik, alakítsuk 'E'-re.
        classId = classId.replaceFirst("e", "E");
        
        
        //5: Ha az évfolyam száma 2022-nél kisebb, akkor az osztályazonosító minden betűje legyen nagy
        if (Integer.parseInt(classId.substring(0,4)) < 2022)
        {
            classId = classId.toUpperCase();
        }
        System.out.println(classId);
        
        
        //6: Ha az osztály minden betűjele nagybetűs, írjuk ki hogy estis osztály.
        String classIdLetters = classId.substring(4);
        if (classIdLetters == classIdLetters.toUpperCase()){
            System.out.println("Estis osztály");
        }
    }
    
}
