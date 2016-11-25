package calc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest_v01 {
	
	private static Calculadora calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CalculadoraTest_v01.calc = new Calculadora();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		CalculadoraTest_v01.calc = null;
	}

	@Before
	public void setUp() throws Exception {
		calc.clear();
	}

	@After
	public void tearDown() throws Exception {
		calc.clear();
	}

	@Test
	public void testAdd_00() {
		calc.add(1);
		calc.add(1);
		assertEquals(2,calc.getResult());
		fail("Esta calculadora no sabe sumar");
	};
	@Test
	public void testAdd_01() {
		calc.add(1);
		calc.add(0);
		assertEquals(1,calc.getResult());
		fail("Esta calculadora no sabe sumar");
	};
	@Test
	public void testAdd_02() {
		calc.add(0);
		calc.add(1);
		assertEquals(1,calc.getResult());
		fail("Esta calculadora no sabe sumar");
	};

	@Test
	public void testSubstract() {
		calc.add(20);
		calc.substract(10);
		assertEquals(10,calc.getResult());
		fail("Esta calculadora no sabe dividir");
	}

	@Test
	public void testMultiply_00() {
		calc.add(0);
		calc.multiply(1);
		assertEquals(0,calc.getResult());
		fail("Esta calculadora no sabe multiplicar");
	}
	
	@Test
	public void testMultiply_01() {
		calc.add(10);
		calc.multiply(5);
		assertEquals(50,calc.getResult());
		fail("Esta calculadora no sabe multiplicar");
	}

	@Test
	public void testDivide() {
		calc.add(20);
		calc.divide(4);
		assertEquals(5,calc.getResult());
		fail("Esta calculadora no sabe dividir");
	}

	@Test
	public void testSquare() {
		calc.add(2);
		calc.square(3);
		assertEquals(8,calc.getResult());
		fail("Esta calculadora no sabe elevar al cuadrado");

	}

	@Test
	public void testSquareRoot() {
		calc.add(4);
		calc.squareRoot(2);
		assertEquals(2,calc.getResult());
		fail("Esta calculadora no sabe hacer raices");
	}

	@Test
	public void testClear() {
		calc.clear();
		assertEquals(0,calc.getResult());
		fail("No se borra la calculadora");
	}

	@Test
	public void testGetResult() {
		calc.add(1);
		assertEquals(1,calc.getResult());
		fail("Devuelve el resultado incorrecto");
	}

}
