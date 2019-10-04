import java.util.*;

public class Banco implements Imprimivel{
	List<Conta> contas = new ArrayList<Conta>();
	
	Banco(List<Conta> contas) {
		this.contas = contas;
	}
	Banco(Conta conta) {
		this.contas.add(conta);
	}
	Banco() {
		
	}
	
	@Override
	public String mostrarDados() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		int i;
		String aux = "";
		for(i=0;i<this.contas.size();i++) {
			aux = aux + this.contas.get(i).toString();
		}
		return aux;
	}
	
	void adicionarConta(Conta conta) throws NullPointerException{
		if(conta == null)
			throw new NullPointerException();
		else {
			this.contas.add(conta);
		}
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
}
