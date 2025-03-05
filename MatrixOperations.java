import java.util.*;

public class MatrixOperations {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter number of rows: ");
        	int n = sc.nextInt();
        	System.out.print("Enter number of columns: ");
        	int m = sc.nextInt();

        	int[][] matrix1 = generateMatrix(n, m);
        	int[][] matrix2 = generateMatrix(n, m);
        
       	 	System.out.println("Matrix 1:");
        	displayMatrix(matrix1);
        	System.out.println("Matrix 2:");
        	displayMatrix(matrix2);
        
        	System.out.println("Addition:");
        	displayMatrix(add(matrix1, matrix2));
        
        	System.out.println("Subtraction:");
        	displayMatrix(subtract(matrix1, matrix2));
      		
		System.out.println("Multiplication: ");
                displayMatrix(multiply(matrix1, matrix2)); 

		System.out.println("Transpose of a matrix :");
                displayMatrix(transpose(matrix1));
		System.out.println();
		displayMatrix(transpose(matrix2));
 
        	if (n == m) {
            		System.out.println("Determinant of Matrix 1: " + determinant(matrix1));
            		System.out.println("Determinant of Matrix 2: " + determinant(matrix2));
        	}
		
		System.out.println("Inverse of a matrix :");
                displayMatrix(inverse(matrix1));
		System.out.println();
                displayMatrix(inverse(matrix2));
    	}
    
	//Generate matrices and add random values to it
    	public static int[][] generateMatrix(int n, int m) {
        	int[][] matrix = new int[n][m];
        	for (int i = 0; i < n; i++) {
            		for (int j = 0; j < m; j++) {
                		matrix[i][j] = (int) (Math.random() * 10);
            		}
        	}
        	return matrix;
    	}
    	
	//method to perform add operation on matrices
    	public static int[][] add(int[][] m1, int[][] m2) {
        	int[][] result = new int[m1.length][m1[0].length];
        	for (int i = 0; i < m1.length; i++) {
            		for (int j = 0; j < m1[0].length; j++) {
                		result[i][j] = m1[i][j] + m2[i][j];
            		}
        	}
        	return result;
    	}
    	
	//method to perform subraction on two matrices
    	public static int[][] subtract(int[][] m1, int[][] m2) {
        	int[][] result = new int[m1.length][m1[0].length];
        	for (int i = 0; i < m1.length; i++) {
            		for (int j = 0; j < m1[0].length; j++) {
                		result[i][j] = m1[i][j] - m2[i][j];
            		}
        	}
        	return result;
    	}
		
	//method to perform multiplication on two matrices
	public static int[][] multiply(int[][] m1, int[][] m2) {
        	int[][] result = new int[m1.length][m1[0].length];
        	for (int i = 0; i < m1.length; i++) {
            		for (int j = 0; j < m2[0].length; j++) {
                		for (int k = 0; k < m1[0].length; k++) {
                   	 		result[i][j] += m1[i][k] * m2[k][j];
                		}
            		}
        	}
        	return result;
    	}


	//method to get transpose of a matrix
	public static int[][] transpose(int[][] matrix) {
        	int[][] transposed = new int[matrix[0].length][matrix.length];
        	for (int i = 0; i < matrix.length; i++) {
            		for (int j = 0; j < matrix[0].length; j++) {
                		transposed[j][i] = matrix[i][j];
            		}
        	}
        	return transposed;
    	}
    
	//find determinant	
    	public static int determinant(int[][] matrix) {
        	if (matrix.length == 2) {
            		return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        	} 
		else if (matrix.length == 3) {
            		return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        	}
        	return 0;
    	}

	//find inverse of matrix
	public static int[][] inverse(int[][] matrix) {
		int size = matrix.length;
        	if (size == 2) {
            		int det = determinant(matrix);
            		if (det == 0) {
                		throw new IllegalArgumentException("Matrix is not invertible");
            		}
            	int[][] inverse = new int[2][2];
            	inverse[0][0] = (int) Math.round(matrix[1][1] / (double) det);
           	inverse[0][1] = (int) Math.round(-matrix[0][1] / (double) det);
            	inverse[1][0] = (int) Math.round(-matrix[1][0] / (double) det);
            	inverse[1][1] = (int) Math.round(matrix[0][0] / (double) det);
            	return inverse;
        	} 
		else if (size == 3) {
            		int det = determinant(matrix);
            		if (det == 0) {
                		throw new IllegalArgumentException("Matrix is not invertible");
            		}
            		int[][] inverse = new int[3][3];
            		for (int i = 0; i < 3; i++) {
                		for (int j = 0; j < 3; j++) {
                    			int[][] minor = new int[2][2];
                    			int row = 0, col;
                    			for (int x = 0; x < 3; x++) {
                        			if (x == i) continue;
                        			col = 0;
                        			for (int y = 0; y < 3; y++) {
                            				if (y == j) continue;
                            				minor[row][col] = matrix[x][y];
                            			col++;
                        			}
                        		row++;
                    			}
                    			inverse[j][i] = (int) Math.round((Math.pow(-1, i + j) * determinant(minor)) / (double) det);
                		}
            		}
            		return inverse;
        	} 
		else {
            		throw new IllegalArgumentException("Only 2x2 and 3x3 matrices are supported");
        	}

        }
    	
	//print matrix
    	public static void displayMatrix(int[][] matrix) {
        	for (int i = 0; i < matrix.length; i++) {
            		for (int j = 0; j < matrix[i].length; j++) {
                		System.out.print((int)matrix[i][j] + " ");
            		}
            		System.out.println();
        	}
    	}
}
