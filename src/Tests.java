import static org.junit.jupiter.api.Assertions.*; 


class Tests {

	// test cases
	// one
	@org.junit.jupiter.api.Test
	
	void test() 
	{
		control ctrl = new control(); 
		assertEquals(true, ctrl.ValidPlayers() ); 
	}
	
	@org.junit.jupiter.api.Test
	void testss() 
	{
		Trains train = new Trains();
		//@Test
		assertEquals(false, train.LastMove());
	}

}
