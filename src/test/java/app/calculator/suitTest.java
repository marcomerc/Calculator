package app.calculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class suitTest {
	@Test
	public void TestAdding() {
		Calculator temp = new Calculator();
		assertTrue(temp.Compute("10+3") == 10+3);
	}
	@Test
	public void TestAddingError() {
		Calculator temp = new Calculator();
		System.out.println(temp.Compute("10+3"));
		assertFalse(temp.Compute("10+3") == 10);
	}

}
