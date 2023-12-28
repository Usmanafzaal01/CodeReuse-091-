
package codereuse;
public class Main {

    public static void main(String[] args) {
        
        int[] arrayToSort = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Original Array:");
        codereuse.printArray(arrayToSort);

        
        codereuse.sortAscending(arrayToSort);

        System.out.println("Sorted Array in Ascending Order:");
        codereuse.printArray(arrayToSort);

        
        int maxValue = codereuse.findMax(arrayToSort);
        System.out.println("Maximum Value in the Array: " + maxValue);

    
        int rows = 3;
        int columns = 3;

        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        System.out.println("Matrix A:");
        codereuse.printMatrix(matrixA);

        System.out.println("Matrix B:");
        codereuse.printMatrix(matrixB);

    
        int[][] resultMatrix = codereuse.matrixAddition(matrixA, matrixB, rows, columns);

        System.out.println("Resultant Matrix (Sum of A and B):");
        codereuse.printMatrix(resultMatrix);
    }
}

