public class PagamentoService {
    public void pagar(string tipo , valor ){
        switch (tipo){
            case "pix": new Pix().pagar(valor);break;
            case "boleto": new boleto().pagar(valor);break;
            case "cartao": new catao().pagar(valor);break;
        }
    }
}