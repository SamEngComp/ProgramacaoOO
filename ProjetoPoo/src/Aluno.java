import java.util.*;
public class Aluno {
	private int matricula;
	private String nome;
	private String data_nascimento;
	private Turma turma;
	private List<Responsavel> reponsaveis;
	
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public List<Responsavel> getReponsaveis() {
		return reponsaveis;
	}
	public void setReponsaveis(List<Responsavel> reponsaveis) {
		this.reponsaveis = reponsaveis;
	}
	
	
	
}
