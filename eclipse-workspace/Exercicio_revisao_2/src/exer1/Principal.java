package exer1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Servico s = new Servico();
		
		int num;
		
		System.out.print("Digite um número: ");
		num = scan.nextInt();
		
		System.out.println(s.calcularTabuada(num));
		
		scan.close();
	}
}
