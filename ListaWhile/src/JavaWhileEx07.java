/* 7. O usuário vai digitar uma nota válida (de 0 até 10). O programa deverá armazenar
estas notas em um acumulador. Usar uma segunda variável para contar quantas notas
foram armazenadas. Ao final, quando o usuário não quiser mais lançar notas, ele pede
para sair e o programa imprime na tela a média das notas.
*/

import java.util.Scanner;

public class JavaWhileEx07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		char continuar;
		float nota, soma = 0, media;
		int numNotas = 0;
		
		do {
			// Receber nota válida de 0 a 10
			
			boolean invalida;
			
			do {
				System.out.println("Digite uma nota de 0 a 10: ");
				nota = teclado.nextFloat();
				
				if (nota < 0 || nota > 10) {
					System.out.println("Nota inválida.");
					invalida = true;
				} else {
					invalida = false;
				}
			} while (invalida == true);
			
			
			// Armazenar em um acumulador
			soma += nota;
			
			// Contar numNotas
			numNotas++;
			
			System.out.println("Deseja continuar? (s/n): ");
			continuar = teclado.next().toLowerCase().charAt(0);
		
			// Repetir até usuário pedir para sair
		} while (continuar == 's');
		
		teclado.close();
		
		// Imprime na tela a media
		media = soma / numNotas;
		System.out.printf("A média das %d notas digitadas é: %.1f", numNotas, media);
		
	}

}
