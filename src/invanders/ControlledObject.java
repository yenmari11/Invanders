package invanders;

import Controller.KeyboardController;
import java.awt.Color;

/**
 * Clase abstracta para controlar la nave.
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018 Método ControlledObject
 *
 */
public abstract class ControlledObject extends Object implements Moveable {

    KeyboardController control;

    
    /**
     * Constructor.
     *
     * @param xPosition
     * @param yPosition
     * @param color
     * @param control
     */
    public ControlledObject(int xPosition, int yPosition, Color color, KeyboardController control) {
        super(xPosition, yPosition, color);
        this.control = control;
    }

}
