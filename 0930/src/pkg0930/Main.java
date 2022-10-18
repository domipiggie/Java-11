package pkg0930;

public class Main {

    public static void main(String[] args) {
        // random szám 1-7 között, ez a nap szám
        int nap = (int)(Math.random() * 7) + 1;
        // nap nevének kiíratása száma alapján
        switch ( nap ){
            case 1: System.out.println("Hétfő");break;
            case 2: System.out.println("Kedd");break;
            case 3: System.out.println("Szerda");break;
            case 4: System.out.println("Csütörtök");break;
            case 5: System.out.println("Péntek");break;
            case 6: System.out.println("Szombat");break;
            case 7: System.out.println("Vasárnap");break;
            default: System.out.println("Nem meghatározható");
        }
    }
    
}
