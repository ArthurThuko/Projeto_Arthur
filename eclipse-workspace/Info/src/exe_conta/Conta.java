package exe_conta;

public class Conta {
	String nome_titular;
	int numero;
	double saldo;
	
	boolean sacar (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	void depositar (double valor) {
		this.saldo += valor;
	}
}
