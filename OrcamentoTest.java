
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OrcamentoTest {
    
    @Test
    public void testCalculaValorTotal(){
        Orcamento orcamento = new Orcamento();
        Produto produto = new Produto();
        produto.setQuantidadeProduto(10);
        produto.setValorProduto(50.00);
        orcamento.calculaValorTotal(produto);
        assertEquals(500.00, orcamento.getValorTotal());
    }

    @Test
    public void testValidaPagamentoTrue(){
        Orcamento orcamento = new Orcamento();
        Produto produto = new Produto();
        produto.setQuantidadeProduto(5);
        produto.setValorProduto(100.00);
        orcamento.calculaValorTotal(produto);
        orcamento.setPagamneto(500.00);
        orcamento.validaPagamento();
        assertTrue(orcamento.validaPagamento()); 
    }

    @Test
    public void testValidaPagamentoFalse(){
        Orcamento orcamento = new Orcamento();
        Produto produto = new Produto();
        produto.setQuantidadeProduto(1);
        produto.setValorProduto(100.00);
        orcamento.calculaValorTotal(produto);
        orcamento.setPagamneto(500.00);
        orcamento.validaPagamento();
        assertFalse(orcamento.validaPagamento());
    }
}
