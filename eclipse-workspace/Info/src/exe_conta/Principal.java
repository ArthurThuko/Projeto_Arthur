package exe_conta;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Conta c = new Conta();
		
		int a = 0;
		double valor;
		boolean verificacao;
		
		System.out.print("Digite seu nome: ");
		c.nome_titular = scan.next();
		
		System.out.print("Digite seu número: ");
		c.numero = scan.nextInt();
		
		System.out.print("Digite seu saldo: ");
		c.saldo = scan.nextDouble();
		
		do {
			System.out.println("Digite 1 para DEPOSITAR\nDigite 2 para SACAR\nDigite outro número para encerrar.");
			a = scan.nextInt();
			
			if (a == 1) {
				System.out.print("Digite o valor do depósito: ");
				valor = scan.nextDouble();
				c.depositar(valor);
				System.out.println("Saldo atual: "+c.saldo);
			} if (a == 2) {
				System.out.print("Digite o valor do saque: ");
				valor = scan.nextDouble();
				verificacao = c.sacar(valor);
				if (verificacao) {
					System.out.println("Saque realizado");
				} else {
					System.out.println("Saldo insuficiente");
				}
				System.out.println(c.saldo);
			}
		} while (a == 1 || a == 2);
		
		scan.close();
	}
}
