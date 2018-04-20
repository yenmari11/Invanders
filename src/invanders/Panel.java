
package invanders;

import Controller.KeyboardController;
import List.DoubleList;
import List.SimpleList;
import List.CircularList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * 
 */
public class Panel extends JPanel {
    
    private Timer timer;
    private KeyboardController controller;
    SimpleList simpleList = new SimpleList();
    DoubleList doubleList = new DoubleList();
    CircularList circularList = new CircularList();
    EnemyFactoryMethod formarEnemy = new FactoryEnemy();
    Random generadorAleatorios = new Random();
 

    
    private final int Width = 800;
    private final int Height = 800;
    private final int framesPerSecond = 120;
    

    private int score = 0;
    private int velocidad = 2;
    private int limit = 6;
    private int numberR ;
    private int x;
    private int y;
    private int level = 1;
    private int numberOfLives=1;
    private int highScore;
    private int markerX, markerY;
   private static int bossHealth = 5; 
   private int numberVidas;
    File f = new File("Highscore.txt");   
    
        // Added Objects
    private Player player;
    private Player singleLife;
    //private Shield shield;
    private Bullet bullet;
    
    
        // Added Booleans
    private boolean newBulletCanFire = true;
    private boolean newBeamCanFire = true;
    private boolean hitMarker = false;
    

    private ImageIcon background = new ImageIcon("images/backgroundSkin.jpg");


    
    public final void setup() throws Exception {
       
        
        
                if(level==5){
            
            for (int row = 0;  row< 7; row++) {
                for (int column = 0; column < 1; column++) {
                
        
                  MovingObject enemy  = formarEnemy.createEnemy((200+(row*70)),(50 + (column * 60)),level, 10, null, 1, true,40,40); // Enemy speed will increase each level
                    circularList.add(enemy); 
                }

            }
            numberR = (int)(Math.random()*limit);
            numberVidas = (int)(Math.random()*bossHealth)+1;
            if(numberVidas==1){
                numberVidas+=1;
            System.out.println("Vidas de Boss:");
            System.out.println(numberVidas);
            }else{
                System.out.println("Vidas de enemigo:");
                System.out.println(numberVidas);
            }
            x= circularList.getInPosition(numberR).getEnemy().getXPosition();
            y = circularList.getInPosition(numberR).getEnemy().getYPosition();
            // System.out.println(x);
             //System.out.println(y);

             MovingObject enemy1 = formarEnemy.createEnemy(x,y,level,0,null,numberVidas,true,40,40);
             //System.out.println(numberR);
            circularList.edit(numberR, enemy1);
          
        }
        
        
        
        if(level==4){
            for (int row = 0;  row< 7; row++) {
                for (int column = 0; column < 1; column++) {
                
        
                  MovingObject enemy  = formarEnemy.createEnemy((200+(row*70)),(50 + (column * 60)),level, 10, null,1, true,40,40); // Enemy speed will increase each level
                    doubleList.add(enemy);
                    //System.out.println(doubleList.Size());
                }

            }
            //numberR = (int)(Math.random()*limit);
            numberR = generadorAleatorios.nextInt(7);
            numberVidas = (int)(Math.random()*bossHealth)+1;
            if(numberVidas==1){
                numberVidas+=1;
            System.out.println("Vidas de Boss:");
            System.out.println(numberVidas);
            }else{
                System.out.println("Vidas de enemigo:");
                System.out.println(numberVidas);
            }
            x= doubleList.getInPosition(numberR).getEnemy().getXPosition();
            y = doubleList.getInPosition(numberR).getEnemy().getYPosition();
     
             MovingObject enemy1 = formarEnemy.createEnemy(x,y,level,0,null,numberVidas,true,40,40);
             
    
            doubleList.edit(numberR, enemy1);
     
            
        }
        
    
        if (level == 3){
            for (int row = 0;  row< 7; row++) {
                for (int column = 0; column < 1; column++) {
                    
                       //MovingObject Enemigo = formarEnemy.createEnemy(PROPERTIES, PROPERTIES, ALLBITS, ALLBITS, Color.yellow, WIDTH, true)
                
        
                    MovingObject enemy  = formarEnemy.createEnemy((200+(row*70)),(50 + (column * 60)),level, 0, null, 1, true,40,40); // Enemy speed will increase each level
                    simpleList.add(enemy);
                } 
            }
        }
      
      
        if(level==2){
            
            for (int row = 0;  row< 7; row++) {
                for (int column = 0; column < 1; column++) {
                
        
                  MovingObject enemy  = formarEnemy.createEnemy((200+(row*70)),(50 + (column * 60)),level, 10, null, 1, true,40,40); // Enemy speed will increase each level
                    simpleList.add(enemy); 
                }

            }
            numberR = (int)(Math.random()*limit);
            numberVidas = (int)(Math.random()*bossHealth)+1;
            if(numberVidas==1){
                numberVidas+=1;
            System.out.println("Vidas de Boss:");
            System.out.println(numberVidas);
            }else{
                System.out.println("Vidas de enemigo:");
                System.out.println(numberVidas);
            }
            x= simpleList.getInPosition(numberR).getEnemy().getXPosition();
            y = simpleList.getInPosition(numberR).getEnemy().getYPosition();
            // System.out.println(x);
             //System.out.println(y);

             MovingObject enemy1 = formarEnemy.createEnemy(x,y,level,0,null,numberVidas,true,40,40);
             //System.out.println(numberR);
            simpleList.edit(numberR, enemy1);
            //System.out.println(simpleList.getSize()); 
        }
            if (level==7){
                //JOptionPane.showMessageDialog(null, "Congratulations");
                int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "You win the game with " + score + " points", 0);
            // If they choose to play again, this resets every element in the game
            if (answer == 0) {
                simpleList.clear();
                score = 0;
                level = 1;
                numberOfLives = 1;
                newBulletCanFire = true;
                newBeamCanFire = true;
                setup();
            }
            // If they choose not to play again, it closes the game
            if (answer == 1) {
                System.exit(0);
            }
                
            }
           

