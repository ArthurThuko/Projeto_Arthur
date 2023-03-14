package exe_conta;

public class Conta {
	private String nome_titular;
	private int numero;
	private double saldo;
	
	public Conta() {

	}

	public Conta(String nome_titular, int numero, double saldo) {
		this.nome_titular = nome_titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNome_titular() {
		return nome_titular;
	}

	public void setNome_titular(String nome_titular) {
		this.nome_titular = nome_titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

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
