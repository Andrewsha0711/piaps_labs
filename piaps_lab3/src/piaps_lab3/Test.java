package piaps_lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Pilot pilot = new Pilot();
		assertEquals(pilot.getId(), "DefaultPilotId");
		
	}
	
	@org.junit.jupiter.api.Test
	void setId_test() {
		Pilot pilot = new Pilot();
		pilot.setId("test");
		assertEquals(pilot.getId(), "test");
		
	}

}
