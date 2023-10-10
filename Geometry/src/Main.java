public class Main {

    public static void main(String[] args) {
        Circle myCircle = new Circle("Kör", 78.5, 5.0);
        System.out.println(myCircle);

        myCircle.setRadius(7.1);

        System.out.println(myCircle);
    }

}