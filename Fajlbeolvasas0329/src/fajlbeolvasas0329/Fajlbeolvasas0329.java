package fajlbeolvasas0329;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Fajlbeolvasas0329 {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<String> cars = new ArrayList<>();
        
        try{
            raf = new RandomAccessFile("cars.txt", "r");
            
            int lines = Integer.parseInt(raf.readLine());
            
            for (int i = 0; i < lines; i++){
                cars.add(raf.readLine());
            }
            
            raf.close();
        }
        catch(IOException e){
            System.err.println("Hiba");
        }
        
        try{
            raf = new RandomAccessFile("carsout.txt", "rw");
            
            for (int i = 0; i < cars.size(); i++){
                String car = cars.get(i);
                if (car.toLowerCase().startsWith("f")){
                    raf.write((car+"\n").getBytes());
                }
            }
            
            raf.close();
        }
        catch(IOException e){
            System.err.println("Hiba");
        }
    }
    
}
