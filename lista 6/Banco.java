
public abstract class Banco {
	
	int numero;
	double saldo;
	
	public abstract boolean sacar(double valor);
	public abstract boolean depositar(double valor);
	
	Banco(int numero, double saldo){
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
	
}
