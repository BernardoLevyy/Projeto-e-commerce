import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class PagamentoTest {
    @Test 
    public void testPagamentoTrue() {
        Pagamento pagamento = new Pagamento();
        Orcamento orcamento = new Orcamento();
        Produto produto = new Produto();
        produto.setValorProduto(100.00);
        produto.setQuantidadeProduto(1);
        orcamento.calculaValorTotal(produto);
        orcamento.setPagamneto(100.00);
        pagamento.getValorTotalOrcamento();
        pagamento.statusPagemento();
        assertTrue(pagamento.statusPagemento());
    }   

    @Test 
    public void testPagamentoFalse() {
        Pagamento pagamento = new Pagamento();
        Orcamento orcamento = new Orcamento();
        Produto produto = new Produto();
        produto.setValorProduto(100.00);
        produto.setQuantidadeProduto(1);
        orcamento.calculaValorTotal(produto);
        pagamento.getValorTotalOrcamento();
        pagamento.statusPagemento();
        assertFalse(pagamento.statusPagemento());
    }   
}   
