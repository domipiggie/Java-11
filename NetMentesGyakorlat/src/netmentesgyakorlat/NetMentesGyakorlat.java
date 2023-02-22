package netmentesgyakorlat;

import java.util.Scanner;

public class NetMentesGyakorlat {

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        int szam = -1;
        while (szam != 0){
            szam = bill.nextInt();
            
            if (isPrimeNumber(szam)){
                System.out.println("A(z) " + szam + " prím szám.");
            }
        }
    }
    
    public static boolean isPrimeNumber(int number){
        int osztok = 0;
        for (int i = 1; i <= number/2; i++){
            if (number % i == 0){
                osztok++;
            }
        }
        return osztok == 1;
    }
}
