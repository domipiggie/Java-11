import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kepviselo> kepviselok = new ArrayList<>();

        try{
            RandomAccessFile szavazatokFile = new RandomAccessFile("szavazatok.txt", "r");
            int length = Integer.parseInt(szavazatokFile.readLine());
            String line = szavazatokFile.readLine();
            for (int i = 0; i < length; i++){
                String[] darabolt = line.split(" ");

                kepviselok.add(new Kepviselo(darabolt[0], Integer.parseInt(darabolt[1]), darabolt[2]+" "+darabolt[3], darabolt[4]));

                line = szavazatokFile.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < kepviselok.size(); i++){
            System.out.println(kepviselok.get(i).getNev());
        }
    }
}