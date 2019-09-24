
public class ContaPoupanca extends Banco implements Imprimivel{

	double limite;
	
	ContaPoupanca(int numero, double saldo, double limite){
		super(numero, saldo);
		this.limite = limite;
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
					this.limite -= this.getSaldo();
					this.setSaldo((aux + this.getSaldo()));
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
	public String mostrarDados() {
		return this.getNumero() + " " + this.getSaldo() + " " +this.limite;
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
}
