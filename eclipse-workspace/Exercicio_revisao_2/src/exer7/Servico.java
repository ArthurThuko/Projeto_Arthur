package exer7;

public class Servico {
	public double calcularSalario (int horas) {
		double salario;
		
		salario = 12.25*horas;
		
		return salario;
	}
	
	public String verificarSalario (double salario) {
		String obs;
		
		if (salario < 50) {
			obs = "Atenção, dirija-se à direção do Hotel";
		} else {
			obs = "Nenhuma";
		}
		
		return obs;
	}
}
