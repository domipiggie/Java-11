package ciklusok;

public class Ciklusok {

    public static void main(String[] args) {
        
        // növekményes ciklus (for)
        int i;
        for (i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("");
        
        // csökkenő ciklus (for)
        int j;
        for (j = 4; j > -1; j--){
            System.out.println(j);
        }
        System.out.println("");
        
        // kettesével növekvő ciklus
        int k;
        for (k = 0; k < 5; k+=2){
            System.out.println(k);
        }
        System.out.println("");
        
        // elől tesztelő
        int szam = 0;
        while (szam < 5){
            System.out.println(szam);
            szam++;
        }
        System.out.println("");
        
        int random = 1;
        while (random%2!=0){
            random = (int)(Math.random() * 20) + 1;
        }
        System.out.println(random);
        System.out.println("");
    }
    
}
