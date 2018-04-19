/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invanders;

import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author Yendry Diaz Solis.
 */
public abstract class Object implements Drawable {

    int xPosition;
    int yPosition;
    Color color;
    boolean Colliding;

    public Object() {
    }

    ;
    
    // Constuctor for any Game Object
    public Object(int xPosition, int yPosition, Color color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;

    }

    public abstract Rectangle getBounds();

    // Gets the X position of any object
    public int getXPosition() {
        return xPosition;
    }

    // Gets the Y position of any object
    public int getYPosition() {
        return yPosition;
    }

    // Gets the color of any object
    public Color getColor() {
        return color;
    }

    // Sets the X position of any object
    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    // Sets the Y position of any object
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Sets the color of any object
    public void setColor(Color color) {
        this.color = color;
    }

    // Checks if the hitboxes of any two objects are intersecting
    public boolean Colliding(Object other) {
        Colliding = other.getBounds().intersects(this.getBounds());
        return Colliding;
    }

}
