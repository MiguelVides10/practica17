/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.pruebasunitarias.ImpresoraNumeros;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 

/**
 *
 * @author migue
 */
public class ImpresoraNumerosTest {
    
    public ImpresoraNumerosTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testImprimirNumeros()
    {
        int limite=0;
        Exception exception = assertThrows(RuntimeException.class, () -> {
            ImpresoraNumeros.imprimirNumeros(limite);
        });
        String respuestaEsperada="El limite debe de ser >=1";
        String respuestaRecibida= exception.getMessage();
        assertTrue(respuestaEsperada.equals(respuestaRecibida));
        
    }
    
    @Test
    public void testImprimirNumeros1()
    {
        int limite=1;
        int respuesta=8;
        assertEquals(respuesta, ImpresoraNumeros.imprimirNumeros1(limite));
    }
    
}
