/* 3. Sabendo que a = 5, b = 4, c = 3 e d = 6, informe se as expressões abaixo são
verdadeiras ou falsas:
a. (a > c) AND (c <= d)
b. (a + b) > 10 OR (a + b) == (c + +d)
c. (a >= c) AND (d >= c)
*/

public class JavaCondicionalEx3 {

	public static void main(String[] args) {
		
		int a = 5, b = 4, c = 3, d = 6;
		boolean resposta;
		
		// A
		resposta = (a > c && c <= d ? true : false);
		System.out.println("A expressão A é: " + resposta);
		
		// B
		resposta = ((a + b) > 10 || (a + b) == (c + +d) ? true : false);
		System.out.println("A expressão B é: " + resposta);
		
		// C
		resposta = (a >= c && d >= c ? true : false);
		System.out.println("A expressão c é: " + resposta);
		
		
		}

	}
