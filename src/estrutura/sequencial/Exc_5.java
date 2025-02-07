/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

package estrutura.sequencial;

import java.util.Scanner;

public class Exc_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int codigo1, codigo2;
		int numPecas1, numPecas2;
		float valorUniPeca1, valorUniPeca2;
		float valorTotal1;
		float valorTotal2;
		float valorTotal12;
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Programa que calcula o valor total a ser pago por duas peças.");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Entre com o código da peça 1: ");
		codigo1 = scanner.nextInt();
		
		System.out.println("Entre com o número de peças 1: ");
		numPecas1 = scanner.nextInt();
		
		System.out.println("Entre com o valor unitário da peça 1: ");
		valorUniPeca1 = scanner.nextFloat();
		
		scanner.nextLine();
		
		System.out.println("Entre com o código da peça 2: ");
		codigo2 = scanner.nextInt();
		
		System.out.println("Entre com o número de peças 2: ");
		numPecas2 = scanner.nextInt();
		
		System.out.println("Entre com o valor unitário da peça 2: ");
		valorUniPeca2 = scanner.nextFloat();
		
		valorTotal1 = numPecas1 * valorUniPeca1;
		valorTotal2 = numPecas2 * valorUniPeca2;
		valorTotal12 = valorTotal1 + valorTotal2;
		
		System.out.printf("O valor total a ser pago é de: %.2f", valorTotal12);
		
		scanner.close();
	}

}