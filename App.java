public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("------- MERCADINHO DO RODOLFO --------");
        System.out.println("--------------------------------------");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Rodolfo");
        cliente1.setCpf("123.456.789-00");
        cliente1.imprimirDadosCliente();

        Endereco endereco1 = new Endereco();
        System.out.println();
        System.out.println();
        endereco1.setLogadouro("Praça da Liberdade");
        endereco1.setEstado("MG");
        endereco1.setCidade("Belo Horizonte");
        endereco1.setBairro("Sion");
        endereco1.setCep("30.310-000");
        endereco1.setNumero(123);
        endereco1.setComplemento("Apto 101");
        endereco1.imprimirEndereco();

        Categoria categoria = new Categoria();
        System.out.println();
        System.out.println();
        categoria.setNomeCategoria("Eletrônicos");
        categoria.setDepartamento("Informática");
        categoria.imprimeCategoria();

        Produto produto1 = new Produto();
        System.out.println();
        System.out.println();
        produto1.setNomeProduto("Mouse");
        produto1.setValorProduto(20.00);
        produto1.setQuantidadeProduto(5);
        produto1.setQuantidadeTotal(100);
        produto1.decrementarEstoque();
        produto1.imprimeProduto();
        produto1.validarEstoque();
        System.out.println();
        produto1.verificarEstoqueMinimo();

        Orcamento orcamento = new Orcamento();
        System.out.println();
        System.out.println();
        orcamento.calculaValorTotal(produto1);
        orcamento.imprimeValorTotal();
        System.out.println();

        MeioDePgto meioDePgto = new MeioDePgto();
        System.out.println();
        System.out.println();
        meioDePgto.setNumParcelas(3);
        meioDePgto.setNomePagamento("Cartão de Crédito");
        meioDePgto.setTaxaCartao(5.00);
        meioDePgto.imprimirDadosPagamento();
    }
}
