/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos.
 */

package estrutura.sequencial;

import java.util.Scanner;

public class Exc_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valor1, valor2, soma;
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Programa que lê o dois valores inteiros, e depois mostrar na tela a soma desses números.");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Entre com o primeiro valor: ");
		valor1 = scanner.nextInt();
		
		System.out.println("Entre com o segundo valor: ");
		valor2 = scanner.nextInt();
		
		scanner.close();
		
		soma = valor1 + valor2;
		
		System.out.printf("A soma dos números %d e %d é: %d", valor1, valor2, soma);	
	}
}
