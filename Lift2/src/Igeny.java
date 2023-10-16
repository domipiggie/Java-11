public class Igeny {
    private int h, m, s, startFloor, destinationFloor;
    private String teamNumber;

    public Igeny(String line){
        String[] split = line.split(" ");

        this.setH(Integer.parseInt(split[0]));
        this.setM(Integer.parseInt(split[1]));
        this.setS(Integer.parseInt(split[2]));
        this.setTeamNumber(split[3]);
        this.setStartFloor(Integer.parseInt(split[4]));
        this.setDestinationFloor(Integer.parseInt(split[5]));
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public String getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(String teamNumber) {
        this.teamNumber = teamNumber;
    }

    public int getStartFloor() {
        return startFloor;
    }

    public void setStartFloor(int startFloor) {
        this.startFloor = startFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    @Override
    public String toString() {
        return "h = " + h +
                ", m = " + m +
                ", s = " + s +
                ", startFloor = " + startFloor +
                ", destinationFloor = " + destinationFloor +
                ", teamNumber = " + teamNumber;
    }
}
