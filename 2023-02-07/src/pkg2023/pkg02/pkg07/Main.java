package pkg2023.pkg02.pkg07;

public class Main {

    public static void main(String[] args) {
        int[][] numMatrix = new int[5][5];
        int[][] m1 = new int[][] {{1,2,3},{1,2,3},{1,2,3}};
        int[][] m2 = new int[][] {{1,2,3},{1,2,3},{1,2,3}};
        fillMatrix(numMatrix);
        printMatrix(numMatrix);
        System.out.println("A mátrix főátlójának összege: " + matrixDiagonalSum(numMatrix));
        switchMatrixDataAtIndex(numMatrix,0,0,4,4);
        printMatrix(numMatrix);
        
        System.out.println(isMatrixEqualToOtherMatrix(m1, m2));
        System.out.println(isMatrixEqualToOtherMatrix(m1, numMatrix));
        System.out.println(isMatrixEqualToOtherMatrix(numMatrix, m1));
        System.out.println(isMatrixEqualToOtherMatrix(numMatrix, numMatrix));
        
        int[][] reversedMatrix = createReverseMatrix(numMatrix);
        printMatrix(numMatrix);
        System.out.println("---");
        printMatrix(reversedMatrix);
    }
    
    public static void fillMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random() * 15);
            }
        }
    }
    
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static int matrixDiagonalSum(int[][] matrix){
        int sum = 0;
        
        for (int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];
        }
        
        return sum;
    }
    
    public static void switchMatrixDataAtIndex(int[][] matrix, int i1, int j1, int i2, int j2){
        int a = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = a;
    }
    
    public static boolean isMatrixEqualToOtherMatrix(int[][] matrix1, int[][] matrix2){
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            return false;
        }
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix2.length; j++){
                if (matrix1[i][j] != matrix2[i][j]){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static int[][] createReverseMatrix(int[][] matrix){
        int[][] reverseMatrix = new int[matrix.length][matrix[0].length];
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                reverseMatrix[matrix.length-1-i][matrix[0].length-1-j] = matrix[i][j];
            }
        }
        
        return reverseMatrix;
    }
}