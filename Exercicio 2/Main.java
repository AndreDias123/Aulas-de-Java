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
		System.out.println("Testando emprestimo e devolucao:");
		biblioteca.emprestar_livro("Clean Code");
		biblioteca.emprestar_livro("Clean Code");
		biblioteca.devolver_livro("Clean Code");
		biblioteca.devolver_livro("Livro Inexistente");

		System.out.println();
		System.out.println("Livros disponiveis:");
		biblioteca.livros_disponiveis();
	}
}
