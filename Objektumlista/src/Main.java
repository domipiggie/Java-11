import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Eredmeny> eredmenyek = new ArrayList<>();

        Eredmeny peter = new Eredmeny("Péter", "Zöld", "9", 712);
        Eredmeny gizi = new Eredmeny("Gizi", "WOW", "3", 987);
        Eredmeny gazsi = new Eredmeny("Gazsia", "Omigi", "1", 2006);

        eredmenyek.add(peter);
        eredmenyek.add(gizi);
        eredmenyek.add(gazsi);

        System.out.println("A jelöltek száma: " + eredmenyek.size());



        int osszSzavazatok = 0;
        for (int i = 0; i < eredmenyek.size(); i++){
            osszSzavazatok += eredmenyek.get(i).getSzavazatSzam();
        }
        System.out.println("Az összes szavazat száma: " + osszSzavazatok);



        ArrayList<Eredmeny> tobbMint1k = new ArrayList<>();
        for (int i = 0; i < eredmenyek.size(); i++){
            if (eredmenyek.get(i).getSzavazatSzam() > 1000){
                tobbMint1k.add(eredmenyek.get(i));
            }
        }

        System.out.println("A következő pártok kaptak több mint 1000 szavazatot: ");
        for (int i = 0; i < tobbMint1k.size(); i++){
            System.out.print(tobbMint1k.get(i).getPart());
        }
        System.out.println();



        String keresettJelolt = null;
        int j = 0;
        while (keresettJelolt == null && j < eredmenyek.size()){
            if (eredmenyek.get(j).getPart() == "WOW"){
                keresettJelolt = eredmenyek.get(j).getNev();
            }
            j++;
        }
        if (keresettJelolt == null) System.out.println("Nem található a keresett párt");
        else System.out.println("A WOW párt jelöltje: " + keresettJelolt);



        ArrayList<Eredmeny> atlagAlattiSzavazatok = new ArrayList<>();
        double atlagSzavazat = osszSzavazatok/eredmenyek.size();
        for (int i = 0; i < eredmenyek.size(); i++){
            if (eredmenyek.get(i).getSzavazatSzam() < atlagSzavazat) atlagAlattiSzavazatok.add(eredmenyek.get(i));
        }

        System.out.println("Átlag szavazatok: " + atlagSzavazat + ". A következő pártok kaptak átlag alatti szavazatokat: ");
        for (int i = 0; i < atlagAlattiSzavazatok.size(); i++){
            System.out.println(atlagAlattiSzavazatok.get(i).getPart());
        }
        System.out.println();



        ArrayList<Eredmeny> aVegzodesuNevek = new ArrayList<>();
        for (int i = 0; i < eredmenyek.size(); i++){
            if (eredmenyek.get(i).getNev().endsWith("a")) aVegzodesuNevek.add(eredmenyek.get(i));
        }

        System.out.println("A-ra végződő nevek: ");
        for (int i = 0; i < aVegzodesuNevek.size(); i++){
            System.out.println(aVegzodesuNevek.get(i).getNev());
        }
        System.out.println();
    }
}