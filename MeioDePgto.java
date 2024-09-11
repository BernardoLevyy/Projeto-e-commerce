public class MeioDePgto {
    private static final int NMAX_PARCELAS = 3;
    private int numParcelas;
    private String nomePagamento;
    private double taxaCartao;

    public void setMeioDePgto(int numParcelas, String nomePagamento, double taxaCartao) {
        this.numParcelas = numParcelas;
        this.nomePagamento = nomePagamento;
        this.taxaCartao = taxaCartao;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public boolean validarNumParcelas(){
        if(this.numParcelas <= NMAX_PARCELAS){
            return true;
        }
        else{
            return false;
        }
    }

    public void setNomePagamento(String nomePagamento) {
        this.nomePagamento = nomePagamento;
    }

    public void setTaxaCartao(double taxaCartao) {
        this.taxaCartao = taxaCartao;
    }

    public void imprimirDadosPagamento() {
        System.out.println("Nome do pagamento: " + this.nomePagamento);
        System.out.println("Número de parcelas: " + this.numParcelas);
        System.out.println("Taxa do cartão: " + this.taxaCartao);
    }
}
