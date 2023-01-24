//Hozz létre egy java projektet, neve a saját neved legyen. 
//A válaszok kiírása egész mondatos szövegként történjen. Példa: "A tömbben 2 olyan szám van, amit nagyobb szám követ."

//Feladatok:
//1.
//Kérje be a program a felhasználótól az email címét addig, amíg formailag nem megfelelő címet ad meg
//Az ellenőrzéshez készíts egy saját metódust, ami visszaadja, hogy helyes vagy nem helyes a formátum
//A formátum akkor helyes, ha van benne @ jel

//2.
//Hozz létre egy 5 elemű tömböt vagy ArrayList-et. Töltsd fel random egész szám adatokkal 10 és 20 között
//hány olyan szám van a tömbben vagy listában, melyet egy tőle nagyobb szám követ?
//Vizsgáld meg, hogy a tömb elemei növekvő sorrendben állnak-e
package bastidomonkos;

import java.util.Scanner;

public class BastiDomonkos {

    public static void main(String[] args) {
        //1. feladat
        System.out.println("1. Feladat");
        Scanner bill = new Scanner(System.in);
        String email;
        do {
            System.out.print("Kérem adjon meg egy email címet: ");
            email = bill.nextLine();
        }while(!emailChecker(email));
        System.out.println("Helyes email.\n");
        
        
        //2. feladat
        System.out.println("2. Feladat");
        int[] randomSzamok = new int[5];
        for (int i = 0; i < randomSzamok.length; i++){
            randomSzamok[i] = (int)(Math.random()*(11))+10;
        }
        
        
        int nagyobbSzamKovet = 0;
        for (int i = 0; i < randomSzamok.length-1; i++){
            if (randomSzamok[i] < randomSzamok[i+1]){
                nagyobbSzamKovet++;
            }
        }
        System.out.println(nagyobbSzamKovet + "db szám van a tömbben melyet egy tőle nagyobb szám követ.");
        
        
        if (nagyobbSzamKovet == randomSzamok.length-1){
            System.out.println("A tömbben lévő számok növekvő sorrendben állnak.");
        }
        else{
            System.out.println("A tömbben lévő számok nem állnak növekvő sorrendben.");
        }
    }
    
    public static boolean emailChecker(String email){
        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@'){
                return true;
            }
        }
        
        return false;
    }
}
