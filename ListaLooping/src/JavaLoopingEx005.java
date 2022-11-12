/* 5. Altere o programa anterior permitindo ao usuário informar as populações e as taxas
de crescimento iniciais. Valide a entrada e permita repetir a operação. */

import java.util.Scanner;

public class JavaLoopingEx005 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o número de habitantes A: ");
		int habitantesA = teclado.nextInt();
		
		System.out.println("Digite a tava de crescimento A (em %): ");
		double crescimentoA = teclado.nextDouble();
		
		System.out.println("Digite o número de habitantes B: ");
		int habitantesB = teclado.nextInt();
		
		System.out.println("Digite a tava de crescimento B (em %): ");
		double crescimentoB = teclado.nextDouble();
		
		teclado.close();
	
		int anos;
		for (anos = 1; habitantesA < habitantesB ; anos++) {
			habitantesA = (int) (habitantesA + (habitantesA * crescimentoA / 100));
			habitantesB = (int) (habitantesB + (habitantesB * crescimentoB / 100));
			//System.out.printf("Ano %d\n", anos);			
			//System.out.println("Habitantes A = " + habitantesA);
			//System.out.println("Habitantes B = " + habitantesB);
		}
		
		System.out.printf("Levará %d ANOS para Habitantes de A passarem Habitantes de B", anos);
		System.out.printf("\nNo ano %d\n", anos);			
		System.out.println("Habitantes A = " + (int) habitantesA);
		System.out.println("Habitantes B = " + (int) habitantesB);
			
	}

}
