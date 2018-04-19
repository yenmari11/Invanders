
package invanders;

import java.awt.Color;

/**
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * 
 */
public class FactoryEnemy implements EnemyFactoryMethod {

    @Override
    public MovingObject createEnemy(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color, int vida, boolean vivo, int width, int heght) {
        if (vida == 1) {
            return new Enemy(xPosition, yPosition, xVelocity, yVelocity, color, vida, vivo, width, heght);
        }
        if (vida >= 2 && vida <= 5) {
            return new Boss(xPosition, yPosition, xVelocity, yVelocity, color, vida, vivo, width, heght);
        } else {
            return new EnemyR(xPosition, yPosition, xVelocity, yVelocity, color, vida, vivo, width, heght);
        }
    }

}
