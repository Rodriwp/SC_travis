package calc;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith (Parameterized.class)
public class CalculadoraTestParametrizada {
	
	private static Calculadora calc;
	private int inputNumber1;
	private int inputNumber2;
	private int expectedAddResult;
	
	public CalculadoraTestParametrizada(int n1, int n2, int nAdd){	
		inputNumber1 = n1;
		inputNumber2 = n2;
		expectedAddResult = nAdd;
}

	@Parameterized.Parameters
	public static Collection inputToTestAdd(){
		return Arrays.asList(new Object[][]{
			{1,1,2},
			{5,2,7},
			{500,0.5,500.5},
			{100,10,110},
		}
				);
		
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculadora();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		calc = null;
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
	public void testAdd_04() {
		 System.out.println("Numeros a sumar : " + 
inputNumber1 + " y " + inputNumber2);
		 calc.add(inputNumber1);
	 calc.add(inputNumber2);
	 assertEquals(expectedAddResult,calc.getResult());
	}

	@Test
	public void testAdd_00() {
		calc.add(1);
		calc.add(1);
		assertEquals(2,calc.getResult());
	};
	@Test
	public void testAdd_01() {
		calc.add(1);
		calc.add(0);
		assertEquals(1,calc.getResult());
	};
	@Test
	public void testAdd_02() {
		calc.add(0);
		calc.add(1);
		assertEquals(1,calc.getResult());
	};

	@Test
	public void testSubstract() {
		calc.add(20);
		calc.substract(10);
		assertEquals(10,calc.getResult());
	}

	@Test
	public void testMultiply_00() {
		calc.add(0);
		calc.multiply(1);
		assertEquals(0,calc.getResult());
	}
	
	@Test
	public void testMultiply_01() {
		calc.add(10);
		calc.multiply(5);
		assertEquals(50,calc.getResult());
	}

	//@Test(expected = ArithmeticException.class)
	@Test
	public void testDivide() {
		calc.add(20);
		calc.divide(0);
		assertEquals(5,calc.getResult());
	}

	@Test
	public void testSquare() {
		calc.add(2);
		calc.square(3);
		assertEquals(8,calc.getResult());
	}

	@Test(timeout = 1000)
	public void testSquareRoot() {
		calc.add(4);
		calc.squareRoot(2);
		assertEquals(2,calc.getResult());
	}

	@Test
	public void testClear() {
		calc.clear();
		assertEquals(0,calc.getResult());
	}

	@Test
	public void testGetResult() {
		calc.add(1);
		assertEquals(1,calc.getResult());
	}

}
