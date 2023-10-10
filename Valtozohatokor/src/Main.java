public class Main {

    static Integer globalisValtozo = 10;

    public static void main(String[] args) {
        Integer mainValtozo = 5;

        System.out.println("A main valtozo erteke a main metodusban: " + mainValtozo);
        System.out.println("A globalisValtozo erteke a main metodusban: " + globalisValtozo);

        metodus1();
    }

    public static void metodus1(){
        Integer metodus1Valtozo = 20;

        System.out.println("A metodus1Valtozo erteke a metodus1-ben: " + metodus1Valtozo);
        System.out.println("A globalisValtozo erteke a metodus1-ben: " + globalisValtozo);

        metodus2();
    }

    public static void metodus2(){
        Integer metodus2Valtozo = 69;

        System.out.println("A metodus1Valtozo erteke a metodus2-ben: " + metodus2Valtozo);
        System.out.println("A globalisValtozo erteke a metodus2-ben: " + globalisValtozo);
    }

}