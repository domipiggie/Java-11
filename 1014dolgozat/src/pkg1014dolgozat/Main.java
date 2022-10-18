package pkg1014dolgozat;

/**
 *
 * @author user3
 */
public class Main {
    
    public static void main(String[] args) {
        int[] szamok = new int[] {3,2,15,4,42,3};
        
        // 1.
        int paratlan = 0;
        int i;
        
        for (i = 0; i < szamok.length; i++){
            if (szamok[i] % 2 != 0){
                paratlan++;
            }
        }
        System.out.println(paratlan);
        
        // 2.
        int osszeg = 0;
        
        for (i = 0; i < szamok.length; i++){
            osszeg += szamok[i];
        }
        System.out.println(osszeg);
        
        // 3.
        i = 0;
        while (i < szamok.length && (i < 10 || i > 20)){
            i++;
        }
        System.out.println(i);
        if (i < szamok.length){
            System.out.println("Van");
        }
        else{
            System.out.println("Nincs");
        }
        
        // 4.
        int min = szamok[0];
        
        for (i = 1; i < szamok.length; i++){
            if (szamok[i] < min){
                min = szamok[i];
            }
        }
        System.out.println(min);
    }
    
}
