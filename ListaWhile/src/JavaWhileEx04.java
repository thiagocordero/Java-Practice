/* 4. Escreva um programa com um looping indeterminado em que enquanto o usuário não
pedir para o programa sair, ele continua printando um contador na tela.
*/

import java.util.Scanner;

public class JavaWhileEx04 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int cont = 1;
		char resp;
		
		do {
			System.out.print("Contador: " + cont);
			cont++;
			System.out.print("   --> Deseja sair? (s/n): ");
			resp = teclado.next().toUpperCase().charAt(0);
		} while (resp == 'N');
		
		System.out.println("Saindo...");
		teclado.close();
		
	}
	
	

}
