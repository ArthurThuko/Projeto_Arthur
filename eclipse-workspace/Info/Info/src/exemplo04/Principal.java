package exemplo04;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int up = 0, down = 0;
		float notas[] = new float[10], media, soma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite a nota do aluno: ");
			notas[i] = scan.nextFloat();
		}
		
		soma = Servico.soma(notas);
		media = Servico.media(soma);
		up = Servico.up(notas, media);
		down = Servico.down(notas, media);
		
		System.out.println("Média dos alunos: "+media);
		System.out.println("Quantidade de notas acima da média: "+up);
		System.out.println("Quantidade de notas abaixo da média: "+down);
		
		scan.close();
	}
}
