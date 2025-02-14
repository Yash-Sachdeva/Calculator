package demo4;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class CalculatorMainTest {

	Calculator c1 = new Calculator();
	@Test
	@Disabled
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testAdd() {
		
	
		c1.add(1, 2);
		System.out.println("Test case working");
		assert(false);
	}
}
