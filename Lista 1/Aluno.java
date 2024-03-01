import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public void matricular(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
        System.out.println(nome + " matriculado na disciplina: " + disciplina.getNome());
    }

    public void listarDisciplinasMatriculadas() {
        System.out.println("Disciplinas matriculadas por " + nome + ":");
        for (Disciplina disciplina : disciplinasMatriculadas) {
            System.out.println("- " + disciplina.getNome());
        }
    }
}
