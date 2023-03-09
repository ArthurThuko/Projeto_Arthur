package media_notas;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, nota3;
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = scan.nextInt();
		
		System.out.println("Digite sua segunda nota: ");
		nota2 = scan.nextInt();
		
		System.out.println("Digite sua terceira nota: ");
		nota3 = scan.nextInt();
		
		System.out.println("Sua média é: "+Servico.media(nota1, nota2, nota3));
		System.out.println("Aluno "+Servico.situacao(Servico.media(nota1, nota2, nota3)));
		
		scan.close();	
		}
}
