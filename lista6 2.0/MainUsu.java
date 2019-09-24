import javax.swing.JOptionPane;

public class MainUsu {
	public static void main(String [] args) {
		Banco banco = new Banco();
		int op = 0, aux, cont = 0, teste, contP = 0, ver, numero;
		String nome;
		double saldo;
		double taxaDeOperacao = 0.002, taxaDeOperacaoAux = 0.0015;
		ContaCorrente corrente[] = new ContaCorrente[100];
		ContaPoupanca poupanca[] = new ContaPoupanca[100];
		do {
		op = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Conta.\n2 - Buscar conta.\n3 - Sair"));
		if(op == 1) {
			do {
			ver = 1;
			aux = Integer.parseInt(JOptionPane.showInputDialog("Digite\n1 - Conta Corrente \n2 - Conta Poupanca"));
			switch (aux) {
			case 1:
				nome = JOptionPane.showInputDialog("Qual seu nome?");
				saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saldo?"));
				teste = JOptionPane.showConfirmDialog(null, "A taxa e' de 0.002%\ndo valor em questao, ok?");
				if(teste == JOptionPane.YES_OPTION) {
					 corrente[cont] = new ContaCorrente(nome, cont, saldo, taxaDeOperacao, banco);
					 JOptionPane.showMessageDialog(null, "Sucesso!");
					 cont++;
				}else if(teste == JOptionPane.NO_OPTION){
					teste = JOptionPane.showConfirmDialog(null, "Podemos deixar a taxa\npor 0.0015%, voce quer?");
					if(teste == JOptionPane.YES_OPTION) {
						corrente[cont] = new ContaCorrente(nome, cont, saldo, taxaDeOperacaoAux, banco);
						JOptionPane.showMessageDialog(null, "Sucesso!");
						cont++;
					}else {
						JOptionPane.showMessageDialog(null, "Lamentamos!");
						ver = 0;
					}
				}else{
					JOptionPane.showMessageDialog(null, "Lamentamos!");
					ver = 0;
				}
				break;
			case 2:
				nome = JOptionPane.showInputDialog("Qual seu nome?");
				saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saldo?"));
				teste = JOptionPane.showConfirmDialog(null, "Seu limite extra e' de 100.0, ok?");
				if(teste == JOptionPane.YES_OPTION) {
					poupanca[contP] = new ContaPoupanca(nome, cont+contP, saldo, 100.0, banco);
					JOptionPane.showMessageDialog(null, "Sucesso!");
					contP++;
				}else {
					JOptionPane.showMessageDialog(null, "Lamentamos!");
					ver = 0;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Nao exite essa opcao!");
				break;
			}
			}while(aux < 1 ||  aux>2 || ver != 0);
			
		}else if(op == 2){
			nome = JOptionPane.showInputDialog("Qual o nome?");
			numero = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta?"));
		}else if(op == 3) {
			JOptionPane.showMessageDialog(null, "Ate' a proxima!");
		}else {
			JOptionPane.showMessageDialog(null, "Nao exite essa opcao!");
		}
		}while(op != 3);
		
	}
}
