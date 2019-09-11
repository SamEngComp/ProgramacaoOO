

import java.util.*;

public class Contato {
	String nome;
	String email;
	List<Telefone> tel;
	
	Contato(String nome, Telefone telefone){
		this.nome = nome;
		this.tel = new ArrayList<Telefone>();
		this.tel.add(telefone);
	}
	Contato(String nome, Telefone telefone, String email){
		this.nome = nome;
		this.email = email;
		this.tel = new ArrayList<Telefone>();
		this.tel.add(telefone);
	}
	
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	List<Telefone> getTel() {
		return tel;
	}
	void setTel(List<Telefone> tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return this.nome+" "+this.email+" "+this.tel.toString(); 
	}
	
	boolean adicionarTelefone(Telefone telefone) {
		if(telefone.getDdd()>0 && telefone.getDdd()<=999) {
			if(telefone.getNumero()>0) {
				this.tel.add(telefone);
				return true;
			}
		}
		return false;
	}
	
}