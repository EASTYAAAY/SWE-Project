import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*; 


class Tests {

	// test cases
	// one
	@org.junit.jupiter.api.Test
	
	void testValidPlayer() 
	{
		//ctrl.ValidPlayers();
		control ctrl = new control(); 

		//fail("Not yet implemented");
		assertEquals(true, ctrl.ValidPlayers() ); 
		//Trains train = new Trains();

		//@Test
		//assertEquals(false, train.LastMove());
	}
	
	@org.junit.jupiter.api.Test
	void lastMove() 
	{
		Trains train = new Trains();
		//@Test
		assertEquals(false, train.LastMove());
	}
	
	@org.junit.jupiter.api.Test
	void validTurn() 
	{
		Players pl = new Players(null, 0);
		assertEquals(false, pl.gameTurn());
	}

}
