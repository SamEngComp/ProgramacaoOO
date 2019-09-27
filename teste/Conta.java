
public abstract class Conta {
	
	int numero;
	double saldo;
	
	public abstract boolean sacar(double valor);
	public abstract boolean depositar(double valor);
	public abstract boolean transferir(double valor, Conta conta);
	
	Conta(int numero, double saldo){
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
	
	
	@Override
	public String toString() {
		return this.numero + " " + this.saldo;
	}
	
}
