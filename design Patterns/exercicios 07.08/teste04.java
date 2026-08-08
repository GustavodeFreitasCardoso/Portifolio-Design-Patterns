
class Pedido {

    String cliente;
    String[] itens;
    double valorTotal;
    double desconto;
    String endereco;
}

public class teste04 {

    public static void main(String[] args) {

        Pedido original = new Pedido();

        original.cliente = "Fulano de Tal";
        original.itens = new String[]{"Mochila", "Caderno"};
        original.valorTotal = 150.0;
        original.desconto = 10.0;
        original.endereco = "Rua das Flores, 100";

        Pedido rascunho = new Pedido();

        rascunho.cliente = original.cliente;
        rascunho.itens = original.itens;
        rascunho.valorTotal = original.valorTotal;
        rascunho.desconto = original.desconto;
        rascunho.endereco = original.endereco;
    }
}