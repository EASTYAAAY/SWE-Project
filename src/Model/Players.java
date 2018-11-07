package Model;
public class Players {
	String name; // their name 
	int moves;
	String playersColor; 
	
	public Players(String n, int m, String color)
	{
		this.name = n;
		this.moves = m;
		this.playersColor = color; 
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

