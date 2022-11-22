package metodusgyak;

/**
 *
 * @author user3
 */
public class MetodusGyak {
    static String vowels = "aeioöuüáéíóőúű";
    static String allLetters = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        /*System.out.println(smallestOfThree(8, 8, 5));
        System.out.println(vowelCount("alma alma"));
        System.out.println(wordCount("a a a a a j"));
        System.out.println(isValidPassword("123a"));*/
        System.out.println(isIncreasingOrder(1,2,3));
        System.out.println(getNumDigitSum(156));
        printCharacterRange('p', 'f');
    }
    
    public static int smallestOfThree(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }
    
    public static String middleChar(String text){
        if (text.length() % 2 == 0){
            return text.substring(text.length()/2-1, text.length()/2+1);
        }
        
        return text.substring(text.length()/2, text.length()/2+1);
    }
    
    public static int vowelCount(String text){
        int vowelNum = 0;
        
        for (int i = 0; i < text.length(); i++){
            if (vowels.indexOf(text.toLowerCase().charAt(i)) != -1){
                vowelNum++;
            }
        }
        
        return vowelNum;
    }
    
    public static int wordCount(String text){
        return text.split(" ").length;
    }
    
    public static boolean isValidPassword(String password){
        int numCount = 0;
        int letterCount = 0;
        int runs = 0;
        
        while (runs < password.length() && (numCount <= 1 || letterCount == 0)){
            if (Character.isDigit(password.charAt(runs))){
                numCount++;
            }
            else {
                letterCount++;
            }
            
            runs++;
        }
        
        return numCount > 1 && letterCount > 0 && password.length()>9;
    }
    
    public static boolean isIncreasingOrder(int a, int b, int c){
        return a < b && b < c;
    }
    
    public static int getNumDigitSum(int a){
        int sum = 0;
        
        while (a > 0){
            sum += a % 10;
            
            a = a / 10;
        }
        
        return sum;
    }
    
    public static void printCharacterRange(char a, char b){
        for (int i = Math.min(allLetters.indexOf(a), allLetters.indexOf(b)); i <= Math.max(allLetters.indexOf(a), allLetters.indexOf(b)+1); i++){
            System.out.print(allLetters.charAt(i));
        }
        
        System.out.println("");
    }
}
