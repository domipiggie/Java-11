public class Ellenorzes {
    String licensePlate, h, m, s;

    public Ellenorzes(String line){
        String[] split = line.split(" ");
        this.setH(split[0]);
        this.setM(split[1]);
        this.setS(split[2]);
        this.setLicensePlate(split[3]);
    }

    public int getTimeInSeconds(){
        return (Integer.parseInt(this.getH())*3600)+(Integer.parseInt(this.getM())*60)+Integer.parseInt(this.getS());
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getH() {
        return h;
    }

    public String getM() {
        return m;
    }

    public String getS() {
        return s;
    }

    private void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    private void setH(String h) {
        this.h = h;
    }

    private void setM(String m) {
        this.m = m;
    }

    private void setS(String s) {
        this.s = s;
    }
}