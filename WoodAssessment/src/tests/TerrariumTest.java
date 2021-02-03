package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Terrarium;
public class TerrariumTest {
	Terrarium t = new Terrarium();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void TestIfStringIsNull() {
		assertNotNull(t);
	}

}
