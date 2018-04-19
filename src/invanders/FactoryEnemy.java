/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invanders;

import java.awt.Color;

/**
 *
 * @author yenma
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
