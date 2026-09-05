/*Uma aplicação interessante dos computadores é exibir diagramas e
gráficos de barras. Escreva um aplicativo que leia cinco números entre 1 e 30.
Para cada número que é lido, seu programa deve exibir o mesmo número de asteriscos adjacentes.
Por exemplo, se seu programa lê o número 7, ele deve exibir *******.
Exiba as barras dos asteriscos depois de ler os cinco números.
 */


import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();

    }
}
