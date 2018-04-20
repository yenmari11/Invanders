
package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * sirve para que el juego pueda escuchar las teclas necesarias para que la nave pueda moverse, en este caso son las direccionales y el space del teclado.
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * Nombre de la clase: KeyboardController.
 *   
 * 
 * 
 */
public class KeyboardController implements KeyListener {

    private boolean[] keyStatus;

    public KeyboardController() {
        keyStatus = new boolean[256];
    }

    public boolean getKeyStatus(int keyCode) {
        if (keyCode < 0 || keyCode > 255) {
            return false;
        } else {
            return keyStatus[keyCode];
        }
    }

    public void resetController() {
        keyStatus = new boolean[256];
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        keyStatus[ke.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        keyStatus[ke.getKeyCode()] = false;
    }

}
