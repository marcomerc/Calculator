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
		System.out.println(temp.Compute("10+3"));
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
		System.out.println(temp.Compute("20-3"));
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
		System.out.println(temp.Compute("20/4"));
		assertFalse(temp.Compute("20/4") == -1);
	}

}
