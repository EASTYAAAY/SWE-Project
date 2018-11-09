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
    
    
    public pathColor(int length, String color){ 
        this.color = color; 
        this.pathlength = length; 
    }
   
    
}
