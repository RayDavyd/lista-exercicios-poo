import java.util.Scanner;


void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o valor da sua compra: ");
    double valorCompra = sc.nextDouble();
    System.out.println("Informe a forma de pagamento: ");
    System.out.println("( 1 ) PIX");
    System.out.println("( 2 ) BOLETO");
    System.out.println("( 3 ) CARTAO DE CREDITO");
    System.out.printf("OPC: ");
    int opc = sc.nextInt();

    Pagamento pagamento;

    switch (opc) {
        case 1 -> pagamento = new Pix();
        case 2 -> pagamento = new Boleto();
        case 3 -> pagamento = new CartaoCredito();
        default -> {
            System.out.println("Opc nao disponivel");
            return;
        }
    }

    System.out.printf("Valor final: %.2f\n", pagamento.processar(valorCompra));
}
