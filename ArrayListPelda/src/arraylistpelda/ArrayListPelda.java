package arraylistpelda;

import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class ArrayListPelda {

    public static void main(String[] args) {
        int i;
        ArrayList<Integer> szamok = new ArrayList<>();

        for (i = 0; i < 10; i++) {
            szamok.add((int) (Math.random() * 11) + 10);
        }

        for (i = 0; i < szamok.size(); i++) {
            System.out.print(szamok.get(i) + " ");
        }
        System.out.println("");
        
        szamok.add(25);
        
        for (i = 0; i < szamok.size(); i++) {
            System.out.print(szamok.get(i) + " ");
        }
        System.out.println("");
        
        int paros = 0;
        for (i = 0; i < szamok.size(); i++){
            if (szamok.get(i) % 2 == 0){
                paros++;
            }
        }
        
        System.out.println("Páros számok száma: " + paros);
    }

}
