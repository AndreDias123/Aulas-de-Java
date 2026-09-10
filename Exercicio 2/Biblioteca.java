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

	public void emprestar_livro(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isDisponivel()) {
				livro.setDisponivel(false);
				System.out.printf("Livro %s emprestado; %n", livro.getTitulo());
				return;
			}
		}

		System.out.println("Livro nao encontrado");
	}

	public void devolver_livro(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				livro.setDisponivel(true);
				System.out.printf("Livro %s devolvido; %n", livro.getTitulo());
				return;
			}
		}

		System.out.println("Livro nao encontrado");
	}

	public void livros_disponiveis() {
		for (Livro livro : livros) {
			if (livro.isDisponivel()) {
				System.out.println(livro.getTitulo());
			}
		}
	}
}
