/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import invanders.Boss;
import invanders.Enemy;
import invanders.EnemyR;

/**
 *
 * @author yenma
 */
public class DoubleNode {
    // Variable en la cual se va a guardar el valor.
   
    private Enemy enemy;
    private Boss boss;
    private EnemyR enemyR;
    
    // Variable para enlazar los nodos.
    private DoubleNode next;
    private DoubleNode previous;

    /**
     * Constructor que inicializamos el valor de las variables.
     * @param enemy
     * @param boss
     * @param enemyR
     */
    public void DoubleNode (Enemy enemy, Boss boss, EnemyR enemyR){
        this.enemy = enemy;
        this.boss = boss;
        this.enemyR = enemyR;
        this.previous = null;
        this.next = null;
    } 
    

    
    //métodos get y set para los atributos.
    

    public Enemy getEnemy(){
        return enemy;
    }
    public void setEnemy(Enemy enemy){
        this.enemy = enemy;
    }
    
    
    public Boss getBoss(){
        return boss;
    }
    public void setBoss(Boss boss){
        this.boss = boss;
    }
    
    
    public EnemyR getEnemyR(){
        return enemyR;
    }
    public void setEnemyR(EnemyR enemyR){
        this.enemyR = enemyR;
    }

    
    public void setValor(){
    }
    
    public DoubleNode getNext(){
        return next;
    }

    public void setNext(DoubleNode next){
       this.next = next; 
    }
    
    public DoubleNode getPrevious(){
        return previous;
    }
    
    public void setPrevious (DoubleNode previous){
        this.previous = previous;
    }

    
}
