
package invanders;

import java.awt.Color;

/**
 * interface Factory para crear enemigos.
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * 
 */
public interface EnemyFactoryMethod {

    /**
     * createEnemy Factory Method
     * @param xPosition
     * @param yPosition
     * @param xVelocity
     * @param yVelocity
     * @param color
     * @param vida
     * @param vivo
     * @param width
     * @param heght
     * @return -
     * 
     */
    public MovingObject createEnemy(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color, int vida, boolean vivo, int width, int heght);
}
