/*
 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */

package estrutura.condicional;

import java.util.Scanner;

public class Exc_05 {

	    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
	    
	    
	    float valor;
	    
	        
	    System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Programa que lê um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos.");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		
		
	    System.out.print("Entre com o valor: ");
	    valor = scanner.nextFloat();
	    
	    scanner.close();
	    
	
	    if (valor >= 0 && valor <= 25) {
	        System.out.print("Intervalo [0,25].");
	    } else if (valor >= 26 && valor <= 50) {
	        System.out.print("Intervalo entre [26,50].");
	    } else if (valor >= 51 && valor <= 75) {
	        System.out.print("Intervalo entre [51,75].");
	    } else if (valor >= 76 && valor <= 100) {
	        System.out.print("Intervalo entre [76,100].");
	    } else {
	        System.out.print("Fora de intervalo.");
	    }
	    
	        
	    }
	}