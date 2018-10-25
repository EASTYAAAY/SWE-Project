 

public class Players {
	
	String name;
	int moves;
	
	
	public Players(String n, int m)
	{
		this.name = n;
		this.moves = m;
		
	}

	public String getPlayer()
	{
		return this.name;
	}
	
	public boolean gameTurn()
	{
		if(moves > 2)
			return true;
		else
			return false;
	}
	
}
