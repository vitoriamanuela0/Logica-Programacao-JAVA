/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
 */

package estrutura.sequencial;

import java.util.Scanner;

public class Exc_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A, B, C, D, produtoAB, produtoCD, diferencaProdutos;
		
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Programa que lê quatro valores inteiros A, B, C e D. A seguir, calcula e mostra a diferença do produto \n"
				+ "de A e B pelo produto de C e D.");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Entre com o valor de A: ");
		A = scanner.nextInt();
		System.out.println("Entre com o valor de B: ");
		B = scanner.nextInt();
		System.out.println("Entre com o valor de C: ");
		C = scanner.nextInt();
		System.out.println("Entre com o valor de D: ");
		D = scanner.nextInt();
		
		produtoAB = A * B;
		produtoCD = C * D;
		diferencaProdutos = produtoAB - produtoCD;
		
		System.out.printf("O produto dos valores A = %d e B = %d é: %d /n", A, B, produtoAB);
		System.out.printf("O produto dos valores C = %d e D = %d é: %d /n", C, D, produtoCD);
		System.out.printf("A diferença de produtos de A e B %d pelo produto de C e D %d, é de: %d", produtoAB, produtoCD, diferencaProdutos);
		
		
		scanner.close();

	}

}