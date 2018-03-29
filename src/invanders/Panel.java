/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invanders;

import Controller.KeyboardController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Yendry Diaz Solis.
 */
class Panel extends JPanel {
    
    private Timer timer;
    private KeyboardController controller;
    
    private final int Width = 800;
    private final int Height = 800;
    private final int framesPerSecond = 120;
    
    Random r = new Random();
    private int score = 0;
    private int level = 1;
    private int numberOfLives = 3;
    private int highScore;
    private int markerX, markerY;
   // private static int bossHealth = 5; //////////////////////
    File f = new File("Highscore.txt");   
    
        // Added Objects
    private Player player;
    private Player singleLife;
    private Enemy enemy;
    //private Shield shield;
    private Bullet bullet;
    
    
        // Added Booleans
    //private boolean newBulletCanFire = true;
    //private boolean newBeamCanFire = true;
    //private boolean newBonusEnemy = true;
    private boolean hitMarker = false;
    

    private ImageIcon background = new ImageIcon("images/backgroundSkin.jpg");

    
    
    public final void setup(){
        
        if (level == 1){
            JOptionPane.showMessageDialog(null, "Welcome to Invaders!\n\nTHINGS TO KNOW:\n\n- Use left/right arrow keys to move\n- Press spacebar to shoot\n- The enemies get faster every level"
                    + "\n- BOSS every 3 levels\n- A bonus enemy will appear randomly\n- Shoot it for extra points!\n- Press R to reset high score\n- All pixel art is original\n- PLAY WITH SOUND\n\nHAVE FUN!");
        }
        if (level == 2){
            
       
            
        }
        
        
    }
     public Panel() {
        // Set the size of the Panel
        this.setSize(Width, Height);
        this.setPreferredSize(new Dimension(Width, Height));
        this.setBackground(Color.BLACK);

        // Register KeyboardController as KeyListener
        controller = new KeyboardController();
        this.addKeyListener(controller);

        // Call setupGame to initialize fields
        this.setup();
        this.setFocusable(true);
        this.requestFocusInWindow();
    }
    
    public void updateState(int i) 
    {
                
    }
    
    void start() {
             // Set up a new Timer to repeat every 20 milliseconds (50 FPS)
        timer = new Timer(1000 / framesPerSecond, new ActionListener() {

            // Tracks the number of frames that have been produced.
            // May be useful for limiting action rates
            private int frameNumber = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the game's state and repaint the screen
                updateState(frameNumber++);
                repaint();
            }

     
        });
        Timer TimerHitMarker = new Timer(1000, new ActionListener() {

            // Tracks the number of frames that have been produced.
            // May be useful for limiting action rates
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the game's state and repaint the screen
                hitMarker = false;
            }
        });

        timer.setRepeats(true);
        timer.start();
        TimerHitMarker.setRepeats(true);
        TimerHitMarker.start();   
    }
    
}
