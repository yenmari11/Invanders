package invanders;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 * Frame del juego.
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018 Nombre de la clase: Frame
 */
public class Frame extends JFrame {

    private Panel invaders;

    /**
     * Frame.
     *
     * @throws Exception
     */
    public Frame() throws Exception {
        super("Invaders");

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invaders = new Panel();
        invaders.setDoubleBuffered(true);

        this.getContentPane().add(invaders);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Start the game
        invaders.start();

    }

    /**
     * Main del Frame
     *
     * @param args
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Frame().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }
}
