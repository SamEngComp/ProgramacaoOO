

import java.util.*;

import javax.management.Descriptor;

public class Conta{
	int numero;
    double saldo;
    List <Operacao> listaOpe;
    Cliente cliente;
    
    Conta(int numero, double saldo, List <Operacao> listaOpe, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo;
        this.listaOpe = listaOpe;
        this.cliente = cliente;
    }
    
    Conta(int numero, double saldo, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        this.listaOpe = new ArrayList<Operacao>();
    }
    
    int getNumero(){
        return this.numero;
    }
    
    void setNumero(int numero){
        this.numero = numero;
    }
    
    double getSaldo(){
        return this.saldo;
    }
    
    void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    List <Operacao> getListaOpe(){
        return this.listaOpe;
    }
    
    void setListaOpe(List <Operacao> listaOpe){
        this.listaOpe = listaOpe;
    }
    
    Cliente getCliente(){
        return this.cliente;
    }
    
    void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    String imprimeExtrato(){
        return this.listaOpe.toString();
        /*String aux = null;
        for(String i : this.listaOpe.toString){
            aux.concat(i);
        }
        return aux;*/
    }
    
    String imprimeExtrato(int n){
        String aux = "";
        for(int i = this.listaOpe.size() - 1; i >= this.listaOpe.size() - n; i--){
        	
            aux = aux.concat(listaOpe.get(i).toString());
            aux = aux.concat(" ");
        }
        return aux;
    }
    
    boolean sacar(Sacar saque){
    	if(this.equals(saque.getOrigem())){
    		if(this.saldo <= saque.getValor()){
    			double aux = this.saldo - saque.getValor();
    			this.setSaldo(aux);
    			return true;
    		}
    	}
        return false;
        
        
    }
    
    boolean depositar(Depositar deposito){
        if(this.equals(deposito.getDestino())){
        	Sacar aux = new Sacar(deposito.getOrigem(), deposito.getValor());
        	if(this.sacar(aux)){
        		
        	}
        }
        return false;
    }
    
    @Override
    public String toString(){
        return this.numero + " " + this.saldo + " " + this.cliente.toString() + " " + this.listaOpe.toString();
    }
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Conta))
			return false;
		Conta other = (Conta) obj;
		if (this == null) {
			
			if (other != null)
				return false;
			
		} else if (!this.equals(other))
			return false;
		return true;
	}
}