/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invanders;


import java.awt.Color;
/**
 *
 * @author Yendry Diaz Solis.
 */
public abstract class MovingObject extends Object implements Moveable{
    
    int xVel;
    int yVel;
    int vida = 1;
    boolean vivo =true;

    
    // Constructor for any non controllable object
    public MovingObject(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color, int vida, boolean vivo)
    {
        super(xPosition, yPosition, color);
        this.xVel = xVelocity;
        this.yVel = yVelocity;
        this.vida = vida;
        this.vivo = vivo;
    
    }
    
    // Accessors and mutators for every part of the MovingGameObject constructor
    public int getXVelocity()
    {
        return xVel;
    }
    public int getYVelocity()
    {
        return yVel;
    }
    public void setXVelocity(int xVelocity)
    {
        this.xVel = xVelocity;
    }
    public void setYVelocity(int yVelocity)
    {
        this.yVel = yVelocity;
    }
    
    // Used to move non controllable objects
    @Override
    public void move()
    {
        this.xPosition += xVel;
        this.yPosition += yVel;
    }
        
    void actualizarPosicion(int xPosition, int yPosition){
        
    }
    
    void actualizarVida(int vida){
        
    }
    void restarVida(){
        
    }
    
}
