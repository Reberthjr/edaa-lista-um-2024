public class Universidade {
    private String nome;

    public Universidade(String nome) {
        this.nome = nome;
    }

    public void realizarMatricula(Aluno aluno, Disciplina disciplina) {
        aluno.matricular(disciplina);
    }
}
