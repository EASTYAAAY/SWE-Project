/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author admin
 */
public class destination {
    Cities first; //First city  
    Cities Second; // Second city 
    int length; // number of trains that it takes. 
    int points; // the points you get for doing this trip; 
    
    
    public destination(Cities first, Cities sec, int len, int points){
        this.first = first; 
        this.Second = sec; 
        this.length = len; 
        this.points = points; 
        
    }
    
    public boolean checkAgain(destination p1){
        if((p1.first.equals(this.Second)) && (p1.Second.equals(this.first))){
            return true; 
        }else{
            return false; 
        }
    }           
}
