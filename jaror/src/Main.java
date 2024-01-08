import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static ArrayList<Ellenorzes> ellenorzesek = new ArrayList<Ellenorzes>();
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Feladat_1("jarmu.txt");
        Feladat_2();
        Feladat_3();
        Feladat_4();
        Feladat_5();
        Feladat_6();
        Feladat_7();
    }

    public static void Feladat_1(String fileName){
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            String line = raf.readLine();
            while (line != null){
                ellenorzesek.add(new Ellenorzes(line));
                line = raf.readLine();
            }
            raf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Feladat_2(){
        int startHour = Integer.parseInt(ellenorzesek.get(0).getH());
        int endHour = Integer.parseInt(ellenorzesek.get(ellenorzesek.size()-1).getH());
        if (Integer.parseInt(ellenorzesek.get(ellenorzesek.size()-1).getM()) != 0 || Integer.parseInt(ellenorzesek.get(ellenorzesek.size()-1).getS()) != 0){
            endHour++;
        }
        System.out.println("2. feladat\nEzen a napon legalább "+(endHour-startHour)+" órát dolgoztak az ellenőrzést végzők.");
    }

    public static void Feladat_3(){
        int prevHour = -1;
        System.out.println("3. feladat");
        for (Ellenorzes e : ellenorzesek){
            if (Integer.parseInt(e.getH()) != prevHour){
                System.out.println(e.getH()+" óra: "+e.getLicensePlate());
                prevHour = Integer.parseInt(e.getH());
            }
        }
    }

    public static void Feladat_4(){
        int b = 0, k = 0, m = 0;
        for (Ellenorzes e : ellenorzesek){
            if (e.getLicensePlate().startsWith("B")){
                b++;
            } else if (e.getLicensePlate().startsWith("K")){
                k++;
            } else if (e.getLicensePlate().startsWith("M")){
                m++;
            }
        }
        System.out.println("4. feladat\nAz ellenőrző ponton "+b+" autóbusz, "+k+" kamion és "+m+" motor haladt át.");
    }

    public static void Feladat_5(){
        int longestTimeStartIndex = 0;
        for (int i = 0; i < ellenorzesek.size()-1; i++){
            Ellenorzes e1 = ellenorzesek.get(i);
            Ellenorzes e2 = ellenorzesek.get(i+1);
            if (e2.getTimeInSeconds()-e1.getTimeInSeconds() > ellenorzesek.get(longestTimeStartIndex+1).getTimeInSeconds()-ellenorzesek.get(longestTimeStartIndex).getTimeInSeconds()){
                longestTimeStartIndex = i;
            }
        }
        Ellenorzes e1 = ellenorzesek.get(longestTimeStartIndex);
        Ellenorzes e2 = ellenorzesek.get(longestTimeStartIndex+1);
        System.out.println("5. feladat\n"+e1.getH()+":"+e1.getM()+":"+e1.getS()+" - "+e2.getH()+":"+e2.getM()+":"+e2.getS());
    }

    public static void Feladat_6(){
        System.out.print("6.feladat\nAdja meg a keresett rendszámot (A hiányos karaktereket *-al helyettesítse):");
        String inPlate = s.next();
        for (Ellenorzes e : ellenorzesek){
            if (e.getLicensePlate().length() == inPlate.length()){
                char[] currentPlate = e.getLicensePlate().toCharArray();
                for (int i = 0; i < currentPlate.length; i++){
                    if (inPlate.charAt(i) == '*'){
                        currentPlate[i] = '*';
                    }
                }
                if (Arrays.equals(currentPlate, inPlate.toCharArray())){
                    System.out.println(e.getLicensePlate());
                }
            }
        }
    }

    public static void Feladat_7(){
        RandomAccessFile outFile;
        try {
            outFile = new RandomAccessFile("vizsgalat.txt", "rw");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int lastCheckTime = 0;
        for (int i = 0; i < ellenorzesek.size(); i++){
            Ellenorzes e = ellenorzesek.get(i);
            if ((e.getTimeInSeconds()-300)>lastCheckTime){
                lastCheckTime = e.getTimeInSeconds();
                String outLine = e.getH()+" "+e.getM()+" "+e.getS()+" "+e.getLicensePlate();
                if (i < ellenorzesek.size()-1) outLine+="\n";
                try {
                    outFile.write(outLine.getBytes());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        try {
            outFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}