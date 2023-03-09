package idade;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite o seu ano de nascimento: ");
		ano = scan.nextInt();
		
		System.out.println("Sua idade é: "+Servico.idade(ano)+" anos");
		scan.close();	
		}
}
