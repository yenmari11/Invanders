/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import invanders.MovingObject;



/**
 *
 * @author yenma
 */
public class Node {
    // Variable en la cual se va a guardar el valor.
   

    // Variable para enlazar los nodos.
    private Node next;
    private MovingObject a;

    /**
     * Constructor que inicializamos el valor de las variables.
     * @param enemy
     */
    public void Node(MovingObject a){
        this.a = a;
   
        this.next = null;
       
    } 
 
    //métodos get y set para los atributos.
    
    public MovingObject getEnemy(){
        return a;
    }
    
    public void setEnemy(MovingObject enemy){
        this.a = enemy;
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
