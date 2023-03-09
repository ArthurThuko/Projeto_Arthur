package exer5;

public class Servico {
	public String verificarParImpar (int num) {
		String x;
		
		if (num % 2 == 0) {
			x = "Par";
		} else {
			x = "Ímpar";
		}
		
		return x;
	}
	
	public String verificarPrimo (int num) {
		boolean teste = false;
		
		for (int p = 2; p < num; p++) {
			if (num % p == 0) {
				teste = true;
			} 
		}
		
		if (teste || num == 1) {
			return "Não é primo";
		} else {
			return "É primo";
		}
	}
}
