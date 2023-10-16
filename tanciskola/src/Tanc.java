public class Tanc {
    private String tipus, nev1, nev2;

    public Tanc(String tipus, String nev1, String nev2){
        this.setTipus(tipus);
        this.setNev1(nev1);
        this.setNev2(nev2);
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getNev1() {
        return nev1;
    }

    public void setNev1(String nev1) {
        this.nev1 = nev1;
    }

    public String getNev2() {
        return nev2;
    }

    public void setNev2(String nev2) {
        this.nev2 = nev2;
    }

    @Override
    public String toString() {
        return "Tanc{" +
                "tipus='" + tipus + '\'' +
                ", nev1='" + nev1 + '\'' +
                ", nev2='" + nev2 + '\'' +
                '}';
    }
}