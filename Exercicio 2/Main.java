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

		Livro o_livro = new Livro("O pequeno principe", "Antoine", true);
	}
}
