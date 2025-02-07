/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.
 */
package estrutura.sequencial;

import java.util.Scanner;

public class Exc_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numFuncionario;
		int horasTrabalhadas;
		float valorHora;
		float salario;
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por \n"
				+ "hora e calcula o salário desse funcionário.");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Entre com o numero do funcionário: ");
		numFuncionario = scanner.nextInt();
		
		System.out.println("Entre com as horas trabalhadas: ");
		horasTrabalhadas = scanner.nextInt();
		
		System.out.println("Entre com o valor da hora trabalhada: ");
		valorHora = scanner.nextFloat();
		
		scanner.close();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.printf("O saláio do funcionário de número %d é U$ %.2f.", numFuncionario, salario);
	}

}
