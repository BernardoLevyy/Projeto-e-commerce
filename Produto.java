public class Produto {
    private String nomeProduto;
    private double valorProduto;
    private int quantidadeProduto;
    private static int quantidadeTotal;
    private static int estoqueMinimo = 5;

    public Produto(String nomeProduto, double valorProduto, int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produto() {
        //TODO Auto-generated constructor stub
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public void setValorProduto(double valorProduto){
        this.valorProduto = valorProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto){
        this.quantidadeProduto = quantidadeProduto;
    }

    public void setQuantidadeTotal(int quantidadeTotal){
        Produto.quantidadeTotal = quantidadeTotal;
        
    } 

    public static int getQuantidadeTotal(){
        return Produto.quantidadeTotal;
    }

    public int getQuantidadeProduto(){
        return this.quantidadeProduto;
    }

    public double getValorProduto(){
        return this.valorProduto;
    }

    public boolean validarEstoque(){
        if(Produto.quantidadeTotal > 0){
            System.out.println("Produto em estoque");
            return true;
        }
        else{
            System.out.println("Produto fora de estoque");
            return false;
        }
    }

    public void decrementarEstoque(){
        Produto.quantidadeTotal -= this.quantidadeProduto;
    }

    public void incrementarEstoque(){
        this.quantidadeProduto++;
    }

    public void verificarEstoqueMinimo(){
        if(Produto.quantidadeTotal < Produto.estoqueMinimo){
            System.out.println("Produto abaixo do estoque mínimo");
        }
    }

    public int validarEstoqueMinimo(){
        if(Produto.quantidadeTotal < Produto.estoqueMinimo){
            return 0;
        }
        else{
            return 1;
        }
    }

    public void imprimeProduto(){
        System.out.println("Nome do produto: " + this.nomeProduto);
        System.out.println("Valor do produto: " + this.valorProduto);
        System.out.println("Quantidade do produto: " + this.quantidadeProduto);
        System.out.println("Quantidade total de produtos: " + Produto.quantidadeTotal);
    }

    public void Produto(String string, double d, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Produto'");
    }

    public void produto(String string, double d, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'produto'");
    }

}
