package Lista1;

public class Main {
    public static void main(String[] args) {
        // Letra a


        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 59.99);
        livro1.imprimirDados();

        // Letra b

        Pessoa pessoa1 = new Pessoa("Eduardo", 40, "123.456.789-10");
        pessoa1.imprimirDados();

        // Letra c
        
        Professor professor1 = new Professor("Dr. Silva");
        Disciplina disciplina1 = new Disciplina("Estrutura de Dados e Análise de Algoritmos", professor1);

        Professor professor2 = new Professor("Dra. Santos");
        Disciplina disciplina2 = new Disciplina("Banco de Dados", professor2);

        Aluno aluno1 = new Aluno("João", 2021001);
        Aluno aluno2 = new Aluno("Maria", 2021002);

        Universidade universidade = new Universidade("Universidade XYZ");

        universidade.realizarMatricula(aluno1, disciplina1);
        universidade.realizarMatricula(aluno1, disciplina2);

        universidade.realizarMatricula(aluno2, disciplina1);

        aluno1.listarDisciplinasMatriculadas();
        aluno2.listarDisciplinasMatriculadas();

        professor1.darAula(disciplina1);
        professor2.darAula(disciplina2);

        // Letra d

        Cachorro cachorro1 = new Cachorro(1, "Doméstico", "Buddy", "Golden Retriever", 3);

        System.out.println("Dados do Cachorro:");
        System.out.println("ID: " + cachorro1.getId());
        System.out.println("Tipo: " + cachorro1.getTipo());
        System.out.println("Nome: " + cachorro1.getNome());
        System.out.println("Raça: " + cachorro1.getRaca());
        System.out.println("Idade: " + cachorro1.getIdade());

    }
}