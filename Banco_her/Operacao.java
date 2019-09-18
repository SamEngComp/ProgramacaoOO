
public class Operacao {
	double valor;
	
	Operacao(double valor){
		this.valor = valor;
	}
	
	
	@Override
	public String toString(){
		return this.valor + " ";
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
}
