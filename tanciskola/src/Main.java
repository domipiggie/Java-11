import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tanc> tancok = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("tancrend.txt", "r");

            String tipus = raf.readLine();
            String nev1 = raf.readLine();
            String nev2 = raf.readLine();

            while (tipus != null && nev1 != null && nev2 != null){
                tancok.add(new Tanc(tipus, nev1, nev2));

                tipus = raf.readLine();
                nev1 = raf.readLine();
                nev2 = raf.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < tancok.size(); i++){
            System.out.println(tancok.get(i));
        }

        System.out.println("Táncok száma: " + tancok.size());
    }
}