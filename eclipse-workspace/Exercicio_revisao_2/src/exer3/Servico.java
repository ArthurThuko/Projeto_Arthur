package exer3;

public class Servico {
	public String calcularFibonacci () {
		int a = 0, b = 1;
		String fibo = a + " - ";
		
		for (; a <= 100;) {
			b = a + b;
			a = b - a;
			fibo += a + " - ";
	    }
		
		return fibo;
	}
}
