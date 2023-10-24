import java.util.Arrays;
import java.util.Collections;

public class Zeneszam {
    private int min, sec;
    private String stationID, songID;

    public Zeneszam(String[] split) {
        this.stationID = split[0];
        this.min = Integer.parseInt(split[1]);
        this.sec = Integer.parseInt((split[2]));
        this.songID = String.join(" ", Arrays.copyOfRange(split, 3,split.length));
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getSongID() {
        return songID;
    }

    public void setSongID(String songID) {
        this.songID = songID;
    }

    @Override
    public String toString() {
        return "Zeneszam{" +
                ", stationID='" + stationID + '\'' +
                "min=" + min +
                ", sec=" + sec +
                ", songID='" + songID + '\'' +
                '}';
    }
}