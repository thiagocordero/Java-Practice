// 6. Ler 10 números e imprimir quantos são pares e quantos são ímpares.

import java.util.Scanner;

public class JavaForEx06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, par = 0, impar = 0;
		
		for (int i= 1; i < 11; i++) {
			System.out.printf("Digite o %d° número: ", i);
			num = teclado.nextInt();
			
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.printf("\nPares: %d", par);
		System.out.printf("\nÍmpares: %d", impar);
		
		teclado.close();
		

	}

}
