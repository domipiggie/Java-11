package basti.domonkos;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class BastiDomonkos {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String nev = "";
        Integer szulev = 0;
        ArrayList<Integer> pontok = new ArrayList<>();
        Integer osszpont = 0;
        
        try{
            raf = new RandomAccessFile("versenyzo.txt", "r");
            nev = raf.readLine();
            szulev = Integer.parseInt(raf.readLine().split(" ")[1]);
            
            raf.readLine();
            
            String sor = raf.readLine();
            while (sor != null){
                pontok.add(Integer.parseInt(sor));
                sor = raf.readLine();
            }
            raf.close();
        }
        catch(IOException e){
            System.err.println("Hiba!");
        }
        
        for (int i = 0; i < pontok.size(); i++){
            osszpont += pontok.get(i);
        }
        
        try {
            raf = new RandomAccessFile("osszegzes.txt", "rw");
            raf.writeBytes(nev + " " + "(" + szulev + "): " + osszpont + " pont");
            raf.close();
        }
        catch(IOException e){
            System.err.println("Hiba!");
        }
    }
}
