public class CartaoCredito extends Pagamento{

    @Override
    public double processar(double valor){
        return valor + (valor * 0.05);
    }
}
