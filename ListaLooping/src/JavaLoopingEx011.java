// 11. Altere o programa anterior para mostrar no final a soma dos números.

import java.util.Scanner;

public class JavaLoopingEx011 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		int n1 = teclado.nextInt();
		
		System.out.print("Digite o último número do intervalo: ");
		int n2 = teclado.nextInt();
		
		teclado.close();
		
		int soma = 0;
		System.out.println("");
		for (int i = n1; i <= n2; i++) {
			System.out.print(i + " ");
			soma += i;
		}
		System.out.println("\n\nA soma de todos esses número é: " + soma);

	}

}
