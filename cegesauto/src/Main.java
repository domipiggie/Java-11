import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<CarLend> lends = new ArrayList<>();
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Feladat_1("autok.txt");
        Feladat_2();
        Feladat_3();
        Feladat_4();
        Feladat_5();
    }

    public static void Feladat_1(String fileName){
        try {
            RandomAccessFile raf = new RandomAccessFile("autok.txt", "r");
            String line = raf.readLine();
            while (line != null){
                lends.add(new CarLend(line));
                line = raf.readLine();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Feladat_2(){
        int i = lends.size()-1;
        CarLend c = lends.get(i);
        while (!c.isIn()){
            i--;
            c = lends.get(i);
        }
        System.out.println("2. feladat\n"+c.getDay()+". nap rendszám: "+c.getLicensePlate());
    }

    public static void Feladat_3(){
        System.out.print("3. feladat\nNap: ");
        //int day = s.nextInt();
        int day = 4;
        ArrayList<CarLend> dayCars = new ArrayList<>();
        for (CarLend c : lends){
            if (c.getDay() == day){
                dayCars.add(c);
            }
        }
        System.out.println("Forgalom a(z) "+day+". napon:");
        for (CarLend c : dayCars){
            System.out.println(c.getTime() +" "+ c.getLicensePlate() +" "+ (c.isIn() ? "be":"ki"));
        }
    }

    public static void Feladat_4(){
        System.out.println("4. feladat");
        int outCount = 0;
        for (CarLend c : lends){
            if (c.isIn()){
                outCount--;
            } else {
                outCount++;
            }
        }
        System.out.println("A hónap végén "+outCount+" autót nem hoztak vissza.");
    }

    public static void Feladat_5(){
        System.out.println("5. feladat");
        ArrayList<String> plates = new ArrayList<>();
        int[][] minMaxKmCount = new int[10][2];
        for (CarLend c : lends){
            int i = plates.indexOf(c.getLicensePlate());
            if (i==-1){
                plates.add(c.getLicensePlate());
                i = plates.size()-1;
                minMaxKmCount[i][0] = Integer.MAX_VALUE;
            }
            if (c.isIn()){
                minMaxKmCount[i][1] = c.getKm();
            } else if (!c.isIn() && c.getKm() < minMaxKmCount[i][0]){
                minMaxKmCount[i][0] = c.getKm();
            }
        }
        for (int i = 0; i < plates.size(); i++){
            System.out.println(plates.get(i) +" "+ (minMaxKmCount[i][1]-minMaxKmCount[i][0]) + " km");
        }
    }
}