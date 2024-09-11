import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class ItemDeOrcamentoTest {
    @Test
    public void testQuntidade(){
        ItemDeOrcamento itemDeOrcamento = new ItemDeOrcamento();
        Produto produto = new Produto();
        produto.setQuantidadeProduto(10);
        itemDeOrcamento.setQuantidade(produto);
        assertEquals(10, itemDeOrcamento.getQuantidade());
    }

    @Test
    public void testQuntidade0(){
        ItemDeOrcamento itemDeOrcamento = new ItemDeOrcamento();
        Produto produto = new Produto();
        produto.setQuantidadeProduto(0);
        itemDeOrcamento.setQuantidade(produto);
        assertEquals(0, itemDeOrcamento.getQuantidade());
    }
}
