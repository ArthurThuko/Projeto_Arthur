package exemplo05;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int a;
		double media, soma = 0, quant = 0;
		
		System.out.println("Para finalizar o programa digite um número negativo!!!");
		
		do {
			System.out.println("Digite um número inteiro maior ou igual a 0: ");
			a = scan.nextInt();
			soma = soma + a;
			quant++;
		} while (a > 0);
		
		media = soma/quant;
		
		System.out.println("Quantidade de números: "+quant);
		System.out.println("A média dos números: "+ media);
		
		scan.close();
	}
}
