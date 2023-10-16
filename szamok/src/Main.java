import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Question> kerdesek = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("felszam.txt", "r");

            String question = raf.readLine();
            String line = raf.readLine();
            while (line != null && question != null){
                String[] split = line.split(" ");

                kerdesek.add(new Question(question, split[0], split[2], Integer.parseInt(split[1])));

                question = raf.readLine();
                line = raf.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < kerdesek.size(); i++){
            System.out.println(kerdesek.get(i));
        }

        System.out.println("Kérdések száma: " + kerdesek.size());
    }
}