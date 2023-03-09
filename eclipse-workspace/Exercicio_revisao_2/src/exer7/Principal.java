package exer7;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Servico s = new Servico();
		
		int horas;
		
		System.out.print("Digite quantas horas você trabalhou: ");
		horas = scan.nextInt();
		
		System.out.println("Seu salário: "+s.calcularSalario(horas));
		System.out.println("Obs: "+s.verificarSalario(s.calcularSalario(horas)));
		scan.close();
	}
}
