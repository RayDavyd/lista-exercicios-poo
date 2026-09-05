/*Peça um número ao usuário. Verifique e imprima:
"Múltiplo de 3", se for múltiplo de 3;
"Múltiplo de 5", se for múltiplo de 5;
"Múltiplo de ambos", se for múltiplo de 3 e 5;
"Não é múltiplo de 3 nem de 5", caso contrário.
*/


import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Múltiplo de ambos");
        } else if (num % 3 == 0) {
            System.out.println("Múltiplo de 3");
        } else if (num % 5 == 0) {
            System.out.println("Múltiplo de 5");
        } else{
            System.out.println("Não é múltiplo de 3 nem de 5");

        }

        sc.close();
    }
}
