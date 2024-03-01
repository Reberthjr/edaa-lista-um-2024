package Lista1;

public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void darAula(Disciplina disciplina) {
        System.out.println(nome + " está dando aula de " + disciplina.getNome());
    }
}
