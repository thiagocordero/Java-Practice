/* . Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso
o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class JavaLoopingEx001 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double nota;
		int notaInvalida = 0;
		
		do {
			System.out.println("Digite uma nota entre 0 e 10 (decimais com vírgula): ");
			nota = teclado.nextFloat();
			
			if (nota > 0 && nota < 10.0) {
				notaInvalida = 0;		
			} else {
				System.out.println("Nota inválida!");
				notaInvalida = 1;
			}
		} while (notaInvalida == 1);
		
		teclado.close();
		
		System.out.println("A nota digitada foi: " + nota);

	}

}
