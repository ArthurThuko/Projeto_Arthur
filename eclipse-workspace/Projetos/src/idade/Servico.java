package idade;

import java.util.Calendar;

public class Servico {
	public static int idade(int ano){
		Calendar c = Calendar.getInstance();
		
		return (c.get(Calendar.YEAR)-ano);
	}
}

