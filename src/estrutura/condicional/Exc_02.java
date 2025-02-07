/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

package estrutura.condicional;

import java.util.Scanner;

public class Exc_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    
	    int numero;
	    
	    System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Programa que lê um número inteiro e dizer se este número é par ou ímpar.");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
	    
	    System.out.print("Entre com o número: ");
	    numero = scanner.nextInt();
	    
	    scanner.close();
	    
	    if (numero % 2 == 0) {
	    	System.out.printf("O número %d é par.", numero);
	    	
	    } else {
	    	System.out.printf("O número %d é ímpar.", numero);
	    }
	    
	}

}
