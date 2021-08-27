import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit2Test {

	@Test
	void test1() {
		Junit2 ob= new Junit2();
		int[] x= {5, 4, 87, 54 ,63 ,41 ,24 ,84 ,91};
		
		assertEquals(new Find(4, 91), ob.findMinMax(x));
	}
	
	@Test
	void test2() {
		Junit2 ob= new Junit2();
		int[] x= {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		
		assertEquals(new Find(5, 5), ob.findMinMax(x));
	}
	
	@Test
	void test3() {
		Junit2 ob= new Junit2();
		int[] x= {-5, -4, -87, -54, -63, -41, -24, -84, -91};
		
		assertEquals(new Find(-91, -4), ob.findMinMax(x));
	}

}