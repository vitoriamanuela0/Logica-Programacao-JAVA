/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar.
 */

package estrutura.condicional;

import java.util.Scanner;

public class Exc_04 {
    
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    
    int codigo;
    int quantidade;
    double total = 0;
        

    
    System.out.println("");
	System.out.println("--------------------------------------------------------------------------------------");
	System.out.println("");
	System.out.println("Programa que lê o código de um item e a quantidade deste item.");
	System.out.println("");
	System.out.println("--------------------------------------------------------------------------------------");
	System.out.println("");
	
    System.out.print("Entre com o código do produto: ");
    codigo = scanner.nextInt();
        
        System.out.print("Entre com a quantidade do produto: ");
    quantidade = scanner.nextInt();
    
    scanner.close();
    
    switch (codigo) {
        case 1:
        total = 4.00 * quantidade;
        break;
        
        case 2:
        total = 4.50 * quantidade;
        break;
        
        case 3: 
        total = 5.00 * quantidade;
        break;
        
        case 4:
        total = 2.00 * quantidade;
        break;
        
        case 5:
        total = 1.50 * quantidade;
        break;
        
        default:
        System.out.print("Digite um código válido.");
    }
        System.out.printf("O total da compra é R$ %.2f", total);
    }
}