public abstract class Funcionario {
	private String nome;
	private double salario;
	private Projeto projeto;

	public Funcionario(String nome, double salario, Projeto projeto) {
		this.nome = nome;
		this.salario = salario;
		this.projeto = projeto;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public abstract double calcularBonus();

	public void exibirDados() {
		System.out.println("Nome: " + nome + " - Salario: " + salario + " - Projeto: " + projeto.getNome() + " - Descricao do Projeto: " + projeto.getDescricao() + " - Bonus: " + calcularBonus());
	}
}
