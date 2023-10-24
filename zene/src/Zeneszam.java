import java.util.Arrays;
import java.util.Collections;

public class Zeneszam {
    private int min, sec;
    private String stationID, songAuthor, songTitle;

    public Zeneszam(String[] split) {
        this.stationID = split[0];
        this.min = Integer.parseInt(split[1]);
        this.sec = Integer.parseInt((split[2]));
        String songData = String.join(" ", Arrays.copyOfRange(split, 3,split.length));
        this.songAuthor = songData.split(":")[0];
        this.songTitle = songData.split(":")[1];
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

    public String getSongAuthor() {
        return songAuthor;
    }

    public void setSongAuthor(String songAuthor) {
        this.songAuthor = songAuthor;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    @Override
    public String toString() {
        return "Zeneszam{" +
                "min=" + min +
                ", sec=" + sec +
                ", stationID='" + stationID + '\'' +
                ", songAuthor='" + songAuthor + '\'' +
                ", songTitle='" + songTitle + '\'' +
                '}';
    }
}