
public class ContaPoupanca extends Conta implements Imprimivel{

	double limite;
	
	ContaPoupanca(String nome, int numero, double saldo, double limite, Banco banco){
		super(nome, numero, saldo);
		this.limite = limite;
		banco.adicionarConta(this);
	}
	
	double getLimite() {
		return limite;
	}

	void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(double valor) {
		if(equals(this)) {
			if(valor <= this.getSaldo() + this.limite && valor>0) {
				double aux = this.getSaldo() - valor;
				if(aux < 0) {
					this.limite += aux; 
				}
				this.setSaldo(aux);
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public boolean depositar(double valor) {
		double aux;
		if(equals(this) && valor > 0) {
			if(this.getSaldo() < 0) {
				aux = this.getSaldo() + valor;
				if(aux > 0) {
					System.out.println(aux);
					this.limite -= this.getSaldo();
					this.setSaldo(aux);
				}else {
					this.limite += valor;
					this.setSaldo(aux);
				}
				return true;
			}else {
				aux = this.getSaldo() + valor;
				this.setSaldo(aux);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean transferir(double valor, Conta conta) {
		if(conta != null) {
			if(valor <= this.getSaldo() + this.limite) {
				this.sacar(valor);
				conta.depositar(valor);
			}
		}
		return false;
	}
	
	@Override
	public String mostrarDados() {
		return this.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null)
			return false;
		if(o.getClass() != this.getClass())
			return false;
		ContaPoupanca outro = (ContaPoupanca) o;
		if(outro.getLimite() != this.limite)
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return this.getNumero() + " " + this.getSaldo() + " " + this.limite;
	}
}
