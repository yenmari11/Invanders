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
public class Node {
    // Variable en la cual se va a guardar el valor.
   
    private Enemy enemy;
    private EnemyR enemyR;
    private Boss boss;
    // Variable para enlazar los nodos.
    private Node next;

    /**
     * Constructor que inicializamos el valor de las variables.
     * @param enemy
     * @param enemyR
     * @param boss
     */
    public void Node(Enemy enemy, EnemyR enemyR, Boss boss){
        this.enemy = enemy;
        this.boss = boss;
        this.enemyR = enemyR;
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
    
    public void setValor(int valor){
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node next){
       this.next = next; 
    }

 

}
