import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MeioDePgtoTest {
    @Test
    public void testValidaNumParcelasTrue(){
        MeioDePgto meioDePgto = new MeioDePgto();
        meioDePgto.setNumParcelas(3);
        assertTrue(meioDePgto.validarNumParcelas());
    }

    @Test
    public void testValidaNumParcelasFalse(){
        MeioDePgto meioDePgto = new MeioDePgto();
        meioDePgto.setNumParcelas(5);
        assertFalse(meioDePgto.validarNumParcelas());
    }

    
}
