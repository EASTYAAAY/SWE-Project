import java.util.List;
import Model.Players;
        

public class control {
	
	List <Players> Playlist; // initial list of players
	int numplayers; // number of players
	int experience; //their expereince level
	
	public control() { //default Constructor
		
	}
	
	public boolean ValidPlayers() { // >2 and <5 players only
		if(numplayers < 2 && numplayers > 5) {
			return false; 
		}
		return true; 
	}
		
}

