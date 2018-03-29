/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invanders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author yenma
 */
public class Bullet extends MovingObject {
    
    int diameter;
    int yVelocity;
    
    
    public Bullet(int xPosition, int yPosition, int diameter, Color color) {
        super(xPosition, yPosition,0, 0, color);
        this.diameter = diameter;
    }
 // Gets the diameter of the bullet
    public int getDiameter() {
        return diameter;
    }

    // Used to draw the bullet
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(this.getXPosition(), this.getYPosition(), 7, 15);

    }

    @Override
    public Rectangle getBounds() {
        Rectangle bulletHitbox = new Rectangle(xPosition, yPosition, 7, 15);
        return bulletHitbox;
    }   

}
