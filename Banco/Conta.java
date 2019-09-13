import java.util.*;
public class Conta {
	int numero;
	double saldo;
	List <Operacao> listaOp;
	Cliente cliente;
	
	Conta(int numero, double saldo, List<Operacao> listaOp, Cliente cliente){
		this.numero = numero;
		this.saldo = saldo;
		this.listaOp = listaOp;
		this.cliente = cliente;
	}
	
	Conta(int numero, double saldo, Cliente cliente){
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
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
	List<Operacao> getListaOp() {
		return listaOp;
	}
	void setListaOp(List<Operacao> listaOp) {
		this.listaOp = listaOp;
	}
	Cliente getCliente() {
		return cliente;
	}
	void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString(){
		return this.numero + " " + this.saldo + " " + this.cliente.toString() + " " + this.listaOp.toString();
	}
	
	String imprimirExtrato(){
		return this.listaOp.toString();
	}
	
	String imprimirExtrato(int n){
		String aux, prin = null;
		for(int i = this.listaOp.size()-1;i>=0;i--){
			aux = this.listaOp.get(i).toString();
			prin = prin.concat(aux);
			if(i == this.listaOp.size()-n-1)	break;
		}
		return prin;
	}
	
	boolean sacar(Operacao operacao){
		if(operacao.getTipoOperacao() == "sacar"){
			if(operacao.getValor() <= this.saldo && operacao.getValor() > 0){
				this.saldo -= operacao.getValor();
				return true;
			}
		}
		return false;
	}
	boolean depositar(Operacao operacao){
		if(operacao.getTipoOperacao() == "depositar"){
			if(operacao.getValor() > 0){
				this.saldo += operacao.getValor();
				return true;
			}
		}
		return false;
	}
}







public class ContaEspecial extends Conta {
	
	float limite;
	
	ContaEspecial(float limite, int numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	boolean sacar(Operacao operacao){
		if(operacao.getTipoOperacao() == "sacar"){
			if(operacao.getValor() <= this.getSaldo()){
				this.saldo -= operacao.getValor();
				return true;
			}else if(operacao.getValor() <= this.getSaldo()+this.getLimite() && operacao.getValor() > 0){
				op -= this.saldo;
				this.saldo = 0.0;
				this.limite =
				return true;
			}
		}
		return false;
	}

}
