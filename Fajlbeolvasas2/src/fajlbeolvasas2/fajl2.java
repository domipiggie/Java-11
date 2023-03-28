package fajlbeolvasas2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class fajl2 {

    public static void main(String[] args) {
        RandomAccessFile raf;
        Integer[] szamok = new Integer[0];
        
        try{
            raf = new RandomAccessFile("adat2.txt", "r");
            
            int j = Integer.parseInt(raf.readLine());
            szamok = new Integer[j];
            
            for (int i = 0; i < j; i++){
                szamok[i] = Integer.parseInt(raf.readLine());
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