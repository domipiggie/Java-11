package gyakorlas2022.pkg12.pkg19;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Gyakorlas20221219 {

    public static float kamatSzamolo(float befOssz, float kamat ,int ev){
        float tizedesKamat = 1 + (kamat/100);
        
        for (int i = 0; i < ev; i++){
            befOssz*=tizedesKamat;
        }
        
        return befOssz;
    }
    
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        System.out.println("Kérem adja meg a befektetett összeget, kamatszázalékot és futamidőt:");
        
        float befOssz = bill.nextFloat();
        float kamat = bill.nextFloat();
        int ev = bill.nextInt();
        
        System.out.println(kamatSzamolo(befOssz, kamat, ev));
    }
    
}
