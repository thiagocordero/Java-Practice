// 5. Leia várias idades e calcule a média entre as idades (usar uma variável para idade)

import java.util.Scanner;

public class JavaForEx05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int idade, somaIdades = 0, numIdades = 0;
		float media;
		char continuar;
		
		// Leia a idade e pergunte se quer digitar mais uma
		do {
			System.out.println("Digite a Idade: ");
			idade = teclado.nextInt();
			somaIdades += idade;
			numIdades++;
			System.out.println("Deseja adicionar mais uma idade? (S/N)");
			continuar = teclado.next().toUpperCase().charAt(0);
		} while (continuar == 'S');
		
		System.out.printf("Foram digitadas %d idades \n", numIdades);
		
		media = somaIdades / numIdades;
				
		System.out.printf("A média das idades é de %.1f anos", media);	
				
		teclado.close();		

	}

}
