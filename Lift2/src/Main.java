import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int floorCount, teamCount, requestCount;
        ArrayList<Igeny> igenyek = new ArrayList<>();

        try {
            RandomAccessFile igenyFile = new RandomAccessFile("igeny.txt", "r");
            floorCount = Integer.parseInt(igenyFile.readLine());
            teamCount = Integer.parseInt(igenyFile.readLine());
            requestCount = Integer.parseInt(igenyFile.readLine());

            String line = igenyFile.readLine();

            while (line != null){
                igenyek.add(new Igeny(line));
                line = igenyFile.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n3. Feladat");
        System.out.println("„A lift a(z) " + igenyek.get(igenyek.size()-1).getDestinationFloor() + ". szinten áll az utolsó igény teljesítése után.");

        System.out.println("\n4. Feladat");
        int minLevel = igenyek.get(0).getStartFloor();
        int maxLevel = igenyek.get(0).getStartFloor();

        for (int i = 0; i < igenyek.size(); i++){
            if (igenyek.get(i).getDestinationFloor() > maxLevel){
                maxLevel = igenyek.get(i).getDestinationFloor();
            }
            if (igenyek.get(i).getDestinationFloor() < minLevel){
                minLevel = igenyek.get(i).getDestinationFloor();
            }
        }

        System.out.println("A legmagasabb érintett szint: " + maxLevel);
        System.out.println("A legkisebb érintett szint: " + minLevel);

        System.out.println("\n5. Feladat");
        int upWithPassengers = 0;
        int upWithoutPassengers = 0;

        for (int i = 1; i < igenyek.size(); i++){
            Igeny ig = igenyek.get(i);
            Igeny igMinus = igenyek.get(i-1);

            if (ig.getStartFloor() > igMinus.getDestinationFloor()){
                upWithoutPassengers++;
            }
            if (ig.getDestinationFloor() > ig.getStartFloor()){
                upWithPassengers++;
            }
        }

        System.out.println("A lift " + upWithoutPassengers + " alkalommal indult felfelé utasok nélkül.");
        System.out.println("A lift " + upWithPassengers + " alkalommal indult felfelé utasokkal.");

        System.out.println("\n6. Feladat");
        int[] teams = new int[teamCount];

        for (int i = 0; i < igenyek.size(); i++){
            teams[Integer.parseInt(igenyek.get(i).getTeamNumber())-1] = 1;
        }

        System.out.println("A liftet a következő szerelőcsapatok nem vették igénybe: ");
        for (int i = 0; i < teams.length; i++){
            System.out.print(teams[i]==0 ? i+1+" " : "");
        }
        System.out.println();

        System.out.println("\n7. Feladat");
        
    }
}