package invanders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * Clase Bullet donde tiene caracteristicas de la bala.
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018 Nombre de la clase: Bullet
 */
public class Bullet extends MovingObject {

    int diameter;
    int yVelocity;

    /**
     * Constructor de Bullet
     *
     * @param xPosition
     * @param yPosition
     * @param diameter
     * @param color
     */
    public Bullet(int xPosition, int yPosition, int diameter, Color color) {
        super(xPosition, yPosition, 0, 0, color, 0, true);
        this.diameter = diameter;
    }

    /**
     * Obtiene el diametro de la bala.  Método getDiameter
     *
     * @return diameter
     */
    public int getDiameter() {
        return diameter;
    }

    /**
     * Dibuja la bala. Método draw
     *
     * @param g
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(this.getXPosition(), this.getYPosition(), 7, 15);

    }

    /**
     * Método getBounds
     *
     * @return bulletHitbox
     */
    @Override
    public Rectangle getBounds() {
        Rectangle bulletHitbox = new Rectangle(xPosition, yPosition, 7, 15);
        return bulletHitbox;
    }

}
