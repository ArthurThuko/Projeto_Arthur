package loja_tabajara;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valor;
				
		System.out.println("Digite o valor total do produto: ");
		valor = scan.nextInt();
		
		System.out.println("Sua prestação em 5x: R$ "+Servico.prestação(valor));
		scan.close();	
		}
}
