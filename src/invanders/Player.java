package invanders;

import Controller.KeyboardController;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 * Clase Player donde tiene caracteristicas del la nave del jugador.
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018 Nombre de la clase: Player
 *
 */
public class Player extends ControlledObject {

    ImageIcon player = new ImageIcon("images/playerSkin.gif");

    // Constructor for all ship objects
    /**
     * Constructor
     *
     * @param xPosition
     * @param yPosition
     * @param color
     * @param control
     */
    public Player(int xPosition, int yPosition, Color color, KeyboardController control) {
        super(xPosition, yPosition, color, control);
    }

    // Draw player controlled ship
    /**
     * Dibuja la nave del jugador. Método draw.
     *
     * @param g
     */
    @Override
    public void draw(Graphics g) {
        player.paintIcon(null, g, this.getXPosition(), this.getYPosition());

    }

    // Gets the hit box for all ship objects
    /**
     * Método getBounds
     *
     * @return shipHitbox
     */
    @Override
    public Rectangle getBounds() {
        Rectangle shipHitbox = new Rectangle(this.getXPosition(), this.getYPosition(), 50, 50);
        return shipHitbox;
    }

    // Used to move all player objects
    /**
     * Mueve a la nave del jugador. Método move.
     */
    @Override
    public void move() {
        // Left arrow key press
        if (control.getKeyStatus(37)) {
            xPosition -= 10;
        }
        // Right arrow key press
        if (control.getKeyStatus(39)) {
            xPosition += 10;
        }

        // Move from edge to edge without stopping
        if (xPosition > 800) {
            xPosition = -50;
        }
        if (xPosition < -50) {
            xPosition = 800;
        }
    }
}
