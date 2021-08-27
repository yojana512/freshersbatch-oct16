import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Junit4Test {
	Junit4 LifecycleHooks;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Running before All.....");
	}
	
	@BeforeEach
	void init() {
		LifecycleHooks=new Junit4();
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Running After each method....");
	}
	
	@Test
	void testAdd() {
		int expected=5;
		int actual=LifecycleHooks.add(2,3);
		assertEquals(expected,actual,"This adds two numbers");
	}
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class,()->LifecycleHooks.divide(3, 0),"Divide by zero throws exception");
	}
	
	@Test
	void testCirclearea() {
		assertEquals(314.1592653589793,LifecycleHooks.circlearea(10.0),"This should return right circle area");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Running after all.....");
	}

}