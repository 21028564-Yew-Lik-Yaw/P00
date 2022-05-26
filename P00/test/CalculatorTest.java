import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21028564, 26 May 2022 12:18:13 pm
 */

/**
 * @author 21028564
 *
 */
public class CalculatorTest {
	private int a, b, c;
	Calculator cal = new Calculator();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//Arrange for all methods in CalculatorTest class
		a = 4321;
		b = 1234;
		c = 0;
			
		cal = new Calculator();
	}
	
	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testAdd() {
		//Act
		int actual = cal.add(a, b); 
		
		//Assert
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		//Act
		int actual = cal.subtract(a, b);
		
		//Assert
		int expected = 3087;
		assertEquals(expected, actual);
	}
	
	public void testMultiply() {
		//Act
		int actual = cal.multiply(a, b);
		
		//Assert 
		int expected = 5332114;
		assertEquals(expected, actual);
	}
	
	public void testDivide() {
		//Act
		int actual = cal.divide(a, b);
		
		//Assert
		int expectedRoundUp = 3;
		assertEquals(expectedRoundUp, actual);
	}

		

	}


