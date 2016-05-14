package Test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import es.unileon.prg1.mastermind.Ficha;

public class FichaTest {
	Ficha oFicha=new Ficha();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEsValido() {
		char color='R';
		Assert.assertTrue(oFicha.esValido(color));
		
		char color2='T';
		Assert.assertFalse(oFicha.esValido(color));
	}
	
	@Test
	public void testColorIgual() {
		Ficha oFicha_1=new Ficha('C');
		Ficha oFicha_2=new Ficha('C');
		Ficha oFicha_3=new Ficha('G');	
		Assert.assertTrue(oFicha_1.colorIgual(oFicha_2));
		Assert.assertFalse(oFicha_1.colorIgual(oFicha_3));
	}
	
	@Test
	public void testgetColorl() {
		Ficha oFicha_1=new Ficha('B');
		
		Assert.assertEquals('C', oFicha_1.getColor());
	}
	

}
