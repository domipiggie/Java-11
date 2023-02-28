package dolgozatgyak230228;

public class DolgozatGyak230228 {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int[][] matrix2 = new int[5][5];
        fillMatrix(matrix, 65, 69);
        fillMatrix(matrix2, 65, 69);
        printMatrix(matrix);
        
        matrixPrintRowMaxes(matrix);
        matrixPrintColumnMins(matrix);
        
        printMatrix(matrixSum(matrix, matrix2));
        
        float[][] hanyados = matrixHanyados(matrix, matrix2);
        
        System.out.println(isNextValueEquals(matrix));
        printMatrix(matrix);
        
        int[] stat = matrixStatistic(matrix);
        for (int i = 0; i < stat.length; i++){
            if (stat[i] != 0){
                System.out.println(i+"-ből/ból "+stat[i]+"db van");
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
    
    public static void fillMatrix(int[][] toFill, int min, int max){
        for (int i = 0; i < toFill.length; i++){
            for (int j = 0; j < toFill[i].length; j++){
                toFill[i][j] = (int)(Math.random() * (max-min+1) )+min;
            }
        }
    }
    
    public static void matrixPrintRowMaxes(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            int rowMax = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] > rowMax){
                    rowMax = matrix[i][j];
                }
            }
            System.out.println("Az "+(i+1)+". sor maximum értéke: "+rowMax);
        }
    }
    
    public static void matrixPrintColumnMins(int[][] matrix){
        for (int j = 0; j < matrix[0].length; j++){
            int colMin = Integer.MAX_VALUE;
            for (int i = 0; i < matrix.length; i++){
                if (colMin > matrix[i][j]){
                    colMin = matrix[i][j];
                }
            }
            System.out.println("Az "+(j+1)+". oszlop minimum értéke: "+colMin);
        }
    }
    
    public static int[][] matrixSum(int[][] matrix1, int[][] matrix2){
        int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++){
                sumMatrix[i][j] = matrix2[i][j] + matrix1[i][j];
            }
        }
        
        return sumMatrix;
    }
    
    public static float[][] matrixHanyados(int[][] matrix1, int[][] matrix2){
        float[][] hanyadosMatrix = new float[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++){
                hanyadosMatrix[i][j] = (float)matrix1[i][j] / (float)matrix2[i][j];
            }
        }
        
        return hanyadosMatrix;
    }
    
    public static boolean isNextValueEquals(int[][] matrix){
        /*for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length-1; j++){
                if (matrix[i][j] == matrix[i][j+1]){
                    return true;
                }
            }
        } 
        
        return false;*/
        
        int i = 0, j = 0;
        boolean isEquals = false;
        
        while (!isEquals && i < matrix.length){
            while (!isEquals && j < matrix[i].length-1){
               if (matrix[i][j] == matrix[i][j+1]){
                    isEquals = true;
               }
               j++;
            }
            i++;
        }
        
        return isEquals;
    }
    
    public static int[] matrixStatistic(int[][] matrix){
        int[] stat = new int[256];
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                stat[matrix[i][j]] += 1;
            }
        }
        
        return stat;
    }
}