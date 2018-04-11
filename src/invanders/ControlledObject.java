/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invanders;


import Controller.KeyboardController;
import java.awt.Color;



/**
 *
 * @author Yendry Diaz Solis.
 */
public abstract class ControlledObject extends Object implements Moveable{
    
    KeyboardController control;
    
    //constructor
    
    public ControlledObject(int xPosition, int yPosition,Color color, KeyboardController control)
    {
        super(xPosition, yPosition, color);
        this.control = control;
    }
 
}
