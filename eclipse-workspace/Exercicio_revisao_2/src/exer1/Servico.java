package exer1;

public class Servico {
	public String calcularTabuada (int num) {
		int i = 0, mult;
		String resultado = "";
		
		while (i <= 10) {
			mult = num * i;
			resultado += num+" * "+i+" = "+mult+'\n';
			i++;
		}
		
		return resultado;
	}
}
