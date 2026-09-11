import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Projeto projeto1 = new Projeto("Sistema Financeiro", "Sistema para controle financeiro da empresa");
		Projeto projeto2 = new Projeto("App Mobile", "Aplicativo mobile para clientes");

		Desenvolvedor desenvolvedor = new Desenvolvedor("Joao", 4000.0, projeto1, "Java");
		Designer designer = new Designer("Maria", 3500.0, projeto2, "Figma");
		Gerente gerente = new Gerente("Carlos", 6000.0, projeto1);

		gerente.adicionarFuncionario(desenvolvedor);
		gerente.adicionarFuncionario(designer);

		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(desenvolvedor);
		funcionarios.add(designer);
		funcionarios.add(gerente);

		for (Funcionario funcionario : funcionarios) {
			funcionario.exibirDados();
			System.out.println();
		}

		for (Funcionario funcionario : funcionarios) {
			if (funcionario instanceof Trabalhavel) {
				((Trabalhavel) funcionario).trabalhar();
			}
		}

		System.out.println();
		gerente.listarEquipe();
	}
}
