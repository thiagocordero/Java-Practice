/* 2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as
informações. */

import java.util.Scanner;

public class JavaLoopingEx002 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String usuario, senha;
		int senhaInvalida;
		
		System.out.println("Crie seu usuario: ");
		usuario = teclado.next();
		
		do {
			System.out.println("Crie sua senha: ");
			senha = teclado.next();
			
			if (usuario.equals(senha)) {
				System.out.println("A senha não pode ser igual ao usuario!");
				senhaInvalida = 1;
			} else {
				senhaInvalida = 0;
			}
		} while (senhaInvalida == 1);
		
		System.out.println("Usuario: " + usuario);
		System.out.println("Senha: " + senha);
		teclado.close();		
		

	}

}
