package dolgozat0301;

public class Dolgozat0301 {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        
        fillMatrix(matrix, 10, 30);
        
        System.out.println("1. Feladat");
        printMinMaxDiffPerLine(matrix);
        
        System.out.println("\n2. Feladat");
        if (anyPrimeInMatrix(matrix)){
            System.out.println("A mátrixban van prímszám.");
        }
        else {
            System.out.println("A mátrixban nincs prímszám.");
        }
        
        System.out.println("\n3. Feladat");
        int[] firstPrimePos = getFirstPrimePos(matrix);
        if (firstPrimePos[0] != -1){
            System.out.println("Az első prímszám a(z) "+(firstPrimePos[0]+1)+". sor "+(firstPrimePos[1]+1)+". eleme.");
        }
    }
    
    public static void fillMatrix(int[][] toFill, int min, int max){
        for (int i = 0; i < toFill.length; i++){
            for (int j = 0; j < toFill[i].length; j++){
                toFill[i][j] = (int)(Math.random() * (max-min+1) )+min;
            }
        }
    }
    
    public static void printMinMaxDiffPerLine(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            int min = matrix[i][0], max = matrix[i][0];
            
            for (int j = 1; j < matrix[i].length; j++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
                else if (matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            
            System.out.println("A(z) "+(i+1)+". sorban a különbség: "+(max-min));
        }
    }
    
    public static boolean isPrimeNum(int num){
        int osztok = 0;
        for (int k = 1; k <= num/2; k++){
            if (num % k == 0){
                osztok++;
            }
        }

        if (osztok == 1){
            return true;
        }
        return false;
    }
    
    public static boolean anyPrimeInMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (isPrimeNum(matrix[i][j])){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static int[] getFirstPrimePos(int[][] matrix){
        int[] primePos = new int[] {-1,-1};
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (isPrimeNum(matrix[i][j])){
                    primePos[0] = i;
                    primePos[1] = j;
                    return primePos;
                }
            }
        }
        
        return primePos;
    }
}