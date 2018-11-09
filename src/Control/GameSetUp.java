package Control;
import Model.Cities;
import Model.Players; 
import Model.destination; 
import Model.pathColor; 


import java.util.ArrayList;


/*
These are Destinations 
CA -> NY Length 4 
NY -> FL length 3 
FL -> TX length 3 
TX -> CA length 2 

These are color paths
CA -> NY Green 
NY -> FL Grey
FL -> TX Red
TX -> CA Grey
*/


public class GameSetUp {

	public static void main(String[] args){ // this will later be the veiw controller 
		initt();   
	}
        public static void initt(){ // this hard codes the board in. 
            Players p1 = new Players("ANN", "Green"); 
            Players p2 = new Players("BOB", "Blue"); 
            Cities ca = new Cities("CA"); 
            Cities ny = new Cities("NY");
            Cities fl = new Cities("FL");
            Cities tx = new Cities("TX");
            ca.setNear1(ny);
            ca.setNear2(tx);
            ny.setNear1(ca);
            ny.setNear2(fl);
            fl.setNear1(tx);
            fl.setNear2(ny);
            tx.setNear1(ca);
            tx.setNear2(fl);
            pathColor ca2ny = new pathColor("Green", 4); 
            pathColor ny2fl = new pathColor("Grey", 3);
            pathColor fl2tx = new pathColor("Red", 3);
            pathColor tx2ca = new pathColor("Grey", 2);    
            
        }

}
