
package List;

import invanders.MovingObject;

/**
 * Clase que define los elementos que debe tener un Nodo de la lista.
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * Nombre de la clase: DoubleNode
 * 
 */
public class DoubleNode {

    // Variable en la cual se va a guardar el nodo.
    private MovingObject enemy;
    // Variable para enlazar los nodos.
    private DoubleNode next;
    private DoubleNode previous;

    /**
     * Constructor que inicializamos el valor de las variables.
     *
     * @param enemy
     */
    public void DoubleNode(MovingObject enemy) {
        this.enemy = enemy;
        this.previous = null;
        this.next = null;
    }

    

    
    
    //métodos get y set para los atributos.
    /**
     * Método getEnemy.
     * @return enemy
     */
    public MovingObject getEnemy() {
        return enemy;
    }

    /**
     * Método setEnemy.
     * @param enemy 
     */
    public void setEnemy(MovingObject enemy) {
        this.enemy = enemy;
    }

    /**
     * Método setValor.
     * @param valor 
     */
    public void setValor(int valor) {
    }
   

    /**
     * Método getNext.
     * @return next
     */
    public DoubleNode getNext() {
        return next;
    }

    /**
     * Método setNext.
     * @param next 
     */
    public void setNext(DoubleNode next) {
        this.next = next;
    }

    /**
     * Método getPrevious
     * @return previous
     */
    public DoubleNode getPrevious() {
        return previous;
    }

    /**
     * Método setPrevious
     * @param previous 
     */
    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }

}
