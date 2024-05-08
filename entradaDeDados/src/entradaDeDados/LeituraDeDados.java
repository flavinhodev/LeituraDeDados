package entradaDeDados;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine(); //proxima linha digitada
		System.out.println("Olá, " + nome + "! Bem-vindo(a)!");
		
		/*
		System.out.println("Entre com um número: ");
		int numero = scan.nextInt(); //proximo inteiro digitado
		System.out.println("Entre com seu salário");
		double salario = scan.nextDouble(); //proximo double digitado
		
		
		
		System.out.println("Você ganhou " + numero + 
				" vezes seu salário: ");
		System.out.println("R$ " + numero * salario);
		
		*/
	}
	}
