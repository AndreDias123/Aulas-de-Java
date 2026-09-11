import java.util.ArrayList;

public class Gerente extends Funcionario implements Trabalhavel {
	private ArrayList<Funcionario> equipe;

	public Gerente(String nome, double salario, Projeto projeto) {
		super(nome, salario, projeto);
		this.equipe = new ArrayList<Funcionario>();
	}

	@Override
	public double calcularBonus() {
		return getSalario() * 0.15;
	}

	@Override
	public void trabalhar() {
		System.out.println(getNome() + " esta gerenciando o projeto " + getProjeto().getNome());
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Quantidade de Funcionarios na Equipe: " + equipe.size());
	}

	public void adicionarFuncionario(Funcionario funcionario) {
		equipe.add(funcionario);
	}

	public void listarEquipe() {
		if (equipe.isEmpty()) {
			System.out.println("Nao ha funcionarios na equipe.");
		} else {
			System.out.println("Funcionarios da equipe de " + getNome() + ":");
			for (Funcionario funcionario : equipe) {
				System.out.println("- " + funcionario.getNome());
			}
		}
	}
}
