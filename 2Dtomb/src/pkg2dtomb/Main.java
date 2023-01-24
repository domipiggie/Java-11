package pkg2dtomb;

public class Main {

    public static void main(String[] args) {
        // 2D tömb (mátrix) inicializálás
        int[][] szamok = {
            {2, 9, 7}, 
            {1, 0, 3}
        };
        int sorokSzama = szamok.length;
        int oszlopokSzama = szamok[0].length;
        
        
        // 2D tömb bejárása
        for (int i = 0; i < sorokSzama; i++){
            for (int j = 0; j < szamok[i].length; j++){
                System.out.print(szamok[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        //--------------------
        
        //2. sor bejárása
        for (int j = 0; j < szamok[1].length; j++){
            System.out.print(szamok[1][j]+" ");
        }
        System.out.println("\n");
        
        
        //2. oszlop bejárása
        for (int i = 0; i < sorokSzama; i++){
            System.out.println(szamok[i][1]);
        }
        System.out.println();
        
        //--------------
        
        //tömb elemeinek összege
        int sum = 0;
        for (int i = 0; i < sorokSzama; i++){
            for (int j = 0; j < szamok[i].length; j++){
                sum+=szamok[i][j];
            }
        }
        System.out.println(sum+"\n");
        
        //tömb sorainak összege
        for (int i = 0; i < sorokSzama; i++){
            int sorsum = 0;
            for (int j = 0; j < szamok[i].length; j++){
                sorsum+=szamok[i][j];
            }
            System.out.println(i+" indexű sor összege: "+sorsum);
        }
        System.out.println();
        
        //hány darab páros szám van
        int parosSzamok = 0;
        for (int i = 0; i < sorokSzama; i++){
            for (int j = 0; j < szamok[i].length; j++){
                if (szamok[i][j]%2==0){
                    parosSzamok++;
                }
            }
        }
        System.out.println(parosSzamok+"db páros szám van.\n");
        
        //hány darab páros szám van soronként
        for (int i = 0; i < sorokSzama; i++){
            int sorparosSzamok = 0;
            for (int j = 0; j < szamok[i].length; j++){
                if (szamok[i][j]%2==0){
                    sorparosSzamok++;
                }
            }
            System.out.println(i+" indexű sorban található páros számok mennyisége: "+sorparosSzamok);
        }
        System.out.println();
        
        // oszlopok bejárása
        for (int j = 0; j < oszlopokSzama; j++){
            for (int i = 0; i < sorokSzama; i++){
                System.out.print(szamok[i][j]+" ");
            }
        }
        System.out.println("\n");
        
        // oszlopok összege
        for (int j = 0; j < oszlopokSzama; j++){
            int oszlopsum = 0;
            for (int i = 0; i < sorokSzama; i++){
                oszlopsum+=szamok[i][j];
            }
            System.out.println(j+" indexű oszlop összege: "+oszlopsum);
        }
        System.out.println();
        
        //-----------
        int[][] numbers = new int[3][5];
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                numbers[i][j] = (int)(Math.random() * 10)+1;
            }
        }
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}