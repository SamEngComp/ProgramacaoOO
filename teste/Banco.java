import java.util.*;
public class Banco implements Imprimivel {
	
	List<Conta> contas;
	
	Banco(){
		this.contas = new ArrayList<Conta>();
	}
	
	Banco(Conta conta) {
		this.contas = new ArrayList<Conta>();
		this.contas.add(conta);
	}
	
	Banco(List<Conta> contas) {
		this.contas = contas;
	}
	
	List<Conta> getContas() {
		return contas;
	}
	
	void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	boolean adicionarConta(Conta conta) {
		if(conta != null) {
			this.contas.add(conta);
		}
		return false;
	}
	
	Conta Buscar(int numero) {
		int i;
		for(i=0; i<contas.size(); i++) {
			if(contas.get(i).numero == numero) {
				return contas.get(i);
			}
		}
		return null;
	}
	
	boolean remover(Conta conta) {
		if(conta != null) {
			for(int i = 0;i < contas.size(); i++) {
				if(contas.get(i).equals(conta) == true) {
					contas.remove(i);
				}
			}
		}
			
		return false;
	}
	
	@Override
	public String mostrarDados() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		return this.contas.toString();
	}
	
}
