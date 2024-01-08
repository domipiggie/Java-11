import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String currentPit;

    public static void main(String[] args) {
        ArrayList<Integer> pitDepths = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        try {
            RandomAccessFile raf = new RandomAccessFile("melyseg.txt", "r");
            String line = raf.readLine();
            while (line != null){
                pitDepths.add(Integer.parseInt(line));
                line = raf.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("1. Feladat:");
        System.out.println("Az adatforrás "+pitDepths.size()+" adatot tartalmaz.");

        System.out.println("\n2. Feladat");
        System.out.print("Kérem adjon meg egy távolságértéket: ");
        final Integer n = s.nextInt()-1;
        System.out.println("A gödör alja ezen a helyen "+pitDepths.get(n)+" mélyen van.");

        System.out.println("\n3. Feladat");
        Integer untouchedParts = 0;
        for (int i = 0; i < pitDepths.size(); i++){
            if (pitDepths.get(i).equals(0)){
                untouchedParts++;
            }
        }
        double untouchedPreacent = ((double)untouchedParts/pitDepths.size())*100;
        System.out.printf("A felszín %.2f százaláka érintetlen.", untouchedPreacent);

        Integer pitCount = 0;
        try {
            RandomAccessFile outFile = new RandomAccessFile("godrok.txt", "rw");
            int i = 0;
            String currentPit = "";
            while (i < pitDepths.size()){
                if (pitDepths.get(i) > 0){
                    currentPit += pitDepths.get(i)+" ";
                }
                else if (pitDepths.get(i) == 0 && (currentPit != "\n" && currentPit != "")){
                    outFile.write(currentPit.substring(0, currentPit.length()-1).getBytes());
                    currentPit = "\n";
                    pitCount++;
                }
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n5. Feladat");
        System.out.println("A gödrök száma "+pitCount);

        System.out.println("\n6. Feladat");
        if (pitDepths.get(n).equals(0)){
            System.out.println("Az adott helyen nincs gödör");
        }
        else {
            System.out.println("a)");
            Integer pitEnd, pitStart;
            int i = n;
            while (!pitDepths.get(i).equals(0)){
                i++;
            }
            pitEnd = i-1;
            i = n;
            while (!pitDepths.get(i).equals(0)){
                i--;
            }
            pitStart = i+1;
            System.out.println("A gödör kezdete: "+(pitStart+1)+" méter, a gödör vége: "+(pitEnd+1)+" méter.");

            System.out.println("b)");
            boolean isIncreasing = false;
            boolean isVPit = true;
            i = pitStart;
            while (i+1 <= pitEnd && isVPit){
                if (pitDepths.get(i) < pitDepths.get(i-1)){
                    isIncreasing = true;
                }
                if (isIncreasing && pitDepths.get(i) > pitDepths.get(i-1)) {
                    isVPit = false;
                }
                i++;
            }
            System.out.println(isVPit ? "Folyamatosan mélyül" : "Nem mélyül folyamatosan");

            System.out.println("c)");
            Integer maxDepth = 0;
            for (i = pitStart; i <= pitEnd; i++){
                if (pitDepths.get(i) > maxDepth){
                    maxDepth = pitDepths.get(i);
                }
            }
            System.out.println("A legnagyobb mélysége "+maxDepth+" méter");

            System.out.println("d)");
            Integer volume = 0;
            for (i = pitStart; i <= pitEnd; i++){
                volume+=10*pitDepths.get(i);
            }
            System.out.println("A térfogata "+volume+" m^3.");

            System.out.println("e)");
            Integer maxWaterVolume = 0;
            for (i = pitStart; i <= pitEnd; i++){
                maxWaterVolume+=10*(pitDepths.get(i)-1);
            }
            System.out.println("A vízmennyiség "+maxWaterVolume+" m^3.");
        }
    }
}