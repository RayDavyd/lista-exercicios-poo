Questões de Java — Entrada e Saída de Dados

5. Scanner e System.out.printf

O Scanner é utilizado em Java para realizar a entrada de dados pelo teclado. Para utilizá-lo, é necessário importar a classe Scanner com "import java.util.Scanner;" e depois criar um objeto Scanner utilizando "Scanner sc = new Scanner(System.in);". Para ler um valor do tipo double, utilizamos o método "nextDouble()". Exemplo: "double numero = sc.nextDouble();".

O System.out.printf é utilizado para exibir informações no console de forma formatada. Para exibir um número double com duas casas decimais, utilizamos "%.2f". Por exemplo: "System.out.printf("Valor: %.2f%n", numero);". Nesse caso, %.2f indica que o número será exibido com duas casas decimais e %n realiza a quebra de linha.


6. Identificação e correção dos erros

O código original apresenta alguns erros de sintaxe e lógica. O primeiro erro está na declaração do método main. Foi utilizado "public static void main(String args)", porém o correto é "public static void main(String[] args)", pois args deve ser um array de String, ou seja, faltou declarar [] depois de String.

O segundo erro está na instrução System.out.println("Contador: " + contador), que não possui ponto e vírgula no final. 

O terceiro erro é um erro de lógica. O contador começa com o valor 0 e a condição do while é "contador <= 5", porém o valor do contador nunca é alterado dentro do laço. Dessa forma, a condição continuará verdadeira e o programa ficará executando infinitamente. Para corrigir isso, é necessário utilizar "contador++" dentro do while.

O código corrigido fica:

    import java.util.Scanner;

    public class Contador {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int contador = 0;   

        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
         }
        sc.close();
        }
    }
