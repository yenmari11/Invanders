/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invanders;


import javax.swing.JFrame;

/**
 *
 * @author Yendry Diaz Solis.
 */
public class Frame extends JFrame 
{
    private Panel invaders;
    
    public Frame()
    {
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
    public static void main(String[] args) 
    {
         java.awt.EventQueue.invokeLater(() -> {
             new Frame().setVisible(true);
         });
    
    }
}
