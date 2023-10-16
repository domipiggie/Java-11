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

        for (int i = 0; i < igenyek.size(); i++){
            System.out.println(igenyek.get(i));
        }
    }
}