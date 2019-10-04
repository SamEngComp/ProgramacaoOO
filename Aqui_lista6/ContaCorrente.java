
public class ContaCorrente extends Conta implements Imprimivel{
	double taxa;
	
	public ContaCorrente(int numero, double saldo, double taxa) {
		super(numero, saldo);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	@Override
	public String mostrarDados() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		return "Numero: "+this.getNumero()+" Saldo:"+
				this.getSaldo()+" Taxa: "+this.taxa+"\n";
	}
	
	@Override
	public void sacar(double valor) throws NullPointerException{
		if(this.getSaldo() < (valor+ this.saldo))
			throw new NullPointerException();
		else {
			double aux = this.getSaldo() - (valor + this.taxa);
			this.setSaldo(aux);
		}
		
	}
	
	@Override
	public void depositar(double valor) throws NullPointerException{
		if((valor-this.taxa)<0)
			throw new NullPointerException();
		else {
			double aux = this.getSaldo() + (valor - this.taxa);
			this.setSaldo(aux);
		}
	}
	
	@Override
	public void transferir(double valor, Conta conta) throws NullPointerException{
		if((valor-this.taxa)<0 || conta == null)
			throw new NullPointerException();
		else {
			try {
			this.sacar(valor);
			}catch (Exception e) {
				System.out.println(e + " Nao deu!");
				return;
			}
			double aux = conta.getSaldo() + valor;
			conta.setSaldo(aux);	
		}
	}
}
