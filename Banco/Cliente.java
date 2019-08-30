import java.util.*;
public class Cliente {
	int id;
	String nome;
	
	Cliente(int id, String nome){
		this.id = id;
		this.nome = nome;
	}
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString(){
		return this.id + " " + this.nome;
	}
	
	
}
