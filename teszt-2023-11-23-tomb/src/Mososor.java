import java.util.ArrayList;

public class Mososor implements iAutomoso {
    private ArrayList<Jarmu> jarmuvek, osszesJarmu;
    private int bevetel = 0;

    public Mososor() {
        this.jarmuvek = new ArrayList<Jarmu>();
        this.osszesJarmu = new ArrayList<Jarmu>();
    }

    public void add(Jarmu j) {
        jarmuvek.add(j);
        osszesJarmu.add(j);

        int ar = ARAK[j.getSzolgaltatas()];

        if (!j.getTipus().equals(SZEMELYAUTO)) {
            ar *= FELAR;
        }

        if (osszesJarmu.indexOf(j) != osszesJarmu.lastIndexOf(j)) {
            ar*=KEDVEZMENY;
        }

        bevetel += ar;
    }

    public void remove(Jarmu j) {
        jarmuvek.remove(j);
    }

    public int getBevetel() {
        return bevetel;
    }

    @Override
    public String toString() {
        String er = "A mosóban lévő autók: ";
        for (int i = 0; i < jarmuvek.size(); i++) {
            er += jarmuvek.get(i) + "\n";
        }
        return er;
    }
}