package app.calculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class suitTest {
	@Test
	public void simpleTest() {
		int a = 1;
		int b = 2;
		assertTrue(a +b == 3);
	}
	@Test
	public void TestAdding() {
		Calculator temp = new Calculator();
		assertTrue(temp.Add(10, 3) == 10+3);
	}

}
