/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invanders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Yendry Diaz Solis.
 */
public class Enemy extends MovingObject {
    
    ImageIcon alien1 = new ImageIcon("images/alien1.gif");
    //ImageIcon alienBoss = new ImageIcon("images/alienBoss.gif");
    //ImageIcon alienR = new ImageIcon("images/alienR.gif");
    

    private int width;
    private int height;
    private int vida =1;
   private boolean vivo;

    public Enemy(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color,int vida, boolean vivo, int width, int height) {
        super(xPosition, yPosition, xVelocity, yVelocity, color, vida, vivo);
        this.vida = vida;
        this.width = width;
        this.height = height;

    }

   
    @Override
    public void actualizarPosicion(int xPosition, int yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    
    @Override
    public void actualizarVida(int vida){
        this.vida = vida;
    }

// Gets the hitbox for normal enemies
    @Override
    public Rectangle getBounds() {
        Rectangle enemyHitBox = new Rectangle(this.getXPosition(), this.getYPosition(), width, height);
        return enemyHitBox;
    }
    
    @Override
    public void move() {
        xPosition += xVel;
    }

    @Override
    public void draw(Graphics g) {
       
            alien1.paintIcon(null, g, this.getXPosition(), this.getYPosition());
       
       

    }

}
