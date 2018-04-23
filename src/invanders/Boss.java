
package invanders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 * Clase Boss donde tiene caracteristicas del enemigo jefe.
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * Nombre de la clase: Boss
 * 
 */
public class Boss extends MovingObject {

    private int width;
    private int height;
    private int vida;
    private boolean vivo;

    ImageIcon alienBoss = new ImageIcon("images/alienBoss.gif");

    /**
     * Constructor de Boss.
     * @param xPosition
     * @param yPosition
     * @param xVelocity
     * @param yVelocity
     * @param color
     * @param vida
     * @param vivo
     * @param width
     * @param height 
     * método Boss
     */
    public Boss(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color, int vida, boolean vivo, int width, int height) {
        super(xPosition, yPosition, xVelocity, yVelocity, color, vida, vivo);
        this.vida = vida;
        this.width = width;
        this.height = height;
    }

    /**
     * Actualiza posición de x, y de la nave enemiga Boss.
     * Método actualizarPosicion
     * @param xPosition
     * @param yPosition 
     */
    @Override
    public void actualizarPosicion(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    /**
     * Actualiza la cantidad de vidas de la nave enemiga Boss.
     * Método actualizarVida
     * @param vida
     */
    @Override
    public void actualizarVida(int vida) {
        this.vida = vida;
    }
 
    /**
     * Dibuja la nave enemiga boss.
     * Método draw
     * @param g 
     */
    @Override
    public void draw(Graphics g) {
        alienBoss.paintIcon(null, g, this.getXPosition(), this.getYPosition());
    }

    /**
     * Mueve a la nave.
     * Método move.
     */
    @Override
    public void move() {
        xPosition += xVel;
    }

    // Gets the hitbox for normal enemies
    /**
     * Método getBounds
     * @return enemyHitBox
     */
    @Override
    public Rectangle getBounds() {
        Rectangle enemyHitBox = new Rectangle(this.getXPosition(), this.getYPosition(), width, height);
        return enemyHitBox;
    }

}
