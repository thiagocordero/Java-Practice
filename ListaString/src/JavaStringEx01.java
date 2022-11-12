// 1. Faça um programa que verifica se o texto começa com letra em caixa alta ou não

import java.util.Scanner;

public class JavaStringEx01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String texto = teclado.next();
		
		if (texto.toUpperCase().charAt(0) == (texto.charAt(0))) {
			System.out.println("Começa com letra maiuscula!");
		} else {
			System.out.println("Não começa com letra maiuscula!");
		}
		teclado.close();
	}

}
