import java.util.Random;
import java.util.Arrays;

public class DeterminanteMatriz {

	public static void main(String[] args) {
		
		int[] vetor = {1, 2, 3, 4, 5, 6};
		int[][] matriz = new int[2][2];
		Random random = new Random();
		
		System.out.println("-----------------------------");
		System.out.println(" Matriz:");
		System.out.println("-----------------------------");
		
		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				// Gerar matriz a partir do vetor
				matriz[i][j] = vetor[random.nextInt(vetor.length)];
				// Imprimir na tela essa matriz:
				System.out.print(" " + matriz[i][j] + " ");
			}
		System.out.println();
		}
		
		// Calcular Determinante
		int determinante = 0;
		determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
		// Mostrar Determinante 
		System.out.println("------------------------------");
		System.out.printf("Determinante da Matriz: %d \n", determinante);
		System.out.println("------------------------------");
	}
}
