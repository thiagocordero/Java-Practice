/* Faça um programa de resultado de exames em que o usuário digitará Nome,
idade, sexo e quantidade de hemoglobina em g/gL. O programa deverá, com base
na tabela abaixo, informar se o resultado está normal ou se há alguma alteração.
Crianças de 2 a 6 anos 11,5 a 13,5 g/dL
Crianças de 6 a 12 anos 11,5 a 15,5 g/dL
Homens 14 a 18 g/dL
Mulheres 12 a 16 g/dL
Grávidas 11 g/dL
*/

import java.util.Scanner;

public class JavaCondicionalEx7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		///Declaração
		String nome, sexo, gravida = null;
		int idade;
		double hemoglobina;
		
		///Leitura
		System.out.println("Nome: ");
		nome = teclado.nextLine();
		System.out.println("Olá, " + nome + "! Digite sua idade: ");
		idade = teclado.nextInt();
		System.out.print("Sexo(Masculino / Feminino): ");
		sexo = teclado.next().toUpperCase();
		
		if (sexo.equals("FEMININO")) {
			System.out.print("Grávida? (Sim / Não): ");
			gravida = teclado.next().toUpperCase();
		}
		
		System.out.print("Quantidade de Hemoglobina (g/dL): ");
		hemoglobina = teclado.nextDouble();
		
		teclado.close();
		
		/// Processamento
		
		if(idade < 2) {
			System.out.println("Você é muito jovem para fazer o exame!");
		}
		
		if(idade >= 2 && idade <= 6) {
			if (hemoglobina >= 11.5 && hemoglobina <= 13.5) {
			System.out.println("EXAME NORMAL");
			} else {
				System.out.println("EXAME COM ALTERAÇÃO. CONSULTE UM MÉDICO");
			}
		}
			
		if(idade > 6 && idade < 12) {
			if (hemoglobina >= 11.5 && hemoglobina <= 15.5) {
			System.out.println("EXAME NORMAL");
			} else {
				System.out.println("EXAME COM ALTERAÇÃO. CONSULTE UM MÉDICO");
			}
		}
		
		if(idade > 12) {
			if(sexo.equals("MASCULINO")) {
				if (hemoglobina >= 14 && hemoglobina <= 18) {
					System.out.println("EXAME NORMAL");
				} else {
					System.out.println("EXAME COM ALTERAÇÃO. CONSULTE UM MÉDICO");
				}	
			}
			
			if(sexo.equals("FEMININO")) { 
				if (gravida.equals("SIM")) { 
					if (hemoglobina >= 11) {
						System.out.println("EXAME NORMAL");
					} else {
					System.out.println("EXAME COM ALTERAÇÃO. CONSULTE UM MÉDICO");
					}
				} else if (gravida.equals("NÃO")) {
					if (hemoglobina >= 12 && hemoglobina <= 16) {
						System.out.println("EXAME NORMAL");
					} else {
						System.out.println("EXAME COM ALTERAÇÃO. CONSULTE UM MÉDICO");
					}	
										
				} else {
					System.out.println("Digite um válido!");
				}
			}
				
		}
			
	}
}