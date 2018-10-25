import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*; 


class Tests {
	@org.junit.jupiter.api.Test
	
	void testValidPlayer() 
	{
		control ctrl = new control();  //number of players test
		assertEquals(true, ctrl.ValidPlayers() ); 
	}
	
	@org.junit.jupiter.api.Test
	void lastMove() // if last move for all players should start. 
	{
		Trains train = new Trains();
		//@Test
		assertEquals(false, train.LastMove());
	}
	
	@org.junit.jupiter.api.Test
	void validTurn()  // if its a valid move. 
	{
		Players pl = new Players(null, 0);
		assertEquals(false, pl.gameTurn());
	}
}
