

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CribaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CribaTest
{

    @Test
    // No hay numeros primos
    public void testPrimos1()
    {
        int[] nullArray = Criba.metodo1(0);
        assertEquals(nullArray.length,0);
    }
    
    @Test
    // Hasta maximo el numero 2
    public void testPrimos2() {
        int[] minArray = Criba.metodo1(2);
        assertEquals(minArray.length,1);
        assertEquals(minArray[0],2);
	}

	@Test
	// Hasta máximo el numero 3
	public void testPrimos3() {
        int[] threeArray = Criba.metodo1(3);
        assertEquals(threeArray.length,2);
        assertEquals(threeArray[0],2);
        assertEquals(threeArray[1],3);
	}
	
	 @Test
    //Hasta máximo el numero 100
    public void testPrimos4() {
        int[] centArray = Criba.metodo1(100);
        assertEquals(centArray.length,25);
        assertEquals(centArray[24],97);
    }
}

