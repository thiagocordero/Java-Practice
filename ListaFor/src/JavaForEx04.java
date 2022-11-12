/* 4. Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a
10 do valor lido. */

import java.util.Scanner;

public class JavaForEx04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, invalido = 0;
		
		// Pedir valor e aceitar somente entre 1 e 10
		do {
			System.out.println("Digite um número para gerar sua tabuada: ");
			num = teclado.nextInt();
			if (num > 0 && num < 11) {
				invalido = 0;
			} else {
				System.out.println("O número precisa estar entre 1 e 10!");
				invalido = 1;
			}
		} while (invalido == 1);
		
		// Escrever a tabuada de 1 a 10 do número:
		
		System.out.println("--------------------");
		System.out.printf("--- TABUADA DO %d ---\n", num);
		System.out.println("--------------------");
		for (int i = 1; i < 11; i++) {
			System.out.printf("---  %d x %d = %d \n", num, i, num*i);
		}
		
		teclado.close();

	}

}
