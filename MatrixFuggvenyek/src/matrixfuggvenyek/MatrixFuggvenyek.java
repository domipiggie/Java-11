package matrixfuggvenyek;

public class MatrixFuggvenyek {

    public static void main(String[] args) {
        int[][] numMatrix = new int[4][5];
        
        fillMatrix(numMatrix);
        
        matrixPrint(numMatrix);
        
        System.out.println("\nMátrix visszafelé");
        matrixReversePrint(numMatrix);
        
        
        System.out.println("\nA mátrix összege: "+matrixSum(numMatrix));
        
        
        if (isOverHalfEven(numMatrix)){
            System.out.println("\nA mátrix több mint fele páros.");
        }
        else {
            System.out.println("\nA mátrix kevesebb mint fele páros.");
        }
        
        System.out.println("\nMátrix értékeinek duplázása");
        doubleMatrixValues(numMatrix);
        matrixPrint(numMatrix);
    }
    
    public static void fillMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random() * 11);
            }
        }
    }
    
    public static void matrixPrint(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void matrixReversePrint(int[][] matrix) {
        for (int i = matrix.length-1; i >= 0; i--){
            for (int j = matrix[i].length-1; j >= 0; j--){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static int matrixSum(int[][] matrix){
        int sum = 0;
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sum+=matrix[i][j];
            }
        }
        
        return sum;
    }
    
    public static int evenNumberCount(int[][] matrix){
        int evenCount = 0;
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] % 2 == 0){
                    evenCount++;
                }
            }
        }
        
        return evenCount;
    }
    
    public static boolean isOverHalfEven(int[][] matrix){
        float evenCount = evenNumberCount(matrix);
        float totalCount = 0;
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                totalCount++;
            }
        }
        
        return (evenCount / totalCount) > 0.5;
    }
    
    public static void doubleMatrixValues(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j]*=2;
            }
        }
    }
}
