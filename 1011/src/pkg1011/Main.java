package pkg1011;

public class Main {

    public static void main(String[] args) {
        // Hozz létre egy 10 elemű integer tömböt.
        int[] szamok = new int[10];
        
        //Generáld le random az elemeit (1-10 közötti szám)
        for (int i=0; i<10; i++){
            szamok[i] = (int)(Math.random() * 10) +1;
            System.out.print(szamok[i] + " ");
        }
        System.out.println("");
        
        
        
        // Összegzés
        int osszeg = 0;
        
        for (int j=0; j<szamok.length; j++){
            osszeg += szamok[j];
        }
        
        System.out.println("Összegzés: "+osszeg);
        
        
        
        // páros számok számlálása
        int parosMennyiseg = 0;
        
        for (int k=0; k<szamok.length; k++){
            if (szamok[k] % 2 == 0){
                parosMennyiseg++;
            }
        }
        
        System.out.println("Páros számok mennyisége: "+parosMennyiseg);
        
        
        
        // legkisebb
        int min = szamok[0];
        
        for (int i=1; i < szamok.length; i++){
            if (szamok[i] < min){
                min = szamok[i];
            }
        }
        
        System.out.println("Legkisebb érték: "+min);
        
        
        
        // legnagyobb
        int max = szamok[0];
        
        for (int i=1; i < szamok.length; i++){
            if (szamok[i] > max){
                max = szamok[i];
            }
        }
        
        System.out.println("Legnagyobb érték: "+max);
        
        
        
        // 5-nél kisebb szám hányadik eleme
        int j = 0;
        
        while (j < szamok.length && szamok[j] >= 5){
            j++;
        }
        if (j < szamok.length){
            System.out.println("Az első 5-nél kisebb szám helye: "+j);
        }
        else{
            System.out.println("Nincs 5-nél kisebb szám");
        }
        
        
        
        // van-e 4-gyel osztható
        int k = 0;
        
        while (k < szamok.length && szamok[k] % 4 != 0){
            k++;
        }
        if (k < szamok.length){
            System.out.println("Van 4-gyel osztható szám");
        }
        else{
            System.out.println("Nincs 4-gyel osztható szám");
        }
    }
    
}
