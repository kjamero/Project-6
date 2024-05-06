import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class PrimeNumberMethodTest {
	@Before
	public void setUp() throws Exception{
	}
	
	@Test
	public void testPrimeMethod() {
		PrimeNumberMethod p = new PrimeNumberMethod();
		int num = 2;
		for(int i = 1; i <= 50; i++) {
			assertTrue(PrimeNumberMethod.isPrime(num) == testIsPrime(num));
			num++;
		}
	}
	
	public static boolean testIsPrime(int num) {
		for (int divisor = 2; divisor <= num / 2; divisor ++) {
			if (num % divisor == 0) {
				return false;
			}	
		}
		return true;
	}
	
	

}
