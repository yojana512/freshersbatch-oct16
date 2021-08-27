import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Junit1Test {

	@Test
	void test1() {
		Junit1 ob= new Junit1();
		int[] x= {5, 4, 87, 54 ,63 ,41 ,24 ,84 ,91};
		int[] res= {4, 91};
		assertArrayEquals(res, ob.findMinMax(x));
	}
	
	@Test
	void test2() {
		Junit1 ob= new Junit1();
		int[] x= {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		int[] res= {5, 5};
		assertArrayEquals(res, ob.findMinMax(x));
	}
	
	@Test
	void test3() {
		Junit1 ob= new Junit1();
		int[] x= {-5, -4, -87, -54, -63, -41, -24, -84, -91};
		int[] res= {-91, -4};
		assertArrayEquals(res, ob.findMinMax(x));
	}

}