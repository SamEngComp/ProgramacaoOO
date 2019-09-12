import java.util.ArrayList;
import java.util.List;
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
			//Contato aux = buscarContato(contato);
			if(contato != null) {
				this.contatos.remove(contato);
				return true;
			}
		}
		return false;
	}
	
	Contato buscarContato(String nome){
		
			
			for(int i = 0; i < this.contatos.size(); i++){	
				if(this.contatos.get(i).getNome().equals(nome)) {
						return this.contatos.get(i);
				}
			}
		
		Contato aux = new Contato(null, null);
		return aux;
	}
	
	boolean alterarContato(Contato contato, String nome, String email) {
		if(contato.getNome() != null && contato.getEmail() != null) {
				if(nome != null)
				contato.setNome(nome);;
				
				if(email != null)
				contato.setEmail(email);
				
				return true;
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
