import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class ProdutoTest {
    
    @Test
    public void testValidarEstoqueTrue(){
        Produto produto = new Produto();
        produto.setQuantidadeTotal(100);
        produto.validarEstoque();
        assertTrue(produto.validarEstoque());
    }

    @Test
    public void testValidarEstoqueFalse(){
        Produto produto = new Produto();
        produto.setQuantidadeTotal(0);
        produto.validarEstoque();
        assertFalse(produto.validarEstoque());
    }

    @Test
    public void testDecrementarEstoque(){
        Produto produto = new Produto();
        produto.setQuantidadeTotal(100);
        produto.setQuantidadeProduto(5);
        produto.decrementarEstoque();
        assertEquals(95, produto.getQuantidadeTotal());
    }

    @Test
    public void testValidarEstoqueMinimoFalse(){
        Produto produto = new Produto();
        produto.setQuantidadeTotal(0);
        produto.validarEstoqueMinimo();
        assertEquals(0, produto.validarEstoqueMinimo());
    }


    @Test
    public void testValidarEstoqueMinimoTrue(){
        Produto produto = new Produto();
        produto.setQuantidadeTotal(1000);
        produto.validarEstoqueMinimo();
        assertEquals(1, produto.validarEstoqueMinimo());
    }

    
}
