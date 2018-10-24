import java.util.List; 




public class control {
	
	List <Players> Playlist;
	int numplayers; 
	
	
	
	
	public control() {
		
	}
	public boolean ValidPlayers() {
		if(numplayers < 2 && numplayers > 5) {
			return false; 
		}
		return true; 
	}
}

