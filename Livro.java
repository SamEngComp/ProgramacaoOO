
public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	private int isbn;
	
	Livro(){
		
	}
	
	Livro(String titulo, String autor, String editora, int anoPublicacao, int isbn){
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.isbn = isbn;
	}
	
	
	void setTitulo(String titulo){
		this.titulo = titulo;
	}
	String getTitulo(){
		return this.titulo;
	}
	
	
	void setAutor(String autor){
		this.autor = autor;
	}
	String getAutor(){
		return this.autor;
	}
	
	
	void setEditora(String editora){
		this.editora = editora;
	}
	String getEditora(){
		return this.editora;
	}
	
	
	void setAnoPublicacao(int anoPublicacao){
		this.anoPublicacao = anoPublicacao;
	}
	int getAnoPublicacao(){
		return this.anoPublicacao;
	}
	
	
	void setIsbn(int isbn){
		this.isbn = isbn;
	}
	int getIsbn(){
		return this.isbn;
	}
	
	
	public static void main(String []args){
		Livro l1, l2;
		l1 = new Livro();
		l2 = new Livro("Socorro", "Sem Vergonha", "Quem sabe?", 1991, 123456);
		
		System.out.println("C:   "+l1.titulo +" " + l1.isbn);
		System.out.println("D:   "+l2.titulo +" " + l2.isbn);
		System.out.println("E:   "+l2.titulo +" " + l2.autor +" "+ l2.editora + " "+ l2.anoPublicacao+" "+l2.isbn);
		
		Livro l3 = new Livro();
		l2 = l2;
		System.out.println("G:   "+l3.titulo +" " + l3.autor +" "+ l3.editora + " "+ l3.anoPublicacao+" "+l3.isbn);
		System.out.println("G:   "+l2.titulo +" " + l2.autor +" "+ l2.editora + " "+ l2.anoPublicacao+" "+l2.isbn);
		
		l2 = l1;
		System.out.println("H:   "+l2.titulo +" " + l2.autor +" "+ l2.editora + " "+ l2.anoPublicacao+" "+l2.isbn);
	}
	
}
