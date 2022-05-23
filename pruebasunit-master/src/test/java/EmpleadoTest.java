/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.pruebasunitarias.Empleado;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author migue
 */
public class EmpleadoTest {
    private static Empleado empleado;
    public EmpleadoTest() {
    }
    
    @BeforeAll
    public static void setUp() {
        empleado = new Empleado(1, "Carlos Lopez", 360);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testGetName()
    {
        String expResult= "Carlos Lopez";
        String result= empleado.getName();
        assertEquals(expResult, result);
    }
}
