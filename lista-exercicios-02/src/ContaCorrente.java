public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= 10000 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saque invalido! (saldo insuficiente ou valor acima de 10000)");
        }
    }

    public void depositar(double valor) {
        if (valor > 0 && valor <= 10000) {
            saldo += valor;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Deposito invalido! (valor deve ser positivo e ate 10000)");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}