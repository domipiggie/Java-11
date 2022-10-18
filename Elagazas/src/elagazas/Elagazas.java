/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elagazas;

/**
 *
 * @author user3
 */
public class Elagazas {

    public static void main(String[] args) {
        // egyágú elágazás
        int szam = 25;
        if (szam > 20){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: " + szam*2);
        }
        
        // kétágú elágazás
        if (szam > 20){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: " + szam*2);
        }
        else{
            System.out.println("Nem nagyobb");
        }
        
        // többáhú elágazás
        if (szam > 20){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: " + szam*2);
        }
        else if (szam == 20){
            System.out.println("Egyenlő");
        }
        else{
            System.out.println("Kisebb");
        }
        
        // switch / sok ágú
        int honap = 12;
        switch( honap ) {
            case 1: System.out.println("Január"); break;
            case 10: System.out.println("Október"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default : System.out.println("Nem meghatározható"); break;
        }
        
        //FELADAT
        // random generáltassunk egy karaktert:
        int randomCharCode = (int)((Math.random() * 26) + 97);
        System.out.println(randomCharCode);
        char randomChar = (char)(randomCharCode);
        System.out.println(randomChar);
        
        // 30 elemű tömb, töltsük fel random karakterekkel
        
    }
    
}
