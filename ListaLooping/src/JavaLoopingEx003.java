/* 3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
*/

import java.util.Scanner;

public class JavaLoopingEx003 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nome, sexo;
		int idade;
		float salario;
		char estadoCivil;
		
		// a. Nome: maior que 3 caracteres;
		do {
			System.out.print("Digite seu Nome: ");
			nome = teclado.next();
			if (nome.length() < 3) {
				System.out.println("Digite um nome de pelo menos 3 caracteres!");
			}
		} while (nome.length() < 3);
		
		// b. Idade: entre 0 e 150;
		do {
			System.out.print("Digite sua Idade: ");
			idade = teclado.nextInt();
			
			if (idade < 0 || idade > 150) {
				System.out.println("Digite uma idade entre 0 e 150!");
			}
		} while (idade < 0 || idade > 150);
		
		// c. Salário: maior que zero;
		do {
			System.out.print("Digite seu Salário (vígula para centavos): ");
			salario = teclado.nextFloat();
			if (salario <= 0) {
				System.out.println("Digite um salário maior do que 0!");
			}
		} while (salario <= 0);
		
		// d. Sexo: 'f', 'm' ou 'nb';
		int sexoInvalido;
		do {
			System.out.print("Digite seu sexo (f/m/nb): ");
			sexo = teclado.next().toLowerCase();
			
			if ( sexo.equals("m") || sexo.equals("f") || sexo.equals("nb") ) {
				sexoInvalido = 0;				
			} else {
				System.out.println("Digite F para feminino, M para masculino e NB para não binário!");
				sexoInvalido = 1;
			}
		} while (sexoInvalido == 1);
		
		// e. Estado Civil: 's', 'c', 'v', 'd';
		int estadoCivilInvalido;
		do {
			System.out.println("Digite seu Estado Civil (s/c/d/v): ");
			estadoCivil = teclado.next().charAt(0);
			
			if ( estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'd' || estadoCivil == 'v') {
				estadoCivilInvalido = 0;
			} else {
				System.out.println("Digite S para solteiro, C para casado, D para divorciado ou V para viúvo(a).");
				estadoCivilInvalido = 1;
			}
		} while (estadoCivilInvalido == 1);
		
		teclado.close();
		
		// Mostrar Tudo
		System.out.println("----- DADOS -----");
		System.out.println("Nome: " + nome );
		System.out.println("Idade: " + idade );
		System.out.println("Salário: R$" + salario );
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}

}