        // Resets all controller movement
        controller.resetController();

        // Sets the player's ship values   
        player = new Player(375, 730, null, controller);
        
  
    }
        
        ///////////////////////// PAINT
   
    @Override
    public void paint(Graphics g) 
    {
       
        // Sets background image
        background.paintIcon(null, g, 0, -150);

        // Draws the player's ship
        player.draw(g);  
        
        
        //Draws the aliens  
                if (level == 5) {
            g.setColor(Color.WHITE);
            g.drawString("Actual Row: Class C", 10, 20);
            g.drawString("Next Row: Class D", 10, 40);

            try {

                for (int index = 0; index < circularList.Size(); index++) {
                    circularList.getInPosition(index).getEnemy().draw(g);
                }

            } catch (IndexOutOfBoundsException e) {
            } catch (Exception ex) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        
        
        if (level == 2) {
            g.setColor(Color.WHITE);
            g.drawString("Actual Row: Class A", 10, 20);
            g.drawString("Next Row: Basic", 10, 40);

            try {

                for (int index = 0; index < simpleList.Size(); index++) {
                    simpleList.getInPosition(index).getEnemy().draw(g);
                }

            } catch (IndexOutOfBoundsException e) {
            } catch (Exception ex) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        if (level == 3) {
            g.setColor(Color.WHITE);
            g.drawString("Actual Row: Class Basic", 10, 20);
            g.drawString("Next Row: Class C", 10, 40);

            try {

                for (int index = 0; index < simpleList.Size(); index++) {
                    simpleList.getInPosition(index).getEnemy().draw(g);
                }

            } catch (IndexOutOfBoundsException e) {
            } catch (Exception ex) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (level == 4) {
            g.setColor(Color.WHITE);
            g.drawString("Actual Row: Class B", 10, 20);
            g.drawString("Next Row: Class C", 10, 40);

            try {

                for (int index = 0; index < doubleList.getSize(); index++) {

                    doubleList.getInPosition(index).getEnemy().draw(g);
                }

            } catch (IndexOutOfBoundsException e) {
            } catch (Exception ex) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        
        /**
        try {
         
            for (int index = 0; index < simpleList.Size(); index++) {
                simpleList.getInPosition(index).getEnemy().draw(g);
            }

        } catch (IndexOutOfBoundsException e) {
        } catch (Exception ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }**/
        
        
        
        
         // Draw a bullet on space bar press
        if (controller.getKeyStatus(32)) {
            if (newBulletCanFire) {
                bullet = new Bullet(player.getXPosition() + 22, player.getYPosition() - 20, 0, Color.RED);
                
                newBulletCanFire = false;
            }
        }
        // Only attempts to draw bullet after key press
        if (bullet != null) {
            bullet.draw(g);
        }
        
        
          // Sets the score display
        g.setColor(Color.WHITE);
        g.drawString("Score: " + score, 260, 20);
        
          // Sets level display
        g.setColor(Color.WHITE);
        g.drawString("Level " + level, 750, 20);
        
          // Sets Highscore display
        g.setColor(Color.WHITE);
        g.drawString("Highscore: " + highScore, 440, 20);
        
        
     }
    
    /////////// END PAINT
    
    
       //////////////////////////////////// UPDATE STATE
    
    public void updateState(int frame) throws Exception
    {
        // Allows player to move left and right
        player.move();

        // Updates highscore
        try {
            Scanner fileScan = new Scanner(f);
            while (fileScan.hasNextInt()) {
                String nextLine = fileScan.nextLine();
                Scanner lineScan = new Scanner(nextLine);
                highScore = lineScan.nextInt();
            }
        } catch (FileNotFoundException e) {
        }
        // Adds option to reset highScore
        if (controller.getKeyStatus(82)) {
            int answer = JOptionPane.showConfirmDialog(null, "Would you like to reset the high score?", ":)", 0);
            controller.resetController();
            if (answer == 0) {
                try {
                    String scoreString = Integer.toString(0);
                    try (PrintWriter printerWriter = new PrintWriter(new FileOutputStream(f, false))) {
                        printerWriter.write(scoreString);
                    }
                } catch (FileNotFoundException e) {
                }
            }
        }
        // Updates the high score text file if your score exceeds the previous high score
        try {
            if (score > highScore) {
                String scoreString = Integer.toString(score);
                try (PrintWriter printerWriter = new PrintWriter(new FileOutputStream(f, false))) {
                    printerWriter.write(scoreString);
                }
            }
        } catch (FileNotFoundException e) {
        }

                if (level == 5) {
            // Makes enemies move and change direction at borders
            if ((circularList.MayorPosicionX()>760 || circularList.MenorPosicionX()<0)) {
                for (int index = 0; index < circularList.Size(); index++) {
                    circularList.getInPosition(index).getEnemy().setXVelocity(circularList.getInPosition(index).getEnemy().getXVelocity() * -1);
                    circularList.getInPosition(index).getEnemy().setYPosition(circularList.getInPosition(index).getEnemy().getYPosition() + 10);
                }
            } else {
                for (int index = 0; index < circularList.Size(); index++) {
                    circularList.getInPosition(index).getEnemy().move();
                }
            }

        }
        
        
        if (level == 2 || level == 3) {
            // Makes enemies move and change direction at borders
            if ((simpleList.MayorPosicionX()>760 || simpleList.MenorPosicionX()<0)) {
                for (int index = 0; index < simpleList.Size(); index++) {
                    simpleList.getInPosition(index).getEnemy().setXVelocity(simpleList.getInPosition(index).getEnemy().getXVelocity() * -1);
                    simpleList.getInPosition(index).getEnemy().setYPosition(simpleList.getInPosition(index).getEnemy().getYPosition() + 10);
                }
            } else {
                for (int index = 0; index < simpleList.Size(); index++) {
                    simpleList.getInPosition(index).getEnemy().move();
                }
            }

        }
        
        if (level == 4) {

            /// Makes enemies move and change direction at borders
            if (doubleList.MayorPosicionX() > 760 || doubleList.MenorPosicionX() < 0) {
                for (int index = 0; index < doubleList.Size(); index++) {
                    doubleList.getInPosition(index).getEnemy().setXVelocity(doubleList.getInPosition(index).getEnemy().getXVelocity() * -1);
                    doubleList.getInPosition(index).getEnemy().setYPosition(doubleList.getInPosition(index).getEnemy().getYPosition() + 10);

                }
            } else {

                for (int index = 0; index < doubleList.Size(); index++) {
                    doubleList.getInPosition(index).getEnemy().move();

                }

            }

            for (int boss = 0; boss < doubleList.Size(); boss++) {
                if (doubleList.getInPosition(boss).getEnemy().vida != 1) {
                    if (doubleList.getInPosition(boss).getEnemy().xPosition % 50 == 0) {
                        numberR = generadorAleatorios.nextInt(doubleList.getSize());
                        doubleList.intercambiar(numberR, boss);
                        //System.out.println("hola");
                        //System.out.println(numberR);
                    }

                }
            }
        }


        
        
        /**
        // Makes enemies move and change direction at borders
        if ((simpleList.getInPosition(simpleList.Size() - 1).getEnemy().getXPosition() + simpleList.getInPosition(simpleList.Size() - 1).getEnemy().getXVelocity()) > 760 || (simpleList.getInPosition(0).getEnemy().getXPosition() + simpleList.getInPosition(0).getEnemy().getXVelocity()) < 0) {
            for (int index = 0; index < simpleList.Size(); index++) {
                simpleList.getInPosition(index).getEnemy().setXVelocity(simpleList.getInPosition(index).getEnemy().getXVelocity() * -1);
                simpleList.getInPosition(index).getEnemy().setYPosition(simpleList.getInPosition(index).getEnemy().getYPosition() + 10);
            }
        }else {
            for (int index = 0; index < simpleList.Size(); index++) {
                simpleList.getInPosition(index).getEnemy().move();
            }
        }
        **/
        
        
        
        
       
        // Move bullet
        if (bullet != null) 
        {
            bullet.setYPosition(bullet.getYPosition() - 15);
            if (bullet.getYPosition() < 0)
            {
                newBulletCanFire = true;
                
            }
            
            
                       if (level == 1) {
                // Checks for collisions with enemies
                for (int ind = 0; ind < circularList.Size(); ind++) {

                    if (bullet.Colliding(circularList.getInPosition(ind).getEnemy())) {
                        bullet = new Bullet(0, 0, 0, null);
                        newBulletCanFire = true;

                        //MovingObject enemy1;
                        if (circularList.getInPosition(ind).getEnemy().vida != 1) {
                            hitMarker = true;
                            markerX = circularList.getInPosition(ind).getEnemy().getXPosition(); // Gets positions that the "+1000" spawns off of
                            markerY = circularList.getInPosition(ind).getEnemy().getYPosition();
                            numberVidas -= 1;
                            System.out.println(numberVidas);

                            if (numberVidas == 0) {
                                hitMarker = true;
                                score += 1000;
                                do
                                   numberR = generadorAleatorios.nextInt(circularList.Size());
                                while (numberR== ind && circularList.Size()!=1);

                                
                                numberVidas = (int) (Math.random() * bossHealth) + 1;
                                if (numberVidas == 1) {
                                    numberVidas += 1;
                                    System.out.println("Vidas de Boss:");
                                    System.out.println(numberVidas);
                                } else {
                                    System.out.println("Vidas de enemigo:");
                                    System.out.println(numberVidas);
                                }
                                //circularList.intercambiar(ind, numberR);
                                circularList.getInPosition(ind).getEnemy().vida = numberVidas;
                                circularList.intercambiar(ind, numberR);
                                //circularList.remove(numberR);
                                circularList.remove(numberR);
                                System.out.println("paso cambio");

                            }
                        } else {

                            score += 100;
                            hitMarker = true;
                            markerX = circularList.getInPosition(ind).getEnemy().getXPosition(); // Gets positions that the "+ 100" spawns off of
                            markerY = circularList.getInPosition(ind).getEnemy().getYPosition();

                            circularList.remove(ind);

                        }

                    }

                }
            }

            
            
            
           if(level==3 || level==2){
            // Checks for collisions with enemies
            for (int ind = 0; ind < simpleList.Size(); ind++) {
                if (bullet.Colliding(simpleList.getInPosition(ind).getEnemy())) {
                    bullet = new Bullet(0, 0, 0, null);
                    newBulletCanFire = true;

                    // Updates score for normal levels
                    if (level == 3) {
                        score += 100;
                        hitMarker = true;
                        markerX = simpleList.getInPosition(ind).getEnemy().getXPosition(); // Gets positions that the "+ 100" spawns off of
                        markerY = simpleList.getInPosition(ind).getEnemy().getYPosition();
                        simpleList.remove(ind);
                        //System.out.println(simpleList.Size());

                    }
                    if (level == 2) {
                        //MovingObject enemy1;
                        if (simpleList.getInPosition(ind).getEnemy().vida != 1) {
                            hitMarker = true;
                            markerX = simpleList.getInPosition(ind).getEnemy().getXPosition(); // Gets positions that the "+1000" spawns off of
                            markerY = simpleList.getInPosition(ind).getEnemy().getYPosition() + 165;
                            numberVidas -= 1;
                            System.out.println(numberVidas);
                            if (numberVidas == 0) {
                                simpleList.clear();
                                score += 1000;

                            }
                        } else {
                            score += 100;
                            hitMarker = true;
                            markerX = simpleList.getInPosition(ind).getEnemy().getXPosition(); // Gets positions that the "+ 100" spawns off of
                            markerY = simpleList.getInPosition(ind).getEnemy().getYPosition();
                            simpleList.remove(ind);
                            //System.out.println(simpleList.Size());

                        }

                    }
                }

            }}
            
            
            if (level == 4) {
                // Checks for collisions with enemies
                for (int ind = 0; ind < doubleList.Size(); ind++) {
                    
                    if (bullet.Colliding(doubleList.getInPosition(ind).getEnemy())) {
                        bullet = new Bullet(0, 0, 0, null);
                        newBulletCanFire = true;


                        //MovingObject enemy1;
                        if (doubleList.getInPosition(ind).getEnemy().vida != 1) {
                            hitMarker = true;
                            markerX = doubleList.getInPosition(ind).getEnemy().getXPosition(); // Gets positions that the "+1000" spawns off of
                            markerY = doubleList.getInPosition(ind).getEnemy().getYPosition();
                            numberVidas -= 1;
                            System.out.println(numberVidas);

                            if (numberVidas == 0) {
                                doubleList.clear();
                                score += 1000;

                            }
                        } else {
                            score += 100;
                            hitMarker = true;
                            markerX = doubleList.getInPosition(ind).getEnemy().getXPosition(); // Gets positions that the "+ 100" spawns off of
                            markerY = doubleList.getInPosition(ind).getEnemy().getYPosition();

                            doubleList.remove(ind);

                        }

                    }

                }
            }
                
        } 
        
        
        
                
        if (level == 5) {
            //Destroys shields if aliens collide with them
            for (int input = 0; input < circularList.Size(); input++) {

                // If aliens exceed this X Position, you reset the level and lose a life
                if (circularList.getInPosition(input).getEnemy().getYPosition() + 50 >= 750) {
                    circularList.clear();

                    numberOfLives = 0;

                }
            }

            if (numberOfLives == 0) {

                int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "You lost the game with " + score + " points", 0);
                // If they choose to play again, this resets every element in the game
                if (answer == 0) {
                    circularList.clear();
                    score = 0;
                    level = 1;
                    numberOfLives = 1;
                    newBulletCanFire = true;
                    newBeamCanFire = true;
                    setup();
                }
                // If they choose not to play again, it closes the game
                if (answer == 1) {
                    System.exit(0);
                }
            }

            // Goes to next level, resets all lists, sets all counters to correct values
            if (circularList.isEmpty() || circularList.Size()==0) {
                level += 1;
                setup();
            }
        }
        
        
        
        
        if (level == 4) {
            //Destroys shields if aliens collide with them
            for (int input = 0; input < doubleList.Size(); input++) {

                // If aliens exceed this X Position, you reset the level and lose a life
                if (doubleList.getInPosition(input).getEnemy().getYPosition() + 50 >= 750) {
                    doubleList.clear();

                    numberOfLives = 0;

                }
            }

            if (numberOfLives == 0) {

                int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "You lost the game with " + score + " points", 0);
                // If they choose to play again, this resets every element in the game
                if (answer == 0) {
                    doubleList.clear();
                    score = 0;
                    level = 1;
                    numberOfLives = 1;
                    newBulletCanFire = true;
                    newBeamCanFire = true;
                    setup();
                }
                // If they choose not to play again, it closes the game
                if (answer == 1) {
                    System.exit(0);
                }
            }

            // Goes to next level, resets all lists, sets all counters to correct values
            if (doubleList.isEmpty()) {
                level += 1;
                setup();
            }
        }

        
        if (level == 2 || level == 3) {
            //Destroys shields if aliens collide with them
            for (int input = 0; input < simpleList.Size(); input++) {

                // If aliens exceed this X Position, you reset the level and lose a life
                if (simpleList.getInPosition(input).getEnemy().getYPosition() + 50 >= 750) {
                    simpleList.clear();

                    numberOfLives = 0;

                }
            }
            if (numberOfLives == 0) {

                int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "You lost the game with " + score + " points", 0);
                // If they choose to play again, this resets every element in the game
                if (answer == 0) {
                    simpleList.clear();
                    score = 0;
                    level = 1;
                    numberOfLives = 1;
                    newBulletCanFire = true;
                    newBeamCanFire = true;
                    setup();
                }
                // If they choose not to play again, it closes the game
                if (answer == 1) {
                    System.exit(0);
                }
            }

            // Goes to next level, resets all lists, sets all counters to correct values
            if (simpleList.isEmpty()) {
                level += 1;
                setup();
            }
        }
            
        
        
        
    }
    ////////////////////////////////////END UPDATE STATE
    
     /////////////////////////////////////////////////////// PANEL      

    /**
     *
     * @throws Exception
     */
    
     public Panel() throws Exception {
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
    

    
    
    /**
     * Method to start the Timer that drives the animation for the game. It is
     * not necessary for you to modify this code unless you need to in order to
     * add some functionality.
     */
   public void start() {
             // Set up a new Timer to repeat every 20 milliseconds (50 FPS)
        timer = new Timer(1000 / framesPerSecond, new ActionListener() {

            // Tracks the number of frames that have been produced.
            // May be useful for limiting action rates
            private int frameNumber = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Update the game's state and repaint the screen
                    updateState(frameNumber++);
                } catch (Exception ex) {
                    Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
                }
                repaint();
            }

     
        });
        Timer TimerHitMarker = new Timer(1000, (ActionEvent e) -> {
            // Update the game's state and repaint the screen
            hitMarker = false;
        } // Tracks the number of frames that have been produced.
        // May be useful for limiting action rates
        );

        timer.setRepeats(true);
        timer.start();
        TimerHitMarker.setRepeats(true);
        TimerHitMarker.start();   
    }
    
}
