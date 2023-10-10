public class Kepviselo {
    private String korzet, nev, tamogato;
    private int szavazatSzam;

    public Kepviselo(String korzet, int szavazatSzam, String nev, String tamogato) {
        this.korzet = korzet;
        this.nev = nev;
        this.tamogato = tamogato;
        this.szavazatSzam = szavazatSzam;
    }

    public String getKorzet() {
        return korzet;
    }

    public void setKorzet(String korzet) {
        this.korzet = korzet;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getTamogato() {
        return tamogato;
    }

    public void setTamogato(String tamogato) {
        this.tamogato = tamogato;
    }

    public int getSzavazatSzam() {
        return szavazatSzam;
    }

    public void setSzavazatSzam(int szavazatSzam) {
        this.szavazatSzam = szavazatSzam;
    }
}