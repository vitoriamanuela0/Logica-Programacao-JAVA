/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */

package estrutura.sequencial;

import java.util.Scanner;

public class Exc_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double raio;
		double area;
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Programa que lê o valor do raio de um círculo, e depois mostrar o valor da área deste.");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Entre com o valor do raio: ");
		raio = scanner.nextDouble();
		
		area = Math.PI * (Math.pow(raio, 2));
		
		System.out.printf("O valor da área do círculo cujo o raio é %f é de: %.4f", raio, area);
		
		scanner.close();
	}

}