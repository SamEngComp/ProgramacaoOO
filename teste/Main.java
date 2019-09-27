import javax.swing.JOptionPane;

public class Main {
	public static void main(String [] args) {
		Banco banco = new Banco();
		int op = 0, aux, cont = 0, teste, contP = 0, ver, numero, numero_dest;;
		String nome;
		double saldo;
		double taxaDeOperacao = 0.002, taxaDeOperacaoAux = 0.0015;
		ContaCorrente corrente[] = new ContaCorrente[100];
		ContaPoupanca poupanca[] = new ContaPoupanca[100];
		Conta aux_cont_dest;
		do {
		op = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Conta.\n2 - Buscar conta.\n3 - Remover conta\n4 - Gerar relatorio\n5-sair"));
		if(op == 1) {
			do {
			ver = 1;
			aux = Integer.parseInt(JOptionPane.showInputDialog("Digite\n1 - Conta Corrente \n2 - Conta Poupanca"));
			switch (aux) {
			case 1:
				saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saldo?"));
				teste = JOptionPane.showConfirmDialog(null, "A taxa e' de 0.002%\ndo valor em questao, ok?");
				if(teste == JOptionPane.YES_OPTION) {
					 corrente[cont] = new ContaCorrente(cont, saldo, taxaDeOperacao, banco);
					 JOptionPane.showMessageDialog(null, "Sucesso!");
					 ver = 0;
					 cont++;
				}else if(teste == JOptionPane.NO_OPTION){
					teste = JOptionPane.showConfirmDialog(null, "Podemos deixar a taxa\npor 0.0015%, voce quer?");
					if(teste == JOptionPane.YES_OPTION) {
						corrente[cont] = new ContaCorrente(cont, saldo, taxaDeOperacaoAux, banco);
						JOptionPane.showMessageDialog(null, "Sucesso!");
						ver = 0;
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
				saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saldo?"));
				teste = JOptionPane.showConfirmDialog(null, "Seu limite extra e' de 100.0, ok?");
				if(teste == JOptionPane.YES_OPTION) {
					poupanca[contP] = new ContaPoupanca(cont+contP, saldo, 100.0, banco);
					JOptionPane.showMessageDialog(null, "Sucesso!");
					ver = 0;
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
			int teste_local = 0;
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta?"));
			Conta aux_conta = banco.Buscar(numero);
			if(aux_conta == null) {
				JOptionPane.showMessageDialog(null, "Nao exite essa conta!");
			}else {
				do {
				aux = Integer.parseInt(JOptionPane.showInputDialog("Digite\n1 - Depositar\n2 - Sacar\n3 - Transferir\n4 - Gerar relatorio\n5 - Voltar"));
				
				switch (aux) {
				case 1:
					saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor?"));
					if(aux_conta.depositar(saldo) == true) {
						JOptionPane.showMessageDialog(null, "Sucesso!");
					}
					
					break;
				case 2:
					saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saldo?"));
					if(aux_conta.sacar(saldo) == true) {
						JOptionPane.showMessageDialog(null, "Sucesso!");
					}else {
						JOptionPane.showMessageDialog(null, "Lamentamos não deu para efetuar a operacao!");
					}
					break;
				case 3:
					saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor?"));
					numero_dest = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta?"));
					aux_cont_dest = banco.Buscar(numero_dest);
					if(aux_cont_dest == null) {
						JOptionPane.showMessageDialog(null, "Nao exite essa conta!");
					}else{
						if(aux_conta.transferir(saldo, aux_cont_dest) == true) {
							JOptionPane.showMessageDialog(null, "Sucesso!");
						}
					}
					break;
					
				case 4:
					JOptionPane.showMessageDialog(null, aux_conta.toString());
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Ate' <3!");
					teste_local = 1;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Nao exite essa opcao!");
					break;
				}
				
			}while(teste_local == 0);
			}
		}else if(op == 3) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta?"));
			Conta aux_conta = banco.Buscar(numero);
			if(aux_conta == null) {
				JOptionPane.showMessageDialog(null, "Nao exite essa conta!");
			}else {
				banco.remover(aux_conta);
			}
		}else if(op == 4){
			JOptionPane.showMessageDialog(null, banco.toString());
		}else if(op == 5) {
			JOptionPane.showMessageDialog(null, "Ate' a proxima!");
		}else{
			JOptionPane.showMessageDialog(null, "Nao exite essa opcao!");
		}
		}while(op != 3);
		
	}
}


