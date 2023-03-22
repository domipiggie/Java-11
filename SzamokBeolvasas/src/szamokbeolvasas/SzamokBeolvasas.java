/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamokbeolvasas;

import java.io.IOException;
import java.io.RandomAccessFile;

public class SzamokBeolvasas {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        int[] szamoksz = new int[10];
        
        try {
            raf = new RandomAccessFile("szamok.txt","r");
            
            int i = 0;
            sor = raf.readLine();
            
            while (sor != null){
                szamoksz[i] = Integer.parseInt(sor.strip());
                i++;
                sor = raf.readLine();
            }
            
            raf.close();
        }
        catch(IOException e){
            System.err.println("Hiba");
        }
        
        for (int i = 0; i < szamoksz.length; i++){
            System.out.println(szamoksz[i]);
        }
        
        System.out.println(szamoksz[0] + szamoksz[1]);
    }
    
}
