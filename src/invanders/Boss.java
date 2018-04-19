
package invanders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * 
 */
public class Boss extends MovingObject {

    private int width;
    private int height;
    private int vida;
    private boolean vivo;

    ImageIcon alienBoss = new ImageIcon("images/alienBoss.gif");

    public Boss(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color, int vida, boolean vivo, int width, int height) {
        super(xPosition, yPosition, xVelocity, yVelocity, color, vida, vivo);
        this.vida = vida;
        this.width = width;
        this.height = height;
    }

    @Override
    public void actualizarPosicion(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    @Override
    public void actualizarVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void draw(Graphics g) {
        alienBoss.paintIcon(null, g, this.getXPosition(), this.getYPosition());
    }

    @Override
    public void move() {
        xPosition += xVel;
    }

    // Gets the hitbox for normal eneimes
    @Override
    public Rectangle getBounds() {
        Rectangle enemyHitBox = new Rectangle(this.getXPosition(), this.getYPosition(), width, height);
        return enemyHitBox;
    }

}
