import java.util.*;
public class AgendaTelefonica {
	List<Contato> contatos;

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
		return false;
	}
Contato buscarContato(Contato contato){
		
		for(Contato contato : this.tel){
			
		}
		
		return contato;
	}
}
