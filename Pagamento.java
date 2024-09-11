public class Pagamento {
    private boolean comfirmacaoPagamento;
    private double valorPagamento;

    public Pagamento(boolean comfirmacaoPagamento, double valorPagamento) {
        this.comfirmacaoPagamento = comfirmacaoPagamento;
        this.valorPagamento = valorPagamento;
    }

    Orcamento orcamento = new Orcamento();
    
    public Pagamento() {
        //TODO Auto-generated constructor stub
    }

    public double getValorTotalOrcamento(){
        return orcamento.getValorTotal();
    }


    public boolean statusPagemento(){
        if(this.valorPagamento == orcamento.getValorTotal()){
            this.comfirmacaoPagamento = true;
            return true;
        }
        else{
            this.comfirmacaoPagamento = false;
            return false;
        }
    }

}
