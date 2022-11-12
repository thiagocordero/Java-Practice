import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] matrix = new int[7][7];
		
		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(9);
			}
		}
		
		System.out.println("Matriz: ");
		
		for (int[] linha : matrix) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");				
			}
			System.out.println();
		}
	}
}