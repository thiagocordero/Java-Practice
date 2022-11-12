/* 4. O usuário insere um CPF seguindo xxx.xxx.xxx-xx. O programa deve apagar os pontos e
o hífen e, depois contar quantos caracteres foram inseridos. */

import java.util.Scanner;

public class JavaStringEx04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu CPF: ");
		String cpf = teclado.next();
		
		cpf = cpf.replace(".", "");
		cpf = cpf.replace("-", "");
		
		System.out.printf("\nO cpf %s possui %d digitos.", cpf, cpf.length());
		
		teclado.close();
		
	}

}
