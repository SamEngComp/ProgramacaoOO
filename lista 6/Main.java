
public class Main {
	public static void main(String []args) {
		ContaCorrente corrente = new ContaCorrente(1, 100.0, 0.002);
		ContaPoupanca poupanca = new ContaPoupanca(2, 50.0, 100.0);
		
		Imprimivel imprimir = null;
		Relatorio relatorio = null;
		relatorio.gerarRelatorio(imprimir);
	}
}
