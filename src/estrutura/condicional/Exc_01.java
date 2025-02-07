/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */

package estrutura.condicional;

import java.util.Scanner;

public class Exc_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    
	    int numero;
	    
	    System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Programa que lê um número inteiro, e depois dizer se este número é negativo ou não.");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
	    
	    System.out.print("Entre com o número: ");
	    numero = scanner.nextInt();
	    
	    scanner.close();
	    
	    if (numero < 0 ) {
	        System.out.print("Este número é negativo.");
	    } else {
	        System.out.print("Este número não é negativo.");
	    }
	}

}
