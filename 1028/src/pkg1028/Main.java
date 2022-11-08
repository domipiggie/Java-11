package pkg1028;

import java.util.Scanner;

/**
 *
 * @author easports
 */
public class Main {

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        String rendszam;
        do {
            rendszam = bill.nextLine();
        }
        while(!isValidRendszam(rendszam));
    }
    
    public static boolean isValidRendszam(String rendszam){
        return rendszam.length() == 6 && rendszam.substring(0,3).matches("[A-Z]+") && rendszam.substring(3).matches("[0-9]+");
    }
}
