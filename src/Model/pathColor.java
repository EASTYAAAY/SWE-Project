/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author admin
 * 
 * this is the color of the path that a player can get.
 * this is the same as getting a train card. 
 * 
 */
public class pathColor {  
    int pathlength; 
    String color; 
    Cities first; 
    Cities second; 
    Players owner; 
    
    int currenttrains; 
    
    
    public pathColor(String color, int length){ 
        this.color = color; 
        this.pathlength = length; 
    }
   
    public void setOwner(Players p){ // this is the person that has 
        this.owner = p; 
    }
    
    public void setCurrentTrains(int cur){ 
        this.currenttrains = cur;
    }
    
}
