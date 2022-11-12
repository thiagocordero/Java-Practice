/* 5. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
programa que calcule seu peso ideal utilizando as seguintes fórmulas:
a. Homens: Peso Ideal = (72,7 * altura) - 58
b. Mulheres: Peso Ideal = (62,1 * altura) – 44,7
 */

import java.util.Scanner;

public class JavaCondicionalEx5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu sexo (M / F / NB): ");
		char sexo = teclado.next().toUpperCase().charAt(0);
		
		
		System.out.println("Digite sua altura em m: ");
		double altura = teclado.nextDouble();
		double pesoIdealM = (72.7 * altura) - 58;
		double pesoIdealF = (62.1 * altura) - 44.7;
		
		if (sexo == 'M') {
			System.out.println("Seu peso ideal é: " + pesoIdealM);
		} else if (sexo == 'F') {
			System.out.println("Seu peso ideal é: " + pesoIdealF);
		} else if (sexo == 'N') {
			System.out.println("O peso ideal masculino é: " + pesoIdealM);
			System.out.println("O peso ideal feminino é: " + pesoIdealF);
		} else {
			System.out.println("Digite um sexo válido! \nM = masculino; F = feminino; NB = não binário");
		}
		
		teclado.close();
	}

}
