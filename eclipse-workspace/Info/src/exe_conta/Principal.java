package exe_conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		List<Conta> lista = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int a = 0, b = 1, numConta;
		double valor;
		boolean verificacao;
		Conta auxiliar;
		
		do {
			System.out.print("Digite 1 para CRIAR NOVA CONTA\n"
					+ "Digite 2 para CONSULTAR SALDO\n"
					+ "Digite 3 para SACAR\n"
					+ "Digite 4 para DEPOSITAR\n"
					+ "Digite outro número para encerrar...\n"
					+ "-> ");
			a = scan.nextInt();
			
			switch (a) {
			case 1: {
				System.out.print("---------------------------------\n");

				Conta c = new Conta();
				
				System.out.print("Digite seu nome: ");
				c.setNome_titular(scan.next());
				
				c.setNumero(b);
				
				lista.add(c);
				
				b++;
				
				System.out.println("Seu número da conta: "+c.getNumero());
				System.out.print("---------------------------------\n");
				break;
			}
			case 2: {
				System.out.print("---------------------------------\n");
				System.out.print("Digite o número da conta: ");
	            numConta = scan.nextInt();
	            numConta--;

	            auxiliar = lista.get(numConta);
	            System.out.println("Nome do titular: " + auxiliar.getNome_titular());
	            System.out.println("Saldo da conta: " +auxiliar.getSaldo());
	            System.out.print("---------------------------------\n");
	            break;
			}
			case 3: {
				System.out.print("---------------------------------\n");
				System.out.print("Digite o número da conta: ");
	            numConta = scan.nextInt();
	            numConta--;
	            
	            auxiliar = lista.get(numConta);
				
				System.out.print("Digite o valor do saque: ");
				valor = scan.nextDouble();
				verificacao = auxiliar.sacar(valor);
				if (verificacao) {
					System.out.println("Saque realizado");
				} else {
					System.out.println("Saldo insuficiente");
				}
				System.out.print("---------------------------------\n");
				break;
			}
			case 4:{
				System.out.print("---------------------------------\n");
				System.out.print("Digite o número da conta: ");
	            numConta = scan.nextInt();
	            numConta--;
	            
	            auxiliar = lista.get(numConta);
				
				System.out.print("Digite o valor do depósito: ");
				valor = scan.nextDouble();
				auxiliar.depositar(valor);
				System.out.println("Saldo atual: "+auxiliar.getSaldo());
				System.out.print("---------------------------------\n");
				break;
			}
			default: {
				System.out.print("---------------------------------\n");
				System.out.println("Fim do Programa");
				System.out.print("---------------------------------\n");
				break;
			}
			}
		} while (a == 1 || a == 2 || a == 3 || a == 4);
		
		scan.close();
	}
}
