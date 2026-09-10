import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Livro> livros;

	public Biblioteca(String nome, ArrayList<Livro> livros) {
		this.nome = nome;
		this.livros = livros;
	}

	public void adicionar_livro(Livro livro) {
		livros.add(livro);
	}
}
