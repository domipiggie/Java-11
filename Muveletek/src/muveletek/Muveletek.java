/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muveletek;

/**
 *
 * @author user3
 */
public class Muveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // matematikai műveletek
          // két operandusú
            int a = 43;
            int b = 35;
            
            int osszeg = a + b;
            int kulonbseg = a - b;
            int szorzat = a * b;
            double hanyados = (double)a / (double)b;
            System.out.println(hanyados);
            
            int maradek = a % b; // az a/b osztás MARADÉKÁT adja
            System.out.println(maradek);
           
          // egy operandusú
            int c = 5;
            c++; // c értékének növelése 1-gyel postfix fromában
            System.out.println(c); // c értéke 6
            System.out.println(c++); // c értéke 6 majd növeli 1-gyel ->
            System.out.println(++c); // c értéke 8 lesz, ezt íratjuk ki
            
            int d = 3;
            d--; //2
            System.out.println(--d); // 1
            
          // relációs műveletek
            int x = 9;
            int y = 14;
            
            System.out.println(x > y); // false
            System.out.println(x >= y); // true
            System.out.println(x < y); // false
            System.out.println(x <= y); // true
            System.out.println(x == y); // false
            System.out.println(x != y); // true
          
          // logikai műveletek
          System.out.println("\nLogikai műveletek");
            boolean t = true;
            boolean f = false;
            
            System.out.println(t && f); // és művelet, minden feltétel igaz
            
            System.out.println(t || f); // vagy művelet, legalább egy feltétel igaz
            
            System.out.println(!t); // negáció művelet
            
          // értékadó művelet
            int k;
            
            k = 3;
            k = k + 1;
            k += 1; // összevontuk a műveleteket
            k -= 1;
            k *= 2;
            k /= 4;
            k %= 2;
          
          // összetett műveletek
          System.out.println("\nÖsszetett műveletek");
            int z = 12;
            // 3-mal és 4-gyel is osztható-e
            System.out.println(z%3==0 && z%4==0);
            
            // 3-mal vagy 4-gyel osztható-e
            System.out.println(z%3==0 || z%4==0);
            
            // 3-mal és 5-tel nem osztható-e
            System.out.println(!(z%3==0 && z%5==0));
            
            // 5-tel osztható nem negatív szám-e
            System.out.println(z>-1 && z%5==0);
            
          // 
    }
    
}
