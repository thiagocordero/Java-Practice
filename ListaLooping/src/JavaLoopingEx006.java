/* 6. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
Depois modifique o programa para que ele mostre os números um ao lado do outro. */

public class JavaLoopingEx006 {

	public static void main(String[] args) {
		
		// Um embaixo do outro:
		System.out.println("Embaixo INICIO");
		for(int num = 1; num <= 20; num++) {
			System.out.println(num);
		}
		System.out.println("Embaixo FIM");
		
		// Um ao lado do outro:
		System.out.println("\nLado INICIO: ");
		for(int num = 1; num <= 20; num++) {
			if (num == 20) {
				System.out.print(num + ".");
			} else {
				System.out.print(num + ", ");
			}
			
		}
		System.out.println("\nLado FIM.");
		


	}

}
