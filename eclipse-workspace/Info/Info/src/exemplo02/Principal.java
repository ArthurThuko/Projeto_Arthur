package exemplo02;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		
		System.out.println("Situação: "+Servico.votacao(idade));
		
		scan.close();
	}
}
