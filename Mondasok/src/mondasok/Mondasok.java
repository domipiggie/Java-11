package mondasok;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Mondasok {
    
    public static void main(String[] args) {
        RandomAccessFile raf;
        ArrayList<String> mondasok = new ArrayList<String>();
        
        try{
            raf = new RandomAccessFile("mondasok.txt", "r");
            
            String line = raf.readLine();
            while (line != null){
                mondasok.add(line);
                line = raf.readLine();
            }
        }
        catch(IOException e){
            System.err.println("Hiba");
        }
        
        Integer longest = 0;
        for (int i = 1; i < mondasok.size(); i++){
            if (mondasok.get(i).length() > mondasok.get(longest).length()){
                longest = i;
            }
        }
        System.out.println("A leghosszabb mondás a(z) "+(longest+1)+". elem és "+mondasok.get(longest).length()+" karakterből áll.");
        
        Integer i = 0;
        Boolean anyA = true;
        while (i < mondasok.size() && anyA){
            Integer j = 0;
            String mondas = mondasok.get(i);
            if (!mondas.toLowerCase().contains("a")){
                anyA = false;
            }
            i++;
        }
        if (anyA){
            System.out.println("Minden elem tartalmaz 'a' betűt.");
        }
        else{
            System.out.println("Van elem ami nem tartalmaz 'a' betűt.");
        }
        
        Integer totalECount = 0;
        for (i = 0; i < mondasok.size(); i++){
            totalECount += eCounter(mondasok.get(i));
        }
        System.out.println("Összesen "+totalECount+"db 'e' betű van a mondásokban.");
    }
    
    public static Integer eCounter(String mondas){
        Integer e = 0;
        
        for (int i = 0; i < mondas.length(); i++){
            if (mondas.toLowerCase().charAt(i) == 'e'){
                e++;
            }
        }
        
        return e;
    }
}
