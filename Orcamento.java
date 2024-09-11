public class Orcamento {
    private  double valorTotal;
    private double pagamento;

    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }

    public void calculaValorTotal (Produto produto){
        this.valorTotal = produto.getQuantidadeProduto() * produto.getValorProduto();
    }

    public void imprimeValorTotal(){
        System.out.println("Valor total do Orçamento: " + this.valorTotal);
    }

    public void setPagamneto(double pagamento){
        this.pagamento = pagamento;
    }

    public boolean validaPagamento(){
        if(this.pagamento == this.getValorTotal()){
            return true;
        } else {
            return false;
        }
    }
}
