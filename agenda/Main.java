package poo;
import java.util.*;

public class Main {
	public static void main(String []args) {
		AgendaTel agenda = new AgendaTel();
		Telefone tel = new Telefone();
		
		tel.setDdd(85);
		tel.setNumero(989619606);
		
		Contato con1 = new Contato("Nathan", tel, "nathan@email.com");
		agenda.adicionarContato(con1);
		
		tel.setDdd(85);
		tel.setNumero(997087966);
		Contato con2 = new Contato("Arnaldo", tel, "arnaldo@email.com");
		agenda.adicionarContato(con2);
		
		tel.setDdd(85);
		tel.setNumero(989902424);
		Contato con3 = new Contato("Gabriel", tel, "gabriel@email.com");
		agenda.adicionarContato(con3);
		
		System.out.println(agenda.toString());
	}
}
