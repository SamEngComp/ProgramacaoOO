import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner ler = new Scanner(System.in);
		Banco banco = new Banco();
		Conta corrente[] = new ContaCorrente[100];
		Conta poupanca[] = new ContaPoupanca[100];
		int cont_cor = 0;// contador para a conta corrente
		int cont_pou = 0;// contador para a conta poupanca
		System.out.println("+++++++++++++++++++++++++++++++"
				+ "\n	Digete:"
				+ "\n	1- Criar Conta"
				+ "\n	2- Selecionar Conta"
				+ "\n	3- Remover Conta"
				+ "\n	4- Gerar Relatorio"
				+ "\n	5- Finalizar"
				+ "\n+++++++++++++++++++++++++++++++"
				+ "\nDigite: ");
		int op_prin = ler.nextInt();//Opcao da tela principal
		int op_sec;//Opcao da tela secundaria
		int numero;// vai ser usado para pegar o saldo e o numero passado 
		double saldo, taxa_limite;
		do {
			switch(op_prin) {
				case 1:
					System.out.println("*****************************"
							+ "\n	Criar Conta:"
							+ "\n	1- Corrente"
							+ "\n	2- Poupanca"
							+ "\n*****************************"
							+ "\nDigite: ");
					op_sec = ler.nextInt();
					do {
							switch(op_sec) {
							case 1:
								System.out.println("*****************************"
										+ "\n	Corrente:"
										+ "\nDigite o numero da Conta: ");
								numero = ler.nextInt();
								System.out.println("\nDigite o Saldo: ");
								saldo = Double.parseDouble(ler.next));
								System.out.println("\nDigite a taxa: ");
								taxa_limite = Double.parseDouble(ler.nextLine());
								
								corrente[cont_cor] = new ContaCorrente(numero, saldo, taxa_limite);
								System.out.println("\n	Sucesso!"
										+ "\n*****************************");
								cont_cor++;
								break;
							case 2:
								
								break;
							case 3:
								System.out.println(">>>>>>>>><<<<<<<<<<"
										+ "\nVoltando!"
										+ "\n>>>>>>>>><<<<<<<<<<");
								break;
							default:
						}
					}while(op_sec != 3);
					
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
						
					break;
				case 5:
						System.out.println(">>>>>>>>><<<<<<<<<<"
								+ "\nAte' a proxima <3!"
								+ "\n>>>>>>>>><<<<<<<<<<");
					break;
				default:
					
			}
		}while(op_prin != 5);
	}
}
