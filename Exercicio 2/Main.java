import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<>();
		livros.add(new Livro("Dom Casmurro", "Machado de Assis", true));
		livros.add(new Livro("Sao Bernardo", "Graciliano Ramos", true));
		livros.add(new Livro("1984", "George Orwell", false));

		Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal", livros);

		Livro novoLivro = new Livro("Clean Code", "Robert C. Martin", true);
		biblioteca.adicionar_livro(novoLivro);

		System.out.println("Acervo atual:");
		for (Livro livro : livros) {
			String status = livro.isDisponivel() ? "Disponivel" : "Emprestado";
			System.out.println("- " + livro.getTitulo() + " (" + livro.getAutor() + ") - " + status);
		}

		System.out.println();
		System.out.println("Emprestando o livro: " + novoLivro.getTitulo());
		novoLivro.setDisponivel(false);
		String statusFinal = novoLivro.isDisponivel() ? "disponivel" : "indisponivel";
		System.out.println(novoLivro.getTitulo() + " agora esta " + statusFinal);
	}
}
