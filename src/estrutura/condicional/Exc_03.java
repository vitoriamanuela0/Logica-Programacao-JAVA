/*
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente
 */
package estrutura.condicional;

import java.util.Scanner;

public class Exc_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A;
		int B;
	    
	    System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Programa que lê dois números e verifica se são múltiplos um do outro.");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		
		System.out.print("Entre com o valor do primeiro número/A: ");
		A = scanner.nextInt();
		
		System.out.println("Entre com o valor do segundo número/B: ");
		B = scanner.nextInt();
		
		if (A % B == 0 && B % A == 0) {
			System.out.println("Ambos os números são múltiplos um do outro.");
			
		} else if (A % B == 0 && B % A != 0) {
			System.out.printf("Apenas o número %d é múltiplo de %d", A, B);
			
		} else if (A % B != 0 && B % A == 0) {
			System.out.printf("Apenas o número %d é múltiplo de %d", B, A);
		} else {
			System.out.println("Nenhum dos dois números fornecidos são múltiplos um do outro.");
		}
		 
		scanner.close();

	}

}
