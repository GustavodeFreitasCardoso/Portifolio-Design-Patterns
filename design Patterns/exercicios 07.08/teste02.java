class Pix {
    public void pagar(double valor) {
        System.out.println("Pagamento via PIX: " + valor);
    }

    public void historico(double valor) {
        System.out.println("Histórico PIX: " + valor);
    }
}

class Boleto {
    public void pagar(double valor) {
        System.out.println("Pagamento via boleto: " + valor);
    }

    public void historico(double valor) {
        System.out.println("Histórico boleto: " + valor);
    }
}

class Cartao {
    public void pagar(double valor) {
        System.out.println("Pagamento via cartão: " + valor);
    }

    public void historico(double valor) {
        System.out.println("Histórico cartão: " + valor);
    }
}

class PagamentoService {

    public void pagar(String tipo, double valor) {
        switch (tipo) {
            case "pix":
                new Pix().pagar(valor);
                break;

            case "boleto":
                new Boleto().pagar(valor);
                break;

            case "cartao":
                new Cartao().pagar(valor);
                break;
        }
    }
}

class FaturaService {

    public void historico(String tipo, double valor) {
        switch (tipo) {
            case "pix":
                new Pix().historico(valor);
                break;

            case "boleto":
                new Boleto().historico(valor);
                break;

            case "cartao":
                new Cartao().historico(valor);
                break;
        }
    }
}