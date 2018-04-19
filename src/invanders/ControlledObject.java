
package invanders;

import Controller.KeyboardController;
import java.awt.Color;
/**
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * 
 */
public abstract class ControlledObject extends Object implements Moveable {

    KeyboardController control;

    //constructor
    public ControlledObject(int xPosition, int yPosition, Color color, KeyboardController control) {
        super(xPosition, yPosition, color);
        this.control = control;
    }

}
