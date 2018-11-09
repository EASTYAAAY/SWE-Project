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
    String first; //First city  
    String Second; // Second city 
    int length; // number of trains that it takes. 
    
    
    public destination(String first, String sec, int len){
        this.first = first; 
        this.Second = sec; 
        this.length = len; 
        
    }
    
    public boolean checkAgain(destination p1){
        if((p1.first.equals(this.Second)) && (p1.Second.equals(this.first))){
            return true; 
        }else{
            return false; 
        }
    }           
}
