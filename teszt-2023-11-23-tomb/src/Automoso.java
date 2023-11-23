import java.util.ArrayList;

public class Automoso {
    private String nev;
    private ArrayList<Mososor> mososorok;

    public Automoso(String nev){
        this.setNev(nev);
        mososorok = new ArrayList<>();
    }

    public void add(Mososor m){
        this.mososorok.add(m);
    }

    public void remove(Mososor m){
        this.mososorok.remove(m);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getBevetel(){
        int bevetel = 0;
        for (int i = 0; i < mososorok.size(); i++){
            bevetel+=mososorok.get(i).getBevetel();
        }
        return bevetel;
    }

    @Override
    public String toString(){
        String er = "Az autómosóban lévő mosósorok: \n";
        for (int i = 0; i < mososorok.size(); i++){
            er += mososorok.get(i)+"\n";
        }
        return er+"\n";
    }
}