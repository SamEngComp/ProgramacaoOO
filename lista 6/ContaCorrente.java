
public class ContaCorrente extends Banco implements Imprimivel{

	double taxaDeOperacao;
	
	ContaCorrente(int numero, double saldo, double taxaDeOperacao) {
		super(numero, saldo);
		this.taxaDeOperacao = taxaDeOperacao;
	}

	double getTaxaDeOperacao() {
		return taxaDeOperacao;
	}

	void setTaxaDeOperacao(double taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}
	
	@Override
	public boolean sacar(double valor) {
		if(equals(this)) {
			if(valor + (valor*this.taxaDeOperacao) <= this.getSaldo()) {
				double aux = this.getSaldo() - (valor + (valor*this.taxaDeOperacao));
				this.setSaldo(aux);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean depositar(double valor) {
		if(equals(this)) {
			if(valor > 0) {
				double aux = this.getSaldo() + valor - (valor*this.taxaDeOperacao);
			}
		}
		return false;
	}
	
	@Override
	public String mostrarDados() {
		return this.getNumero() + " " + this.getSaldo() + " " + this.taxaDeOperacao;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		ContaCorrente outro = (ContaCorrente) o;
		if (outro.getTaxaDeOperacao() != this.taxaDeOperacao)
			return false;
		return true;
	}

}
