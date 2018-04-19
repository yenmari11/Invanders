
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
public class EnemyR extends MovingObject {

    private int width;
    private int height;
    private int vida = 1;
    private boolean vivo;

    ImageIcon alienR = new ImageIcon("images/alienR.gif");

    public EnemyR(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color, int vida, boolean vivo, int width, int heght) {
        super(xPosition, yPosition, xVelocity, yVelocity, color, vida, vivo);
        this.vida = vida;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        alienR.paintIcon(null, g, this.getXPosition(), this.getYPosition());
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

}
