package fajlbeolvasas2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class fajl3 {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        int[][] szamok = new int[5][4];
        
        try{
            raf = new RandomAccessFile("adat3.txt", "r");
            /*int lineCount = 0;
            int colCount;
            
            sor = raf.readLine();
            colCount = sor.split(" ").length;
            
            raf.seek(0);
            sor = raf.readLine();
            while (sor != null) {
                lineCount++;
                sor = raf.readLine();
            }
            
            szamok = new int[lineCount][colCount];
            
            raf.seek(0);*/
            sor = raf.readLine();
            int i = 0;
            
            while (sor != null){
                String[] splittedLine = sor.split(" ");
                for (int j = 0; j < splittedLine.length; j++){
                    szamok[i][j] = Integer.parseInt(splittedLine[j]);
                }
                i++;
                sor = raf.readLine();
            }
        }
        catch(IOException e){
            System.err.println("Hiba");
        }
        
        matrixPrint(szamok);
    }
    
    public static void matrixPrint(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}