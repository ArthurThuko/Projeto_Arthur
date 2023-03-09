package exer8;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Servico s = new Servico();
		
		double custo, venda;
		
		System.out.print("Digite o preço de custo do produto: ");
		custo = scan.nextDouble();
		
		System.out.print("Digite o preço de venda do produto: ");
		venda = scan.nextDouble();
		
		System.out.println("Renda: "+s.calcularRenda(custo, venda));
		System.out.println("Valor da renda: "+s.calcularRendaDiferenca(custo, venda));
		scan.close();
	}
}
