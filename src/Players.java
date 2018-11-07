public class Players {
	String name; // their name 
	int moves;
	
	String playersColor; 
	
	public Players(String n, int m)
	{
		this.name = n;
		this.moves = m;
		
	}
	
	public String getPlayer()
	{
		return this.name;
	}
	
	public boolean gameTurn() // number of moves remaining. 
	{
		if(moves > 2)
			return true;
		else
			return false;
	}
	
}
