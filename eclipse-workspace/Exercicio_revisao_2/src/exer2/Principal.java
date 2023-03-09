package exer2;

import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Servico s = new Servico();
		
		char sinal;
		double x, y;
		
		System.out.print("Digite a operação que será realizada: ");
		sinal = scan.next().charAt(0);
		System.out.print("Digite o primeiro número: ");
		x = scan.nextFloat();
		System.out.print("Digite o segundo número: ");
		y = scan.nextFloat();
		
		if (sinal == '+' || sinal == '/' || sinal == '*' || sinal == '-') {
			System.out.println("Seu resultado: "+s.calcularOperacoes(sinal, x, y));
		} else {
			System.out.println("Operação Inválida");
		}
		
		scan.close();
	}
}
