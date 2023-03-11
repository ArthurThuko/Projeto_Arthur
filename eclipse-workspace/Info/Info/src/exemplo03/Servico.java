package exemplo03;

public class Servico {
	public static void fibonacci () {
		int a = 1, b = 1;
		
		for (int i = 0; i <= 29; i++) {
			System.out.println(a);
			b = a + b;
			a = b - a;
	    }
	}
}
