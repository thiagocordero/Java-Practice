// Tendo as variáveis salario, ir e salliq, e considerando os valores abaixo, informe se
// as expressões são verdadeiras ou falsas:
	
public class JavaCondicionalEx1 {

	public static void main(String[] args) {
		
		double salarioBruto, ir, salarioLiquido;
		boolean expressao1, expressao2, expressao3;
		
		// Expressão 1
		salarioBruto = 100;
		ir = 0;
		salarioLiquido = salarioBruto - ir;
		
		if (salarioLiquido >= 100) {
			expressao1 = true;
		} else {
			expressao1 = false;
		}
		System.out.println("A expressão 'salárioLiquido >= 100' é: " + expressao1);
		
		// Expressão 2
		salarioBruto = 200;
		ir = 10;
		salarioLiquido = salarioBruto - ir;
				
		if (salarioLiquido < 190) {
			expressao2 = true;
		} else {
			expressao2 = false;
		}
		System.out.println("A expressão 'salárioLiquido < 190' é: " + expressao2);
		// Expressão 3
		salarioBruto = 300;
		ir = 15;
		salarioLiquido = salarioBruto - (salarioBruto * ir / 100);
						
		if (salarioLiquido == salarioBruto + ir) {
			expressao3 = true;
		} else {
			expressao3 = false;
		}
		System.out.println("A expressão 'salárioLiquido = salarioBrto + ir' é: " + expressao3 );
			

	}

}
