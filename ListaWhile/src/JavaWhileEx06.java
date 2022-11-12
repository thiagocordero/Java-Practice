/* 6. Usando o laço while para pedir ao usuário que tente acertar um número aleatório
entre 0 e 10 (incluindo) e mostrar a quantidade de tentativas feitas. Dica: Usar o
comando Random numero = new Random();
*/

import java.util.Scanner;
import java.util.Random;

public class JavaWhileEx06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		int num = aleatorio.nextInt(11);	

		System.out.println("O computador escolheu um número de 0 a 10. Tente adivinhar!");
		
		boolean acertou = false;
		int numTentativas = 1;
		
		do {
			System.out.println("Sua Tentativa: ");
			int tentativa = teclado.nextInt();
		
			if (tentativa == num) {
				System.out.printf("Parabéns! Você acertou com %d tentativas.", numTentativas);
				acertou = true;
			} else {
				System.out.printf("Não foi dessa vez. Tentativas: %d \n", numTentativas);
				numTentativas++;
			}
		} while (acertou == false);
		
		teclado.close();
	}

}
