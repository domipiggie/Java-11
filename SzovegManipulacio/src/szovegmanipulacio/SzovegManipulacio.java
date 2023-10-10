/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package szovegmanipulacio;

/**
 *
 * @author domi
 */

/*
A StringBuilder egy olyan osztály a Java nyelvben, amelyet a karakterláncok
(szövegek) hatékony manipulálására terveztek. A StringBuilder alkalmas szövegek
összefűzésére, szövegek módosítására, szövegek beszúrására, megfordítására is.
Segítségül: StringBuilder fordított = new StringBuilder(szoveg);
*/
import java.util.Scanner;

public class SzovegManipulacio {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem, adjon meg egy szöveget: ");
        String szoveg = scanner.nextLine();

        // 1. metódus: Számolja meg, hány karakterből áll a szöveg.
        int karakterSzam = karakterSzamolas(szoveg);
        System.out.println("A szöveg " + karakterSzam + " karakterből áll.");

        // 2. metódus: Fordítsa meg a szöveget.
        String fordítottSzoveg = szovegForditasa(szoveg);
        System.out.println("A szöveg fordítva: " + fordítottSzoveg);

        // 3. metódus: Ellenőrizze, hogy a szöveg palindróma-e.
        boolean palindroma = isPalindroma(szoveg);
        if (palindroma) {
            System.out.println("A szöveg palindróma.");
        } else {
            System.out.println("A szöveg nem palindróma.");
        }

        // 4. metódus: Szöveg összehasonlítás
        String masikSzoveg = "Ez egy masik szoveg";
        boolean azonos = szovegOsszehasonlitas(szoveg, masikSzoveg);
        if (azonos) {
            System.out.println("A két szöveg azonos.");
        } else {
            System.out.println("A két szöveg nem azonos.");
        }

        // 5. metódus: Szöveg cseréje
        char csereKarakter = 'e';
        char ujKarakter = 'X';
        String csereltSzoveg = szovegCsere(szoveg, csereKarakter, ujKarakter);
        System.out.println("A szöveg cserélve: " + csereltSzoveg);

        // 6. metódus: Szószámoló
        int szoSzam = szoSzamolas(szoveg);
        System.out.println("A szövegben " + szoSzam + " szó található.");
    }
    
    public static int karakterSzamolas(String szoveg){
        return szoveg.length();
    }
    
    public static String szovegForditasa(String szoveg){
        StringBuilder forditottSzoveg = new StringBuilder(szoveg);
                
        return forditottSzoveg.reverse().toString();
    }
    
    public static boolean isPalindroma(String szoveg){
        return szoveg.toLowerCase().matches(szovegForditasa(szoveg).toLowerCase());
    }
    
    public static boolean szovegOsszehasonlitas(String szoveg, String masikSzoveg){
        return szoveg.matches(masikSzoveg);
    }
    
    public static String szovegCsere(String szoveg, char csereKarakter, char ujKarakter){
        return szoveg.replace(csereKarakter, ujKarakter);
    }
    
    public static int szoSzamolas(String szoveg){
        int szoSzam = 1;
        szoveg = szoveg.trim();
        
        for (int i = 1; i < szoveg.length(); i++){
            if (szoveg.charAt(i) == ' ' && szoveg.charAt(i-1) != ' '){
                szoSzam++;
            }
        }
        
        return szoSzam;
    }
}