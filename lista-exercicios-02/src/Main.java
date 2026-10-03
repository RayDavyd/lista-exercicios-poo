import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Titular: ");
        String titular = sc.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor do saque: ");
                    conta.sacar(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Valor do deposito: ");
                    conta.depositar(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Saldo: " + conta.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 4);

        sc.close();
    }
}