/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.
 */
package estrutura.sequencial;

import java.util.Scanner;

public class Exc_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float A, B, C;
		float areaTriangulo;
		double areaCirculo;
		float areaTrapezio;
		float areaQuadrado;
		float areaRetangulo;
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Programa que calcula o valor total a ser pago por duas peças.");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		
		System.out.print("Entre com o valor de A: ");
		A = scanner.nextFloat();
		
		System.out.print("Entre com o valor de B: ");
		B = scanner.nextFloat();
		
		System.out.println("Entre com o valor de C: ");
		C = scanner.nextFloat();
		
		areaTriangulo = (A * C) / 2;
		
		areaCirculo = Math.PI * Math.pow(C, 2);
		
		areaTrapezio = ((A + B) * C) / 2;
		
		areaQuadrado = B * B;
		
		areaRetangulo = A * B;
		
		
		 	System.out.printf("TRIÂNGULO: %.2f\n", areaTriangulo);
	        System.out.printf("CÍRCULO: %.2f\n", areaCirculo);
	        System.out.printf("TRAPÉZIO: %.2f\n", areaTrapezio);
	        System.out.printf("QUADRADO: %.2f\n", areaQuadrado);
	        System.out.printf("RETÂNGULO: %.2f\n", areaRetangulo);
		
		scanner.close();

	}

}