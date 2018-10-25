import java.util.List; 




public class control {
	
	List <Players> Playlist;
	int numplayers; 
	int experience;
	
	
	
	
	public control() {
		
	}
	public boolean ValidPlayers() {
		if(numplayers < 2 && numplayers > 5) {
			return false; 
		}
		return true; 
	}
	
	
	
	
	
	
}

