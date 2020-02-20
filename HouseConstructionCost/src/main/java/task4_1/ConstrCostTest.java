package task4_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstrCostTest {

	@Test
	public void test() {
		HouseConst hc=new HouseConst();
		assertEquals(820800,hc.Construct("HighStandMatrl",456));
	}

}
