package Ejercicio_3;
import java.util.Scanner;

public class MyMatrix {
	Scanner scan = new Scanner(System.in);
	int[][] matrix;
	int rows;
	int cols;
	
	public MyMatrix(int[][] matrix) {
		this.matrix = matrix;
		this.rows = this.matrix.length;
		this.cols = this.matrix[0].length;
	}

	public int[][] multiplyMatrices(int[][] matrix1) {
		int rows1 = matrix1.length;
		int cols1 = matrix1[0].length;
		System.out.println(rows1);
		System.out.println(cols1);
		int[][] multipliedMatrix = new int[rows][cols1];
		int c = 0;
		for(int i=0; i<cols1; i++) {
			for(int j=0; j<rows1; j++) {
				int f = 0;
				System.out.println("c: " + c);
				for(int m=0; m<rows; m++) {
					int sum = 0;
					System.out.println("f: " + f);
					for(int n=0; n<cols; n++) {
						sum += matrix[m][n] * matrix1[j][i];
					}
					multipliedMatrix[f][c] = sum;
					f++;
				}
			}
			c++;
		}
		return multipliedMatrix;
		}
	
	public int[][] transposeMatrix() {
		int[][] transposedMatrix = new int[cols][rows];
		int col = 0;
		for(int i = 0; i<rows; i++) {
			int row = 0;
			for(int j = 0; j<cols; j++) {
				transposedMatrix[row][col] = matrix[i][j];
				row++;
			}
			col++;
		}
		return transposedMatrix;
	}
	
	public int diagonalAddition() {
		int sum = 0;
		for(int i=0; i<cols; i++) {
			sum += matrix[i][i];
		}
		return sum;
	}
	
	public int maxValue() {
		int max = 0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}
	
	public int[][] matricesAddition(int[][] matrix1) {
		int[][] additionMatrix = new int[rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				additionMatrix[i][j] = matrix[i][j] + matrix1[i][j];
			}
		}
		return additionMatrix;
	}
	
	public int[][] multiplyScalarMatrix(int escalar) {
		int[][] multipliedScalarMatrix = new int[rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				multipliedScalarMatrix[i][j] = matrix[i][j] * escalar;
			}
		}
		return multipliedScalarMatrix;
	}
}
