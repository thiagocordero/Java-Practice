/* 2. Sabendo que a = 3, b = 7 e c = 4, informe se as expressões abaixo são verdadeiras
ou falsas:
				a. (a + c) > b
				b. b > = (a + 2)
				c. c == (b – a)
				d. (b + a) < = c
				e. (c + a) > b 
 */

public class JavaCondicionalEx2 {

	public static void main(String[] args) {
		int a = 3, b = 7, c = 4;
		boolean resposta;
		
		// A
		if((a+c) > b) {
			resposta = true;
		} else {
			resposta = false;
		}
		System.out.println("(a + c) > b, a  expressão A, é: " + resposta);
		
		// B
		if(b >= (a+2)) {
			resposta = true;
		} else {
			resposta = false;
		}
		System.out.println("b > = (a + 2), a  expressão B, é: " + resposta);
		
		// C
		if(c == (b-a)) {
			resposta = true;
		} else {
			resposta = false;
		}
		System.out.println("c == (b – a), a  expressão C, é: " + resposta);
		
		// D
		if((b + a) <= c) {
			resposta = true;
		} else {
			resposta = false;
		}
		System.out.println("(b + a) < = c, a  expressão D, é: " + resposta);

		// E
		if((c+a) > b) {
			resposta = true;
		} else {
			resposta = false;
		}
		System.out.println("(c + a) > b, a  expressão E, é: " + resposta);

	}

}
