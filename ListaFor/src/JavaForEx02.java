/* 2. Crie um programa que calcula o fatorial de um número. Mas o incremento do for deve
ser regressivo. */

import java.util.Scanner;

public class JavaForEx02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long num, fatorial; // a partir do fatoriaL do 12 precisa ser long para dar certo
		
		System.out.println("Digite um número para calcular seu fatorial: ");
		num = teclado.nextInt();
		
		System.out.printf("%d! = ", num);
		
		fatorial = 1;
		for(long i = num; i > 0; i--) {
			fatorial *= i;
			if (i > 1) {
				System.out.printf("%d * ", i);
			} else {
				System.out.printf("%d = %d", i, fatorial);
			}
			
		}
		teclado.close();

	}

}
