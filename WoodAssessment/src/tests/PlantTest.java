package tests;
import model.Plant;
import model.Terrarium;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlantTest {
	
	Plant plant = new Plant("High", 5, "Land");
	Terrarium t = new Terrarium("Land", 7, "Low");
	Plant p = new Plant();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIfPlantIstallerThanTerrarium() {
		
		assertTrue(t.getHabitatHeight() > plant.getHeight());
		
		plant.setHeight(4);
		
		assertFalse(t.getHabitatHeight() > plant.getHeight());
	}
	@Test
	public void testIfTypeIsNull()
	{
		assertNull(p);
	}

}
