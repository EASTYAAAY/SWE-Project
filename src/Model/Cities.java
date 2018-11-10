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
public class Cities {
    String name; // name of the city. 
    
    Cities near1; //the nearby cicies
    int near1Length; 
    Cities near2; // the nearby cities. 
    int near2Length; 
    
    
    public Cities(String name)
    {
        this.name = name; 
    }
    
    public void setNear1(Cities near1)
    {
        this.near1 = near1; 
    }
    
    public void setNear2(Cities near2){
        this.near2 = near2; 
    }
    
}
