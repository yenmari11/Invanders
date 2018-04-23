package invanders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 * Clase EnemyR donde tiene caracteristicas del enemigo con resistencias.
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018 Nombre de la clase: EnemyR.
 *
 */
public class EnemyR extends MovingObject {

    private int width;
    private int height;
    private int vida = 1;
    private boolean vivo;

    ImageIcon alienR = new ImageIcon("images/alienR.gif");

    /**
     * Constructor de EnemyR
     *
     * @param xPosition
     * @param yPosition
     * @param xVelocity
     * @param yVelocity
     * @param color
     * @param vida
     * @param vivo
     * @param width
     * @param height
     */
    public EnemyR(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color, int vida, boolean vivo, int width, int height) {
        super(xPosition, yPosition, xVelocity, yVelocity, color, vida, vivo);
        this.vida = vida;
        this.width = width;
        this.height = height;
    }

    /**
     * Dibuja la nave enemiga EnemyR. Método draw
     *
     * @param g
     */
    @Override
    public void draw(Graphics g) {
        alienR.paintIcon(null, g, this.getXPosition(), this.getYPosition());
    }

    /**
     * Actualiza posición de x, y de la nave enemiga EnemyR. Método
     * actualizarPosicion
     *
     * @param xPosition
     * @param yPosition
     */
    @Override
    public void actualizarPosicion(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    /**
     * Actualiza la cantidad de vidas de la nave enemiga EnemyR. Método
     * actualizarVida
     *
     * @param vida
     */
    @Override
    public void actualizarVida(int vida) {
        this.vida = vida;
    }

// Gets the hitbox for normal enemies
    /**
     * Método getBounds
     *
     * @return enemyHitBox
     */
    @Override
    public Rectangle getBounds() {
        Rectangle enemyHitBox = new Rectangle(this.getXPosition(), this.getYPosition(), width, height);
        return enemyHitBox;
    }

    /**
     * Mueve a la nave. Método move.
     */
    @Override
    public void move() {
        xPosition += xVel;
    }

}
