package Model;

public class Trains {
	int TrainsLeft;
	public Trains() { // initial trains in the start. 
		
		TrainsLeft = 240; 
		
	}
	public int Trains_Left() {
		return TrainsLeft; 
	}
	public boolean LastMove() { // last move. 
		if (TrainsLeft > 2) {
			return false; 
		}else {
			return true; //
		}  
	}
}
