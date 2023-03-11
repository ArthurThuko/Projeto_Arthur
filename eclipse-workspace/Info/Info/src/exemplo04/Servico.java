package exemplo04;

public class Servico {
	public static float soma (float notas[]) {
		float soma = 0;
		
		for (int i = 0; i < 10; i++) {
			soma = soma + notas[i];			
		}
		
		return soma;
	}
		
	public static float media (float soma) {
		float media;
		
		media = soma/10;
			
		return media;
	}
	
	public static int up (float notas[], float media) {
		int up = 0;
		
		for (int i = 0; i < 10; i++) {
			if (notas[i] > media) {
				up++;
			}
		}
		
		return up;
	}
	
	public static int down (float notas[], float media) {
		int down = 0;
		
		for (int i = 0; i < 10; i++) {
			if (notas[i] < media) {
				down++;
			}
		}
	
		return down;
	}
}