// 3. Crie um programa para ler 3 notas e mostrar a média delas.

import java.util.Scanner;

public class JavaWhileEx03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float nota, soma = 0, media;
		int cont = 0;
		
		while (cont < 3) {
			System.out.printf("Digite a Nota %d : ", cont+1);
			nota = teclado.nextInt();
			
			soma += nota; 
			cont++;
		}
		
		media = soma / cont;
		System.out.printf("A média é: %.1f", media);
		
		teclado.close();

	}

}
