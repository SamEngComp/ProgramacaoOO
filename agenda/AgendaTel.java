package poo;

import java.util.*;
public class AgendaTel {
	List<Contato> contatos = new ArrayList<Contato>();
	
	
	AgendaTel(){
	}
	AgendaTel(Contato contato){
		this.contatos.add(contato);
	}

	List<Contato> getContatos() {
		return contatos;
	}

	void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	boolean adicionarContato(Contato contato){
		
		if(contato.getNome() != null && !contato.tel.isEmpty()){
			this.contatos.add(contato);
			return true;
		}
		
		return false;
	}
	
	boolean removerContato(Contato contato){
		if(contato.getNome() != null && !contato.tel.isEmpty()) {
			Contato aux = buscarContato(contato);
			if(aux != null) {
				this.contatos.remove(aux);
				return true;
			}
		}
		return false;
	}
	
	Contato buscarContato(Contato contato){
		
		for(int i = 0; i < this.contatos.size(); i++){
			if(this.contatos.get(i).nome == contato.getNome()) {
				//if(this.contatos.get(i).email == contato.getEmail()) {
					return this.contatos.get(i);
				//}
			}
		}
		
		return null;
	}
	
	boolean alterarContato(Contato contato, String nome, String email) {
		if(contato.getNome() != null && !contato.tel.isEmpty()) {
			Contato aux = buscarContato(contato);
			if(aux != null) {
				int i = this.contatos.indexOf(aux);
				if(nome != null)
				this.contatos.get(i).nome = nome;
				
				if(email != null)
				this.contatos.get(i).email = email;
				
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String aux = "";
		for(int i = 0; i < this.contatos.size(); i++) {
			aux = aux + this.contatos.get(i).toString()+"\n";
		}
		return aux;
	}
}