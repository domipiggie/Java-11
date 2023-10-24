import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Zeneszam> szamok = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("musor.txt", "r");
            raf.readLine();

            String line = raf.readLine();
            while (line != null){
                szamok.add(new Zeneszam(line.split(" ")));
                line = raf.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < szamok.size(); i++){
            System.out.println(szamok.get(i));
        }
    }
}