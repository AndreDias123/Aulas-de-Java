public class Desenvolvedor extends Funcionario implements Trabalhavel {
	private String linguagemPrincipal;

	public Desenvolvedor(String nome, double salario, Projeto projeto, String linguagemPrincipal) {
		super(nome, salario, projeto);
		this.linguagemPrincipal = linguagemPrincipal;
	}

	public String getLinguagemPrincipal() {
		return linguagemPrincipal;
	}

	@Override
	public double calcularBonus() {
		return getSalario() * 0.10;
	}

	@Override
	public void trabalhar() {
		System.out.println(getNome() + " esta trabalhando com " + linguagemPrincipal + " no projeto " + getProjeto().getNome());
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Linguagem Principal: " + linguagemPrincipal);
	}
}
