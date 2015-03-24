import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;


public class TestPrimeFactorGenerator {

	PrimeFactorizationGenerator generator = new PrimeFactorizationGenerator();
	
	@Test
	public void testOne() {
		assertEquals(list(1), generator.getList());
	}

	private List<Integer> list(Integer i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(i);
		return list;
	}

}
