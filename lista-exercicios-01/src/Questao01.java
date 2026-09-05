/*Escreva um programa que leia o nome de um aluno e suas três notas,
sendo a terceira nota com peso 2. Calcule e exiba a média ponderada, com duas casas decimais. \
Depois, exiba se o aluno está "Aprovado" (média ≥ 7) ou "Reprovado".
 */

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso = 2;

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe sua 1° nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Informe sua 2° nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Informe sua 3° nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + (nota3 * peso)) / 4;
        System.out.printf("Média: %.2f%n", media);

        if(media >= 7){
            System.out.printf("%s aprovado", nome);
        }
        else{
            System.out.printf("%s reprovado", nome);
        }

        sc.close();

    }
}
