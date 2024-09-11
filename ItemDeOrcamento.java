public class ItemDeOrcamento {
    private int quantidade;
    private Produto produto;

    public ItemDeOrcamento(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public ItemDeOrcamento() {
        //TODO Auto-generated constructor stub
    }

    public void setQuantidade(Produto produto) {
        this.quantidade = produto.getQuantidadeProduto();
    }

    public int defineQuantidade(int quantidade) {
        this.quantidade = this.produto.getQuantidadeProduto();
        return quantidade;
    }   

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade(){
        return quantidade;
    } 
    
    public Produto getProduto(){
        return produto;
    }
}
