package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class discoTest {

	@Test
	public void perimetroExteriorTest() {
		disco miDisco = new disco();
		Double valorObtenido  = miDisco.sacarPerimetroExterior(2.0);
		Double valorEsperado = 12.56;
		assertEquals(valorEsperado,valorObtenido);
	
	}

	@Test
	public void perimetroInteriorTest() {
		disco miDisco = new disco();
		Double valorObtenido  = miDisco.sacarPerimetroInterior(3.0);
		Double valorEsperado = 18.84;
		assertEquals(valorEsperado,valorObtenido);
	
	}
	 
	@Test
	public void superficieTest() {
		disco miDisco = new disco();
		Double valorObtenido  = miDisco.sacarSuperficie(2.0, 3.0);
		Double valorEsperado = 40.82;
		assertEquals(valorEsperado,valorObtenido);
	
	}
}
 