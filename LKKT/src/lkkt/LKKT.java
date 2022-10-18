package lkkt;

import java.util.Scanner;

public class LKKT {
    
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        int szam1 = bill.nextInt();
        int szam2 = bill.nextInt();
        
        int lnko = lnko(szam1, szam2);
        int lkkt =  (szam1 * szam2) / lnko;
        
        System.out.println(lkkt);
    }
    
    static int lnko(int a, int b){
        int szorzat = a*b;
        int maradek = a%b;
            
        while (maradek != 0){
            a = b;
            b = maradek;
            maradek = a%b;
        }
        
        return b;
    }
}
