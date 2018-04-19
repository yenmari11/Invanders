
package invanders;

import java.awt.Color;

/**
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * 
 */
public interface EnemyFactoryMethod {

    public MovingObject createEnemy(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color, int vida, boolean vivo, int width, int heght);
}
