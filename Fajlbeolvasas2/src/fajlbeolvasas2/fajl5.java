package fajlbeolvasas2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class fajl5 {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
        
        try{
            raf = new RandomAccessFile("adat3.txt","r");
            sor = raf.readLine();
            
            while (sor != null){
                String[] splittedLine = sor.split(" ");
                ArrayList<Integer> arrayLine = new ArrayList<Integer>();
                
                for (int j = 0; j < splittedLine.length; j++){
                    arrayLine.add(Integer.parseInt(splittedLine[j]));
                }
                
                numbers.add(arrayLine);
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