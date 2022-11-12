// 2. Faça um programa que verifica se o código inicial de um produto começa com “BEB”.

import java.util.Scanner;

public class JavaStringEx02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Digite o código do produto: ");
		String codigo = teclado.next();
		
		if (codigo.toUpperCase().startsWith("BEB")) {
			System.out.println("Começa com o código BEB!");
		} else {
			System.out.println("Não começa com o código BEB.");
		}
		
		teclado.close();
	}
}
