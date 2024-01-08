public class CarLend {
    private int day, personID, km;
    private String time, licensePlate;
    private boolean isIn;

    public CarLend(String line) {
        String[] data = line.split(" ");
        this.setDay(Integer.parseInt(data[0]));
        this.setTime(data[1]);
        this.setLicensePlate(data[2]);
        this.setPersonID(Integer.parseInt(data[3]));
        this.setKm(Integer.parseInt(data[4]));
        this.setIn(data[5].equals("1"));
    }

    public int getDay() {
        return day;
    }

    private void setDay(int day) {
        this.day = day;
    }

    public int getPersonID() {
        return personID;
    }

    private void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getKm() {
        return km;
    }

    private void setKm(int km) {
        this.km = km;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    private void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isIn() {
        return isIn;
    }

    private void setIn(boolean in) {
        isIn = in;
    }

    public String getTime() {
        return time;
    }

    private void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "CarLend{" +
                "day=" + this.getDay() +
                ", personID=" + this.getPersonID() +
                ", km=" + this.getKm() +
                ", time='" + this.getTime() + '\'' +
                ", licensePlate='" + this.getLicensePlate() + '\'' +
                ", isIn=" + this.isIn() +
                '}';
    }
}