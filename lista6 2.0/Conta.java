
public abstract class Conta {
	
	int numero;
	double saldo;
	String nome;
	
	public abstract boolean sacar(double valor);
	public abstract boolean depositar(double valor);
	public abstract boolean transferir(double valor, Conta conta);
	
	Conta(String nome, int numero, double saldo){
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	int getNumero() {
		return numero;
	}
	void setNumero(int numero) {
		this.numero = numero;
	}
	double getSaldo() {
		return saldo;
	}
	void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.numero + " " + this.saldo;
	}
	
}
