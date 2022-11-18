package szemelyigazolvany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Szemelyigazolvany {
    static ArrayList<String> correctFormats = new ArrayList<>(Arrays.asList("DDDDDDUU", "DDDDDDLU", "UUDDDDD"));

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        String igazolvanyszam;
        
        do{
            System.out.println("Kérem írja be a személyi igazolványának számát: ");
            igazolvanyszam = bill.nextLine();
        } while(!isCorrectIDNumber(igazolvanyszam));
    }
    
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static boolean isCorrectIDNumber(String idnum){
        String format = "";
        
        for (int i = 0; i < idnum.length(); i++){
            if (Character.isDigit(idnum.charAt(i))){
                format = format.concat("D");
            }
            else if (Character.isLetter(idnum.charAt(i)) && Character.isUpperCase(idnum.charAt(i))){
                format = format.concat("U");
            }
            else if (Character.isLetter(idnum.charAt(i)) && Character.isLowerCase(idnum.charAt(i))){
                format = format.concat("L");
            }
            else {
                format = format.concat("O");
            }
        }
        
        return correctFormats.contains(format);
    }
}
