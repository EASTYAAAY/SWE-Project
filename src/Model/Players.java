package Model;

import java.util.ArrayList;


public class Players {
	String name; // their name 
	String playersColor; 
        
        int score; 
        
	
        
        
        
	public Players(String n, String color)
	{
		this.name = n;
		this.playersColor = color; 
	}
	
	public String getPlayer()
	{
		return this.name;
	}
	
}

