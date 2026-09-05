/*Peça ao usuário um número inteiro positivo N.
Em seguida, imprima todos os números primos entre 2 e N.
 */

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero inteiro positivo: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
