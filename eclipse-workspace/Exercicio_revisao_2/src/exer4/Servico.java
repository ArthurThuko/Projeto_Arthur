package exer4;

public class Servico {
	public int somarImpar () {
		int soma = 0;
		
		for (int x = 1; x <= 29; x++) {
			if (x%2 != 0) {
				soma = soma + x;
			}
		}
		return soma;
	}
	
	public long multiplicarPar () {
		long mult = 1;
		
		for (int x = 1; x <= 29; x++) {
			if (x%2 == 0) {
				mult = mult * x;
			}
		}
		return mult;
	}
}
