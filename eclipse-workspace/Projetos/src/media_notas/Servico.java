package media_notas;

public class Servico {
	public static double media(double nota1, double nota2, double nota3){
		double media;
		
		media = (nota1+nota2+nota3)/3;
		
		return (media);
	}
	
	public static String situacao(double media){
		if (media >= 7) {
			return("Aprovado!");
		} else if (media < 5) {
			return("Reprovado!");
		} else {
			return("Em recuperação!");
		}
	}
}
