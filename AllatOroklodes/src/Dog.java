public class Dog extends Animal {
    private Integer barkVolume;

    public Dog(boolean isAlive, double size, Integer barkVolume) {
        super(isAlive, size);
        this.barkVolume = barkVolume;
    }

    public Integer getBarkVolume() {
        return barkVolume;
    }

    public void setBarkVolume(Integer barkVolume) {
        this.barkVolume = barkVolume;
    }

    public void bark(){
        for (int i = 0; i < barkVolume; i++){
            System.out.println("Bark");
        }
    }
}