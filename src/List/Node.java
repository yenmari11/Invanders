
package List;

import invanders.MovingObject;

/**
 * Clase que define los elementos que debe tener un Nodo de la lista.
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * Nombre de la clase: Node
 */
public class Node {
    

    // Variable para enlazar los nodos.
    private Node next;
    private MovingObject enemy;

    /**
     * Constructor que inicializamos el valor de las variables.
     *
     * @param enemy
     */
    public void Node(MovingObject enemy) {
        this.enemy = enemy;
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
    public Node getNext() {
        return next;
    }

    /**
     * Método setNext.
     * @param next 
     */    
    public void setNext(Node next) {
        this.next = next;
    }

}
