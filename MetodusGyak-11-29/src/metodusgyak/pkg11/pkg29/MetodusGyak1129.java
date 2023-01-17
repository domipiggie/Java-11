package metodusgyak.pkg11.pkg29;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class MetodusGyak1129 {

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.println(isEveryDigitEven(246));
        
        System.out.println(isMiddleNumber(2,8,5));
        
        matrixPrint(5);
    }
    
    public static boolean isEveryDigitEven(int num){
        boolean allEven = true;
        
        while (num > 0 && allEven){
            if ((num % 10) % 2 != 0){
                allEven = false;
            }
            
            num = num / 10;
        }
        
        return allEven;
    }
    
    public static boolean isMiddleNumber(int a, int b, int c){
        int maxNum = Math.max(a, Math.max(b, c));
        int minNum = Math.min(a, Math.min(b, c));
        int middleNum = a+b+c - maxNum - minNum;
        
        return maxNum - middleNum == middleNum - minNum;
    }
    
    public static void matrixPrint(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print((int)(Math.random()*2) + "\t");
            }
            System.out.println("");
        }
    }
}
