package exe_conta;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Scanner scan = new Scanner(System.in);
		
		
		int a = 0, b;
		double valor;
		boolean verificacao;
		
		do {
			System.out.println("Digite 1 para CRIAR NOVA CONTA\nDigite 2 para CONSULTAR SALDO\nDigite 3 para SACAR\nDigite 4 para DEPOSITAR\nDigite outro número para encerrar...");
			a = scan.nextInt();
			
			switch (a) {
			case 1: {
				Conta c = new Conta();
				
				System.out.print("Digite seu nome: ");
				c.nome_titular = scan.next();
				
				System.out.print("Digite seu saldo: ");
				c.saldo = scan.nextDouble();
				
				lista.add(c);
				
				c.numero = lista.indexOf(c);
				
				System.out.println("Seu número da conta: "+c.numero);
				break;
			}
			case 2: {
				System.out.println("Digite o número de sua conta: ");
				b = scan.nextInt();
				
				lista.get(b);
				
				System.out.println("Seu saldo: ");
			}
			
			}
			
			
			/*
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
		
			
			
			
				
				*/
			
		} while (a == 1 || a == 2 || a == 3 || a == 4);
		
		
		
		//scan.close();
		
	}
}
