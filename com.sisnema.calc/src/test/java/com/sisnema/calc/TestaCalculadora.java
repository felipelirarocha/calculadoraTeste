package com.sisnema.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaCalculadora {
	Calculadora c = new Calculadora();
	@Test
	public void testOK() {
		assertEquals(7, c.soma(3, 4));
		
	}

	@Test
	public void testFail() {
		assertEquals(9, c.soma(3, 4));
		
	}

}
