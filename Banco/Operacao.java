
public class Operacao {
	String tipoOperacao;
	double valor;
	
	Operacao(String tipoOperacao, double valor){
		this.tipoOperacao = tipoOperacao;
		this.valor = valor;
	}
	
	String getTipoOperacao() {
		return tipoOperacao;
	}
	void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	double getValor() {
		return valor;
	}
	void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString(){
		return this.tipoOperacao + " " + this.valor;
	}
	
}
