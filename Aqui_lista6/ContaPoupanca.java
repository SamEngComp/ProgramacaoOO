                                                                        
public class ContaPoupanca extends Conta implements Imprimivel{                               
	double limite;                                                      
                                                                        
	ContaPoupanca(int numero, double saldo, double limite) {            
		super(numero, saldo);                                           
		this.limite = limite;                                           
	}                                                                   
	                                                                    
	public double getLimite() {                                         
		return limite;                                                  
	}                                                                   
                                                                        
	public void setLimite(double limite) {                              
		this.limite = limite;                                           
	}                                                                   
	
	@Override
	public String mostrarDados() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		return "Numero: "+this.getNumero()+" Saldo:"+
				this.getSaldo()+" Limite: "+this.limite+"\n";
	}
	
	@Override                                                           
		public void sacar(double valor) throws NullPointerException{    
			if(this.getSaldo()+this.limite < valor)                     
  			throw new NullPointerException();                           
    		else {                                                      
    			double aux = this.getSaldo() - valor;                   
    			if(aux  < 0) {                                          
    				this.setLimite((this.limite+aux));
    				this.setSaldo(aux);
    			}else {
    				this.setSaldo(aux);
    			}
    		}                                                           
    		                                                            
    	}                                                               
    	                                                                
    	@Override                                                       
    	public void depositar(double valor) throws NullPointerException{
    		if(valor < 0)                     
      			throw new NullPointerException();                           
        		else {                                                      
        			double aux;                   
        			if(this.getSaldo()  < 0) {
        				aux = this.getSaldo() + valor;
        				if(aux < 0) {
        					this.setLimite((this.limite-aux));
            				this.setSaldo(aux);
        				}else {
        					this.setLimite((this.limite - this.getSaldo()));
        					this.setSaldo(aux);
        				}
        			}else {
        				aux = this.getSaldo() + valor;
        				this.setSaldo(aux);
        			}
        		}                                                             
    	}                                                               
    	                                                                
    	@Override                                                       
    	public void transferir(double valor, Conta conta) throws NullPointerException{
    		if(valor<0 || conta == null)                    
    			throw new NullPointerException();                       
    		else {                                                      
    			try {                                                   
    			this.sacar(valor);                                      
    			}catch (Exception e) {                                  
    				System.out.println(e + " Nao deu!");                
    				return;                                             
    			}                                                       
    			conta.depositar(valor);
    		}                                                           
    	}                                                               
}                                                                       