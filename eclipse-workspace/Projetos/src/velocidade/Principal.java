package velocidade;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double distancia, tempo;
		
		System.out.println("UTILIZAR SISTEMA INTERNACIONAL (m/s ou Km/h)!!!");
		
		System.out.println("Digite a distancia: ");
		distancia = scan.nextInt();
		
		System.out.println("Digite o tempo: ");
		tempo = scan.nextInt();
		
		System.out.println("Velocidade do veículo: "+Servico.velocidade(distancia, tempo));
		scan.close();	
		}
}
