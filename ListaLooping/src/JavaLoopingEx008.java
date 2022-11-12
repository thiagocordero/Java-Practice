// 8. Faça um programa que leia 5 números e informe a soma e a média dos números.

import java.util.Scanner;

public class JavaLoopingEx008 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, soma = 0;
		float media;
		
		for (int i = 1; i <=  5; i++) {
			System.out.printf("Digite o %d° número: ", i);
			num = teclado.nextInt();
			soma += num;
		}
		teclado.close();
		
		media = (float) soma / 5;
		System.out.println("\nA soma dos números digitados é: " + soma);
		System.out.printf("A média dos números digitados é: %.2f", media);
	}

}
