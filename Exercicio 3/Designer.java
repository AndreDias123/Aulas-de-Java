public class Designer extends Funcionario implements Trabalhavel {
	private String ferramentaPrincipal;

	public Designer(String nome, double salario, Projeto projeto, String ferramentaPrincipal) {
		super(nome, salario, projeto);
		this.ferramentaPrincipal = ferramentaPrincipal;
	}

	public String getFerramentaPrincipal() {
		return ferramentaPrincipal;
	}

	@Override
	public double calcularBonus() {
		return getSalario() * 0.08;
	}

	@Override
	public void trabalhar() {
		System.out.println(getNome() + " esta trabalhando com " + ferramentaPrincipal + " no projeto " + getProjeto().getNome());
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Ferramenta Principal: " + ferramentaPrincipal);
	}
}
