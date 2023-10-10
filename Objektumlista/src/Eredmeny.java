public class Eredmeny {
    private String nev, part, korzet;
    private int szavazatSzam;

    public Eredmeny(String nev, String part, String korzet, int szavazatSzam) {
        this.setNev(nev);
        this.setPart(part);
        this.setKorzet(korzet);
        this.setSzavazatSzam(szavazatSzam);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getKorzet() {
        return korzet;
    }

    public void setKorzet(String korzet) {
        this.korzet = korzet;
    }

    public int getSzavazatSzam() {
        return szavazatSzam;
    }

    public void setSzavazatSzam(int szavazatSzam) {
        this.szavazatSzam = szavazatSzam;
    }
}
