package project;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestTestClass {
	
	private TestClass obj;
	
	@Test
	public void testContructor() {
		obj = new TestClass();
		assertEquals(0, obj.getNumber());
	}
}
