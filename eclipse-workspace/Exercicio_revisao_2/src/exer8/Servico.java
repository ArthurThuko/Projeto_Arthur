package exer8;

public class Servico {
	public String calcularRenda (double custo, double venda) {
		String renda;
		
		if (venda >= custo*1.5) {
			renda = "Lucro";
		} else {
			renda = "Prejuízo";
		}
		
		return renda;
	}
	
	public double calcularRendaDiferenca (double custo, double venda) {
		double diferenca;
		
		diferenca = venda - custo;
		
		return diferenca;
	}
}
