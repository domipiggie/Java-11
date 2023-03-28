package fajlbeolvasas2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Fajlbeolvasas2 {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        Integer[] szamok = new Integer[6];
        
        try{
            raf = new RandomAccessFile("adat.txt", "r");
            
            int i = 0;
            sor = raf.readLine();
            
            while(sor != null){
                szamok[i] = Integer.parseInt(sor);
                i++;
                sor = raf.readLine();
            }
        }
        catch(IOException e){
            System.err.println("Hiba");
        }
        
        Integer sum = 0;
        for (int i = 0; i < szamok.length; i++){
            sum += szamok[i];
        }
        System.out.println(sum);
    }
    
}
