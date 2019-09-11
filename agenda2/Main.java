import java.util.*;

public class Main {
	public static void main(String []args) {
		AgendaTel agenda = new AgendaTel();
		Telefone tel = new Telefone();
		Telefone tel2 = new Telefone();
		Telefone tel3 = new Telefone();
		Telefone tel4 = new Telefone();
		
		tel.setDdd(85);
		tel.setNumero(989619606);
		
		Contato con1 = new Contato("Nathan", tel, "nathan@email.com");
		agenda.adicionarContato(con1);
		
		tel2.setDdd(85);
		tel2.setNumero(997087966);
		Contato con2 = new Contato("Arnaldo", tel2, "arnaldo@email.com");
		agenda.adicionarContato(con2);
		
		tel3.setDdd(85);
		tel3.setNumero(989902424);
		Contato con3 = new Contato("Gabriel", tel3, "gabriel@email.com");
		agenda.adicionarContato(con3);
		
		tel4.setDdd(85);
		tel4.setNumero(989000000);
		con3.adicionarTelefone(tel4);
		
		System.out.println(agenda.toString());
		agenda.alterarContato(con3, "Samuel", "louco@gmail.com");
		System.out.println(con3.toString());
		agenda.removerContato(con3);
		
		System.out.println("\n"+agenda.toString());
		
	}
}