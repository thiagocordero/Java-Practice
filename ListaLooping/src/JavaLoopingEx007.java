// 7. Faça um programa que leia 5 números e informe o maior número

import java.util.Scanner;

public class JavaLoopingEx007 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, maior = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Digite o %d° número: ", i);
			num = teclado.nextInt();
			if (i == 1 || num > maior) {
				maior = num;
			}	
		}
		teclado.close();
		System.out.println("\nO maior número digitado foi: " + maior);
	}
}
