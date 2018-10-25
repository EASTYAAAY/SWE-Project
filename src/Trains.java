
public class Trains {

	int TrainsLeft;
	
	
	public Trains() {
		
		TrainsLeft = 240; 
		
	}
	
	
	public int Trains_Left() {
		return TrainsLeft; 
	}
	
	
	
	public boolean LastMove() {
		if (TrainsLeft > 2) {
			return false; 
		}else {
			return true; 
		} 
	}
}
