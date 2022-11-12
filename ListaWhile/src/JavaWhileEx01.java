/* 1. Crie um programa que imprima 11 vezes a frase " Hello World!" utilizando uma
estrutura sequencial e uma estrutura de repetição while.
 */

public class JavaWhileEx01 {

	public static void main(String[] args) {
		
		int cont = 1;
		
		while(cont < 12) {
			System.out.println("Hello World " + cont);
			cont++;
		}
	}

}
