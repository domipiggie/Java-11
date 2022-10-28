package pkg1028;

import java.util.Scanner;

/**
 *
 * @author easports
 */
public class Main {

    public static void main(String[] args) {
        boolean helyes = false;
        Scanner bill = new Scanner(System.in);
        
        do {
            String rendszam = bill.nextLine();
            
            if (rendszam.length() == 6 && rendszam.substring(0,3).matches("[A-Z]+") && rendszam.substring(3).matches("[0-9]+")){
                helyes = true;
            }
        }
        while(!helyes);
    }
}
