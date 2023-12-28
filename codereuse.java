
package codereuse;
public class codereuse {

    public static void sortAscending(int[] arr) {
        int n = arr.length;

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
        
            System.out.println("Error: Array is empty.");
            return Integer.MIN_VALUE; 
        }

        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static int[][] matrixAddition(int[][] matrixA, int[][] matrixB, int rows, int columns) {
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return resultMatrix;
    }


    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] arrayToSort = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Original Array:");
        printArray(arrayToSort);

        
        sortAscending(arrayToSort);

        System.out.println("Sorted Array in Ascending Order:");
        printArray(arrayToSort);

        
        int maxValue = findMax(arrayToSort);
        System.out.println("Maximum Value in the Array: " + maxValue);

        
        int rows = 3;
        int columns = 3;

        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("Matrix B:");
        printMatrix(matrixB);

        
        int[][] resultMatrix = matrixAddition(matrixA, matrixB, rows, columns);

        System.out.println("Resultant Matrix (Sum of A and B):");
        printMatrix(resultMatrix);
    }
}
