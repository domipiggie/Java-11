public class Afador extends Dog{
    private double furLength;

    public Afador(boolean isAlive, double size, Integer barkVolume, double furLength) {
        super(isAlive, size, barkVolume);
        this.furLength = furLength;
    }

    public double getFurLength() {
        return furLength;
    }

    public void setFurLength(double furLength) {
        this.furLength = furLength;
    }
}
