// 3. Faça um programa que verifica qual o último caractere digitado no texto.

import java.util.Scanner;

public class JavaStringEx03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = teclado.next().toUpperCase();
		
		char ultimaLetra = palavra.charAt(palavra.length() - 1);
		System.out.printf("A última letra de %s é %s", palavra, ultimaLetra);
		
		teclado.close();

	}

}
