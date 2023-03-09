package exer2;

public class Servico {
	public double calcularOperacoes (char sinal, double x, double y) {
		double resultado = 0;
		
		switch (sinal) {
		case '/': {
			resultado = x/y;
			break;
		}
		case '*': {
			resultado = x*y;
			break;
		}
		case '+': {
			resultado = x+y;
			break;
		}
		case '-': {
			resultado = x-y;
			break;
		}
		default:
		}
		
		return resultado;
	}
}
