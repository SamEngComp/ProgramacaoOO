
public abstract class Conta{
	int numero;
	double saldo;
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void sacar(double valor) throws NullPointerException;
	public abstract void depositar(double valor) throws NullPointerException;
	public abstract void transferir(double valor, Conta conta) throws NullPointerException;
	
}
