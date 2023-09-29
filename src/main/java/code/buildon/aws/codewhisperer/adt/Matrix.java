package code.buildon.aws.codewhisperer.adt;

public class Matrix {

    // Declare a matrix with 5 columns and 5 rows.
    private int[][] matrix = new int[5][5];

    // Create a method to init the matrix with random values.
    public void initMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    // Create a method to print the matrix.
    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (j == matrix[i].length - 1) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

    // Create a method to print the matrix values in a spiral format.
    public void printSpiral() {
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
                rowEnd--;
            }
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                    colStart++;
                }
                colStart--;
            }
            System.out.println();
        }
        System.out.println();
    }

    // Create a method to add a new row into the matrix and init the row with random values.
    public void addRow() {
        int[][] newMatrix = new int[matrix.length + 1][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < newMatrix[newMatrix.length - 1].length; i++) {
            newMatrix[newMatrix.length - 1][i] = (int) (Math.random() * 10);
        }
        matrix = newMatrix;
    }

    // Create a method to remove the last column of the matrix.
    public void removeColumn() {
        int[][] newMatrix = new int[matrix.length][matrix[0].length - 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }
        matrix = newMatrix;
    }

    // Create a method to sort the elements of a given column in asc order.
    public void sortColumn(int columnIndex) {
        int[] sortedArray = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sortedArray[i] = matrix[i][columnIndex];
        }
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][columnIndex] = sortedArray[i];
        }
    }

    // Create a method to check if the matrix is a square one.
    public boolean isSquare() {
        return matrix.length == matrix[0].length;
    }

    // Main method.
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.initMatrix();
        matrix.printMatrix();
        System.out.println("Square matrix? " + matrix.isSquare());
        matrix.removeColumn();
        System.out.println("Square matrix? " + matrix.isSquare());
    }
    
}
