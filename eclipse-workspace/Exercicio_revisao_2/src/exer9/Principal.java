package exer9;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Servico s = new Servico();
		
		int num;
		
		System.out.print("Digite um número correspondente a um mês: ");
		num = scan.nextInt();
		
		System.out.print("Mês selecionado: "+s.relacionarMes(num));
		scan.close();
	}
}
