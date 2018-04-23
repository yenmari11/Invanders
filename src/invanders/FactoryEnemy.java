package invanders;

import java.awt.Color;

/**
 * Clase FactoryEnemy donde tiene caracteristicas del enemigo y dependiendo de
 * la cantidad de vidas se crea el enemigo necesario.
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018 Nombre de la clase: FactoryEnemy
 *
 */
public class FactoryEnemy implements EnemyFactoryMethod {

    /**
     * Crea el enemigo dependiendo de las vidas.
     *
     * @param xPosition
     * @param yPosition
     * @param xVelocity
     * @param yVelocity
     * @param color
     * @param vida
     * @param vivo
     * @param width
     * @param heght
     * @return
     */
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
