import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<>();

		livros.add(new Livro("Dom Quixote", "Miguel Servantes", true));
		livros.add(new Livro("Cem anos de solidao", "Gabriel Garcial", true));
		livros.add(new Livro("1984", "George Orwel", true));
		livros.add(new Livro("Memorias Postumas de Bras Cubas", "Machado de Assis", true));
		livros.add(new Livro("Crime e Castigo", "Fiodor Dostoievski", true));

		Biblioteca biblioteca = new Biblioteca("Pokemon", livros);

		Livro novo_livro = new Livro("O pequeno principe", "Antoine", true);

		biblioteca.listar_livros();
		biblioteca.adicionar_livro(novo_livro);
		System.out.println("====================");

		System.out.println("Novo livro adicionado.");
		biblioteca.listar_livros();

		System.out.println("====================");

		System.out.println("Emprestar livro:");
		biblioteca.emprestar_livro("Crime e Castigo");
	}
}
