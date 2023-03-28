package fajlbeolvasas2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class fajl4 {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<Integer> numbers = new ArrayList<>();
        
        try{
            raf = new RandomAccessFile("adat.txt", "r");
            int i = 0;
            sor = raf.readLine();
            
            while(sor != null){
                numbers.add(Integer.parseInt(sor));
                i++;
                sor = raf.readLine();
            }
        }
        catch(IOException e){
            System.err.println("Hiba");
        }
        
        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}