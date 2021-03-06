package app.calculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class suitTest {
	@Test
	public void TestAddingTwoNumbers() {
		Calculator temp = new Calculator();
		assertTrue(temp.Compute("10+3") == 10+3);
	}
	@Test
	public void TestAddingError() {
		Calculator temp = new Calculator();
		assertFalse(temp.Compute("10+3") == 10);
	}
	@Test
	public void TestSubtractinTwoNumbers() {
		Calculator temp = new Calculator();
		assertTrue(temp.Compute("20-3") == 20-3);
	}
	@Test
	public void TestSubtractingError() {
		Calculator temp = new Calculator();
		assertFalse(temp.Compute("20-3") == 20);
	}
	@Test
	public void TestDivingTwoNumbers() {
		Calculator temp = new Calculator();
		
		assertTrue(temp.Compute("20/4") == 20/4);
	}
	@Test
	public void TestDividingError() {
		Calculator temp = new Calculator();
		assertFalse(temp.Compute("20/4") == -1);
	}
	@Test
	public void TestMultiplyingTwoNumbers() {
		Calculator temp = new Calculator();
		assertTrue(temp.Compute("5*4") == 5*4);
	}
	@Test
	public void TestMultiplyingError() {
		Calculator temp = new Calculator();
		assertFalse(temp.Compute("5*4") == -1);
	}
	@Test
	public void TestModdulusOfTwoNumbers() {
		Calculator temp = new Calculator();
		assertTrue(temp.Compute("5%4") == 5%4);
	}
	@Test
	public void TestModdulusError() {
		Calculator temp = new Calculator();
		assertFalse(temp.Compute("5%4") == -1);
	}
	@Test
	public void TestAddingWithANSNumbers() {
		Calculator temp = new Calculator();
		temp.Compute("10+7");
		assertTrue(temp.Compute("ans+3") == 17+3);
	}
	@Test
	public void TestSubtractingWithANSNumbers() {
		Calculator temp = new Calculator();
		temp.Compute("10-7");
		assertTrue(temp.Compute("ans-3") == 0);
	}
	@Test
	public void TestMultiWithANSNumbers() {
		Calculator temp = new Calculator();
		temp.Compute("2*2");
		assertTrue(temp.Compute("ans*2") == 8);
	}
	@Test
	public void TestDiviWithANSNumbers() {
		Calculator temp = new Calculator();
		temp.Compute("8/2");
		assertTrue(temp.Compute("ans/2") == 2);
	}
	@Test
	public void MultiAddition() {
		Calculator temp = new Calculator();
		assertTrue(temp.Compute("2+2+2") == 6);
	}
	@Test
	public void MultiSubtraction() {
		Calculator temp = new Calculator();
		assertTrue(temp.Compute("8-2-2") == 4);
	}
	@Test
	public void MultiMultiplication() {
		Calculator temp = new Calculator();
		assertTrue(temp.Compute("2*2*2") == 8);
	}
	@Test
	public void MultiDivision() {
		Calculator temp = new Calculator();
		assertTrue(temp.Compute("8/2/2") == 2);
	}
	
}
