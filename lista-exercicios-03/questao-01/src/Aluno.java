import java.util.Scanner;

public class Aluno {
    private String nome;
    private long matricula;
    private double[] notas;

    public Aluno(String nome, long matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void cadastrarNotas() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a %d nota: ", i + 1);
            notas[i] = sc.nextDouble();
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void verificarAprovacao() {
        if (calcularMedia() >= 7.0) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }

    @Override
    public String toString() {
        return nome + " - média: " + calcularMedia();
    }

}