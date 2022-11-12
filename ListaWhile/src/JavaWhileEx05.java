/* 5. Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar
um número diferente, mostrar a mensagem "entrada inválida" e solicitar o número
novamente. Se digitar correto mostrar o número digitado.
*/

import java.util.Scanner;

public class JavaWhileEx05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, numInvalido;
		
		do {
			System.out.println("Digite um número entre 12 e 20: ");
			num = teclado.nextInt();
			
			if (num >= 12 && num <= 20) {
				numInvalido = 0;
			} else {
				System.out.println("Número inválido.");
				numInvalido = 1;
			}
		} while (numInvalido == 1);
		
		System.out.println("O número digitado foi: " + num);
		teclado.close();
	}

}
