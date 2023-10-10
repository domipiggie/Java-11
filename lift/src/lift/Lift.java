package lift;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Lift {


    public static void main(String[] args) {
        RandomAccessFile raf;
        ArrayList<Integer[]> lift = new ArrayList<Integer[]>();
        Integer levelCount = 0, groupCount = 0, requestCount = 0;
        
        try{
            raf = new RandomAccessFile("igeny.txt", "r");
            levelCount = Integer.valueOf(raf.readLine());
            groupCount = Integer.valueOf(raf.readLine());
            requestCount = Integer.valueOf(raf.readLine());
            
            String line = raf.readLine();
            while (line != null){
                String[] lineSplit = line.split(" ");
                Integer[] liftLine = new Integer[6];
                for (int i = 0; i < liftLine.length; i++){
                    liftLine[i] = Integer.valueOf(lineSplit[i]);
                }
                lift.add(liftLine);
                line = raf.readLine();
            }
        }
        catch(IOException e){
            System.err.println("Hiba!");
        }
        
        for (int i = 0; i < lift.size(); i++){
            for (Integer get : lift.get(i)) {
                System.out.print(get + " ");
            }
            System.out.println("");
        }
    }
    
}