// 5. Fazer um programa com uma palavra secreta. O usuário deverá tentar adivinhar esta palavra.

import java.util.Scanner;

public class JavaStringEx05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		String palavra = "CASA";
		
		char[] letrasPalavra = new char[palavra.length()];
		letrasPalavra = palavra.toUpperCase().toCharArray();
		
		String[] acertos = new String[palavra.length()];
		
		System.out.printf("A palavra secreta tem %d letras. Tente adivinhar!\n", palavra.length());
		for (int i= 0; i < palavra.length(); i++) {
			acertos[i] = ("__");
			System.out.print(acertos[i] + " ");
		}
		
		int fimDeJogo = 0;
		do {
			System.out.print("\n\nDigite uma letra: ");
			String letra = teclado.next().toUpperCase();
			
			if (palavra.toUpperCase().contains(letra)) {
			
				for (int i= 0; i < palavra.length(); i++) {
					if (letrasPalavra[i] == letra.toUpperCase().charAt(0)) {
						acertos[i] = letra;
					}
					System.out.print(acertos[i] + " ");
				}
			} else {
				System.out.println("Não foi dessa vez. Tente de novo!");
				for (int i= 0; i < palavra.length(); i++) {
					System.out.print(acertos[i] + " ");
				}
			}
			
			// Parte de conclusão
			int contador = 0;
			for (int i = 0; i < palavra.length(); i++) {
				if (acertos[i] != "__") {
					contador++;
				}
			}
			
			if (contador == palavra.length()) {
				System.out.println("\nPARABÉNS! VOCÊ ACERTOU A PALAVRA");
				fimDeJogo = 1;
			}
			
			
		} while (fimDeJogo == 0);
	
	teclado.close();

	}

}
