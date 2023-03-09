package exer4;

public class Principal {
	public static void main(String[] args) {
		Servico s = new Servico();
		
		System.out.println("Soma dos números pares entre 0 e 30: " + s.somarImpar());
		System.out.println("Multiplicação dos números ímpares entre 0 e 30: " + s.multiplicarPar());
	}
}