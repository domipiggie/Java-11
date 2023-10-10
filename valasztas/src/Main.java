import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kepviselo> kepviselok = new ArrayList<>();

        try{
            RandomAccessFile szavazatokFile = new RandomAccessFile("szavazatok.txt", "r");
            String line = szavazatokFile.readLine();
            while (line != null){
                String[] darabolt = line.split(" ");

                kepviselok.add(new Kepviselo(darabolt[0], Integer.parseInt(darabolt[1]), darabolt[2]+" "+darabolt[3], darabolt[4]));

                line = szavazatokFile.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("2. feladat");
        System.out.println("A helyhatósági választáson " + kepviselok.size() + " képviselőjelölt indult");

        System.out.println("3. feladat");
        Scanner bill = new Scanner(System.in);
        String kepviseloNev = bill.nextLine();
        Kepviselo keresettKepviselo = null;
        int j = 0;
        while (keresettKepviselo == null && j < kepviselok.size()){
            if (kepviselok.get(j).getNev().equals(kepviseloNev)) keresettKepviselo = kepviselok.get(j);
            j++;
        }
        if (keresettKepviselo == null) System.err.println("Ilyen nevű képviselőjelölt nem szerepel a nyilvántartásban!");
        else System.out.println(kepviseloNev + " " + keresettKepviselo.getSzavazatSzam() + " szavazatot kapott.");

        System.out.println("4. feladat");
        int leadottSzavazatok = 0;
        for (int i = 0; i < kepviselok.size(); i++){
            leadottSzavazatok += kepviselok.get(i).getSzavazatSzam();
        }
        double szavazoPolgarokAtlag = ((double)(leadottSzavazatok)/12345.0)*100;
        System.out.println("A választáson " + leadottSzavazatok + " állampolgár, a jogosultak " + szavazoPolgarokAtlag + "%-a vett részt.");

        System.out.println("5. feladat");
        int GYEPszav = 0, HEPszav = 0, TISZszav = 0, ZEPszav = 0, FuggetlenSzav = 0;
        for (int i = 0; i < kepviselok.size(); i++){
            Kepviselo k = kepviselok.get(i);

            switch (k.getTamogato()){
                case "-":
                    FuggetlenSzav += k.getSzavazatSzam();
                    break;
                case "GYEP":
                    GYEPszav += k.getSzavazatSzam();
                    break;
                case "HEP":
                    HEPszav += k.getSzavazatSzam();
                    break;
                case "TISZ":
                    TISZszav += k.getSzavazatSzam();
                    break;
                case "ZEP":
                    ZEPszav += k.getSzavazatSzam();
                    break;
            }
        }

        double GYEPatlag = ((double)(GYEPszav)/leadottSzavazatok)*100, HEPatlag = ((double)(HEPszav)/leadottSzavazatok)*100, TISZatlag = ((double)(TISZszav)/leadottSzavazatok)*100, ZEPatlag = ((double)(ZEPszav)/leadottSzavazatok)*100, Fuggetlenatlag = ((double)(FuggetlenSzav)/leadottSzavazatok)*100;
        System.out.println("Gyümölcsevők Pártja= " + GYEPatlag +"%");
        System.out.println("Húsevők Pártja Pártja= " + HEPatlag +"%");
        System.out.println("Tejivók Szövetsége= " + TISZatlag +"%");
        System.out.println("Zöldségevők Pártja= " + ZEPatlag +"%");
        System.out.println("Független jelöltek= " + Fuggetlenatlag +"%");

        System.out.println("6. feladat");
        ArrayList<Kepviselo> legtobbSzav = new ArrayList<>();
        legtobbSzav.add(kepviselok.get(0));
        for (int i = 1; i < kepviselok.size(); i++){
            if (legtobbSzav.get(0).getSzavazatSzam() < kepviselok.get(i).getSzavazatSzam()){
                legtobbSzav.clear();
                legtobbSzav.add(kepviselok.get(i));
            }
            else if (legtobbSzav.get(0).getSzavazatSzam() == kepviselok.get(i).getSzavazatSzam()){
                legtobbSzav.add(kepviselok.get(i));
            }
        }

        for (int i = 0; i < legtobbSzav.size(); i++){
            Kepviselo k = legtobbSzav.get(i);
            if (k.getTamogato().equals("-")) System.out.println(k.getNev() + " független");
            else System.out.println(k.getNev() + " " + k.getTamogato());
        }

        System.out.println("7. feladat");
        Kepviselo[] keruletNyertesek = new Kepviselo[8];
        for (int i = 0; i < kepviselok.size(); i++){
            Kepviselo k = kepviselok.get(i);
            if (keruletNyertesek[Integer.parseInt(k.getKorzet())-1] == null) keruletNyertesek[Integer.parseInt(k.getKorzet())-1] = k;
            else if (keruletNyertesek[Integer.parseInt(k.getKorzet())-1].getSzavazatSzam() < k.getSzavazatSzam()) keruletNyertesek[Integer.parseInt(k.getKorzet())-1] = k;
        }
        try{
            RandomAccessFile outFile = new RandomAccessFile("kepviselok.txt", "rw");
            for (int i = 0; i < keruletNyertesek.length; i++){
                Kepviselo k = keruletNyertesek[i];
                if (k.getTamogato().equals("-")) outFile.write((k.getKorzet() + " " + k.getNev() + " független\n").getBytes());
                else outFile.write((k.getKorzet() + " " + k.getNev() + " " + k.getTamogato()+"\n").getBytes());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}