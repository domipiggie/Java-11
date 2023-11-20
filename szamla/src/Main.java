import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hivas> hivaslista = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("HIVASOK.txt", "r");
            String timeLine = raf.readLine();
            String numberLine = raf.readLine();

            while (timeLine != null && numberLine != null){
                hivaslista.add(new Hivas(timeLine.split(" "), numberLine));
                timeLine = raf.readLine();
                numberLine = raf.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < hivaslista.size(); i++){
            System.out.println(hivaslista.get(i));
        }
    }
}