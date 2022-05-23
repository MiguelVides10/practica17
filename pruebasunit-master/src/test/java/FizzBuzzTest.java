/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.pruebasunitarias.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author migue
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCalcular()
    {
        int numero=15;
        String expResult="FizzBuzz";
        String Result= new FizzBuzz().calcular(numero);
        assertTrue(expResult.equals(Result));
    }
    
}
