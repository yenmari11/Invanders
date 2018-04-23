package invanders;

import java.awt.Color;
import java.awt.Rectangle;

/**
 * Clase abstracta de los objetos.
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018 Nombre de la clase: Object
 *
 */
public abstract class Object implements Drawable {

    int xPosition;
    int yPosition;
    Color color;
    boolean Colliding;

    /**
     * Object
     */
    public Object() {
    }

    ;
    
    // Constuctor for any Game Object
    /**
     * COnstructor
     * @param xPosition
     * @param yPosition
     * @param color 
     */
    public Object(int xPosition, int yPosition, Color color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;

    }

    /**
     * Método getBounds.
     *
     * @return -
     */
    public abstract Rectangle getBounds();

    // Gets the X position of any object
    /**
     * Método getXPosition.
     *
     * @return xPosition.
     */
    public int getXPosition() {
        return xPosition;
    }

    // Gets the Y position of any object
    /**
     * Método getYPosition
     *
     * @return yPosition
     */
    public int getYPosition() {
        return yPosition;
    }

    // Gets the color of any object
    /**
     * Método getColor.
     *
     * @return color
     */
    public Color getColor() {
        return color;
    }

    // Sets the X position of any object
    /**
     * Método setXPosition.
     *
     * @param xPosition
     */
    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    // Sets the Y position of any object
    /**
     * Método setYPosition
     *
     * @param yPosition
     */
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Sets the color of any object
    /**
     * Método setColor
     *
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    // Checks if the hitboxes of any two objects are intersecting
    /**
     * Métedo para verificar si hay colisión entre dos objetos.
     *
     * @param other
     * @return Colliding
     */
    public boolean Colliding(Object other) {
        Colliding = other.getBounds().intersects(this.getBounds());
        return Colliding;
    }

}
