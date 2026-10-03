public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ray", 1001);
        Aluno aluno2 = new Aluno("João", 1002);
        Aluno aluno3 = new Aluno("Maria", 1003);

        aluno1.cadastrarNotas();
        aluno2.cadastrarNotas();
        aluno3.cadastrarNotas();

        Turma turma = new Turma();

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        System.out.println("\n--- APROVADOS ---");
        turma.listarAprovados();

        System.out.println("\n--- REPROVADOS ---");
        turma.listarReprovados();
    }
}