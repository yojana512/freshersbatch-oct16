import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit3Test {

	@Test
	void test() {
		Junit3 ob= new Junit_3(15000);
		assertThrows(InsufficientFundsException.class, () -> ob.withdraw(20000));
	}

}