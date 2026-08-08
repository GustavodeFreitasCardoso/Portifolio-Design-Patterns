public class teste06 {

    public void finalizar(Pedido pedido) {
        StripeApi stripe = new StripeApi();

        stripe.cobrar(
            pedido.getCartao(),
            pedido.getEmail(),
            pedido.getValor()
        );
    }
}