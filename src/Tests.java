import static org.junit.jupiter.api.Assertions.*; 


class Tests {

	// test cases
	// one
	@org.junit.jupiter.api.Test
	
	void test() 
	{
		//ctrl.ValidPlayers();
		control ctrl = new control(); 

		//fail("Not yet implemented");
		assertEquals(true, ctrl.ValidPlayers() ); 
		//Trains train = new Trains();

		//@Test
		//assertEquals(false, train.LastMove());
	}
	
	
	void testss() {
Trains train = new Trains();
		//@Test
		assertEquals(true, train.LastMove());
	}

}
