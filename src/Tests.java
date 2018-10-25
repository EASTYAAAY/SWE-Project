import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*; 


class Tests {

	// test cases
	
	@org.junit.jupiter.api.Test
	
	void testValidPlayer() 
	{
		control ctrl = new control(); 
		assertEquals(true, ctrl.ValidPlayers() ); 
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
