
public class Main {
	public static void main(String []args) {
		Banco banco = new Banco();
		ContaCorrente corrente = new ContaCorrente("Sam",1, 100.0, 0.002, banco);
		ContaPoupanca poupanca = new ContaPoupanca("Biel",2, 50.0, 100.0, banco);
		System.out.println("Contas\n");
		System.out.println("n sald taxa");
		Relatorio relatorioCorrente = new Relatorio();
		relatorioCorrente.gerarRelatorio(corrente);
		
		System.out.println("\nn sald limite");
		Relatorio relatorioPoupanca = new Relatorio();
		relatorioPoupanca.gerarRelatorio(poupanca);
		
		System.out.println("\nSacar\n");
		System.out.println("n sald taxa");
		corrente.sacar(50.0);
		relatorioCorrente.gerarRelatorio(corrente);
		
		System.out.println("\nn sald limite");
		poupanca.sacar(60.0);
		relatorioPoupanca.gerarRelatorio(poupanca);
		
		System.out.println("\nTransferir\n");
		System.out.println("n sald taxa");
		corrente.transferir(5.0, poupanca);
		relatorioCorrente.gerarRelatorio(corrente);
		System.out.println("\nn sald limite");
		relatorioPoupanca.gerarRelatorio(poupanca);
		
		System.out.println("\nBanco\n");
		Relatorio relatorioBanco = new Relatorio();
		relatorioBanco.gerarRelatorio(banco);
		
	}
}
