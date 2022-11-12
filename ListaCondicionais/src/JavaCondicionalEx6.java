/* 6. João é pescador e usa um microcomputador para controlar o seu rendimento diário.
Toda vez que ele traz um peso de peixe maior do que o estabelecido no regimento
de pesca do Estado de SP (50 quilos), ele deve pagar uma multa de R$ 4,00 por
quilo excedente. Faça um programa que, quando João informar o peso de peixes
que trouxe no dia, o programa retorna o valor da multa.
*/

import java.util.Scanner;

public class JavaCondicionalEx6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos Kg de peixe foram pescados?");
		float peso = teclado.nextFloat();
		
		float multa = (peso <= 50) ? 0 : (peso - 50) * 4;
		
		System.out.printf("Você pescou %.2f Kg.\n", peso);
		
		if(peso <= 50) {
			System.out.printf("Não será preciso pagar multa!");									
		} else {
			System.out.printf("Você ultrapassou o limite em %.2f kilos. \n", peso - 50);
			System.out.printf("A multa é de R$%.2f", multa);	
		}
		
	teclado.close();
			

	}

}
