/* Faça um programa que leia um número inteiro e retorna ao usuário uma
mensagem informando se o número é par ou ímpar e se é positivo ou negativo.
*/

import java.util.Scanner;

public class JavaCondicionalEx4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = teclado.nextInt();
		teclado.close();
		String result = "";
		
		if(num < 0) {
			if (num % 2 == 0) {
				result = "NEGATIVO e PAR";
			} else {
				result = "NEGATIVO e ÍMPAR";
			}
		}
			
		if(num >= 0) {
			if (num % 2 == 0) {
				result = "POSITIVO e PAR";
			} else {
				result = "POSITIVO e ÍMPAR";
			}
			
		}
		
		System.out.printf("O número %d é %s.", num, result);
	}
}
	
