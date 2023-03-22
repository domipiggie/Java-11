package beolvasassorokszama;

import java.io.IOException;
import java.io.RandomAccessFile;

public class BeolvasasSorokszama {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[5];
        
        try {
            raf = new RandomAccessFile("nevek.txt","r");
            raf.readLine();
            
            int i = 0;
            sor = raf.readLine();
            
            while (sor != null){
                nevek[i] = sor;
                i++;
                sor = raf.readLine();
            }
            
            raf.close();
        }
        catch(IOException e){
            System.err.println("Hiba");
        }
        
        for (int i = 0; i < nevek.length; i++){
            System.out.println(nevek[i]);
        }
    }
    
}
