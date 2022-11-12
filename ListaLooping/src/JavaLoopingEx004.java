/* 4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma
taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com
uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número
de anos necessários para que a população do país A ultrapasse ou iguale a população
do país B, mantidas as taxas de crescimento. */


public class JavaLoopingEx004 {

	public static void main(String[] args) {
		
		double habitantesA = 80000, habitantesB = 200000;
		double crescimentoA = 1.03, crescimentoB = 1.015;
		
		int anos;
		for (anos = 1; habitantesA < habitantesB ; anos++) {
			habitantesA = habitantesA * crescimentoA;
			habitantesB = habitantesB * crescimentoB;
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
