public class Animal {
    private boolean isAlive;
    private double size;

    public Animal(boolean isAlive, double size) {
        this.isAlive = isAlive;
        this.size = size;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
