public class Depositar extends Operacao{
	
	Conta origem;
	Conta destino;
	
	public Depositar(Conta origem, Conta destino, double valor) {
		super(valor);
		this.origem = origem;
		this.destino = destino;
	}
	public Conta getOrigem() {
		return origem;
	}
	public void setOrigem(Conta origem) {
		this.origem = origem;
	}
	public Conta getDestino() {
		return this.destino;
	}
	public void setDestino(Conta destino) {
		this.destino = destino;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Depositar))
			return false;
		Depositar other = (Depositar) obj;
		if (this.destino == null) {
			if (other.destino != null)
				return false;
		} else if (!this.destino.equals(other.destino))
			return false;
		if (this.origem == null) {
			if (other.origem != null)
				return false;
		} else if (!this.origem.equals(other.origem))
			return false;
		return true;
	}
	
}
