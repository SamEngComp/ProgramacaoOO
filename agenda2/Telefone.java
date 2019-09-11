

public class Telefone {
	int ddd;
	int numero;
	
	Telefone(){
		
	}
	Telefone(int ddd, int numero){
		this.ddd = ddd;
		this.numero = numero;
	}
	
	int getDdd() {
		return ddd;
	}
	void setDdd(int ddd) {
		this.ddd = ddd;
	}
	int getNumero() {
		return numero;
	}
	void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "("+this.ddd+")"+" "+this.numero;
	}
}