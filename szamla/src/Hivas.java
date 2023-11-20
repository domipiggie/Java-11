public class Hivas {
    private int startHour, startMinute, startSecond, endHour, endMinute, endSecond;
    private String phoneNumber;

    public Hivas(String[] split, String phoneNumber){
        this.startHour = Integer.parseInt(split[0]);
        this.startMinute = Integer.parseInt(split[1]);
        this.startSecond = Integer.parseInt(split[2]);
        this.endHour = Integer.parseInt(split[3]);
        this.endMinute = Integer.parseInt(split[4]);
        this.endSecond = Integer.parseInt(split[5]);
        this.phoneNumber = phoneNumber;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getStartSecond() {
        return startSecond;
    }

    public void setStartSecond(int startSecond) {
        this.startSecond = startSecond;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public int getEndSecond() {
        return endSecond;
    }

    public void setEndSecond(int endSecond) {
        this.endSecond = endSecond;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Hivas{" +
                "startHour=" + startHour +
                ", startMinute=" + startMinute +
                ", startSecond=" + startSecond +
                ", endHour=" + endHour +
                ", endMinute=" + endMinute +
                ", endSecond=" + endSecond +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}