package Ejercicio_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix1 = {{1, 2, 3}, {4 ,5, 6}, {7, 8, 9}};
		int[][] matrix2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
		MyMatrix myMatrix = new MyMatrix(matrix1);
		int[][] multipliedMatrix = myMatrix.multiplyMatrices(matrix2);
		System.out.println("Multiply two matrices");
		for(int i=0; i<multipliedMatrix.length; i++) {
			System.out.print("{");
			for(int j=0; j<multipliedMatrix[0].length; j++) {
				System.out.print(multipliedMatrix[i][j] + ", ");
			}
			System.out.println("}");
		}
		
		int[][] transposedMatrix = myMatrix.transposeMatrix();
		System.out.println("Transpose matrix");
		for(int i=0; i<transposedMatrix.length; i++) {
			System.out.print("{");
			for(int j=0; j<transposedMatrix[0].length; j++) {
				System.out.print(transposedMatrix[i][j] + ", ");
			}
			System.out.println("}");
		}
		
		int sum = myMatrix.diagonalAddition();
		System.out.println("Diagonal addition");
		System.out.println(sum);
		
		int max = myMatrix.maxValue();
		System.out.println("Max value");
		System.out.println(max);
		
		int[][] additionMatrix = myMatrix.matricesAddition(matrix2);
		System.out.println("Matrices addition");
		for(int i=0; i<additionMatrix.length; i++) {
			System.out.print("{");
			for(int j=0; j<additionMatrix[0].length; j++) {
				System.out.print(additionMatrix[i][j] + ", ");
			}
			System.out.println("}");
		}
		
		int[][] multipliedScalarMatrix = myMatrix.multiplyScalarMatrix(2);
		System.out.println("Multiply scalar with matrix");
		for(int i=0; i<multipliedScalarMatrix.length; i++) {
			System.out.print("{");
			for(int j=0; j<multipliedScalarMatrix[0].length; j++) {
				System.out.print(multipliedScalarMatrix[i][j] + ", ");
			}
			System.out.println("}");
		}
	}
}
