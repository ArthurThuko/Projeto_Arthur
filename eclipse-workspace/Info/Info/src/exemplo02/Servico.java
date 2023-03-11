package exemplo02;

public class Servico {
	public static String votacao (int idade) {
		String situacao = null;
		
		if (idade < 16) {
			situacao = "Não pode votar";
		} else if (idade >= 18 && idade <= 65) {
			situacao = "Votar é obrigatório";
		} else if (idade == 16 || idade == 17 || idade > 65) {
			situacao = "Votar é facultativo";
		}
		
		return situacao;
	}
}
