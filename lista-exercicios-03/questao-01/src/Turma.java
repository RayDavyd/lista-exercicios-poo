public class Turma {
    private Aluno[] alunos;

    public Turma() {
        this.alunos = new Aluno[100];
    }

    public void adicionarAluno(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                break;
            }
        }
    }

    public void listarAprovados() {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].calcularMedia() >= 7.0) {
                System.out.println(alunos[i]);
            }
        }
    }

    public void listarReprovados() {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].calcularMedia() < 7.0) {
                System.out.println(alunos[i]);
            }
        }
    }

}
