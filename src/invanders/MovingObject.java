package invanders;

import java.awt.Color;

/**
 * Clase abstracta de los movimiento de objetos.
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018 Nombre de la clase: MovingObject
 */
public abstract class MovingObject extends Object implements Moveable {

    int xVel;
    int yVel;
    public int vida = 1;
    boolean vivo = true;

    // Constructor for any non controllable object
    /**
     * Constructor
     *
     * @param xPosition
     * @param yPosition
     * @param xVelocity
     * @param yVelocity
     * @param color
     * @param vida
     * @param vivo
     */
    public MovingObject(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color, int vida, boolean vivo) {
        super(xPosition, yPosition, color);
        this.xVel = xVelocity;
        this.yVel = yVelocity;
        this.vida = vida;
        this.vivo = vivo;

    }

    // Accessors and mutators for every part of the MovingGameObject constructor
    /**
     * Método getXVelocity
     *
     * @return xVel
     */
    public int getXVelocity() {
        return xVel;
    }

    /**
     * Método getYVelocity
     *
     * @return yVel
     */
    public int getYVelocity() {
        return yVel;
    }

    /**
     * Método setXVelocity
     *
     * @param xVelocity
     */
    public void setXVelocity(int xVelocity) {
        this.xVel = xVelocity;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * Método setYVelocity
     *
     * @param yVelocity
     */
    public void setYVelocity(int yVelocity) {
        this.yVel = yVelocity;
    }

    // Used to move non controllable objects
    /**
     * Mueve el objeto. Método move.
     */
    @Override
    public void move() {
        this.xPosition += xVel;
        this.yPosition += yVel;
    }

    /**
     * Actualiza la posición en x, y del objeto
     *
     * @param xPosition
     * @param yPosition
     */
    void actualizarPosicion(int xPosition, int yPosition) {

    }

    /**
     * Actualiza las vidas del objeto.
     *
     * @param vida
     */
    void actualizarVida(int vida) {

    }

    /**
     * Resta las vidas del objeto.
     */
    void restarVida() {

    }

}
