/* Faça um programa, utilizando for, que permita o usuário fazer três contas de
subtração. O usuário deve conseguir reconhecer que são três contas diferentes. */

import java.util.Scanner;

public class JavaForEx07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		
		for(int i = 1; i < 4; i++) {
			System.out.printf("\n---- SUBTRAÇÃO %d ----\n", i);
			
			System.out.print("\nDigite o primeiro número: ");
			n1 = teclado.nextInt();
			System.out.print("Digite o segundo número: ");
			n2 = teclado.nextInt();
			
			System.out.printf("%d - %d = %d\n", n1, n2, n1-n2);
			
		}
		
		teclado.close();

	}

}
