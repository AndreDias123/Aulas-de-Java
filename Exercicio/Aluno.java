public class Aluno extends Usuario {
    private String curso;

    public Aluno(String nome, String email, String curso) {
        super(nome, email);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public void exibirDados() {
        System.out.println("--- Aluno ---");
        super.exibirDados();
        System.out.println("Curso: " + curso);
    }
}