/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import invanders.Enemy;


/**
 *
 * @author yenma
 */
public class Nodo {
    // Variable en la cual se va a guardar el valor.
   
    private Enemy enemy;
    // Variable para enlazar los nodos.
    private Nodo next;

    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Nodo(Enemy enemy){
        this.enemy = enemy;
        this.next = null;
       
    } 
    
    
    //métodos get y set para los atributos.
    
    public Enemy getEnemy(){
        return enemy;
    }
    
    public void setEnemy(Enemy enemy){
        this.enemy = enemy;
    }
    
    public void setValor(){
    }
    
    public Nodo getNext(){
        return next;
    }
    
    public void setNext(Nodo next){
       this.next = next; 
    }

}
