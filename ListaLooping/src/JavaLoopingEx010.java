/* 10. Faça um programa que receba dois números inteiros e gere os números inteiros que
estão no intervalo compreendido por eles. */

import java.util.Scanner;

public class JavaLoopingEx010 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		int n1 = teclado.nextInt();
		
		System.out.print("Digite o último número do intervalo: ");
		int n2 = teclado.nextInt();
		
		teclado.close();
		
		for (int i = n1; i <= n2; i++) {
			System.out.print(i + " ");
		}
	}

}
