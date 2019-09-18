public class Sacar extends Operacao{
	Conta origem;
	
	Sacar(Conta conta, double valor){
		super(valor);
		this.origem = conta;
	}

	public Conta getOrigem() {
		return origem;
	}

	public void setOrigem(Conta origem) {
		this.origem = origem;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Conta))
			return false;
		Conta other = (Conta) obj;
		if (this.origem == null) {
			if (other != null)
				return false;
		} else if (!this.origem.equals(other))
			return false;
		return true;
	}
}
