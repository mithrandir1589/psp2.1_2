import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Pruebas {

	/**
	 * Test para caso de prueba 1
	 */
	@Test
	public void testCalculos(){
		Calculos calculos = new Calculos(20, 0.00001, 6, 1, 0.20);
		assertEquals(0.55338, calculos.getX(),0.0001);
	}
	
	/**
	 * Test para caso de prueba 2
	 */
	@Test
	public void testCalculos2(){
		Calculos calculos = new Calculos(20, 0.00001, 15, 1, 0.45);
		assertEquals(1.75305, calculos.getX(),0.0001);
	}
	
	/**
	 * Test para caso de prueba 3
	 */
	@Test
	public void testCalculos3(){
		Calculos calculos = new Calculos(20, 0.000001, 4, 1, 0.495);
		assertEquals(4.60409, calculos.getX(),0.0001);
	}
}
