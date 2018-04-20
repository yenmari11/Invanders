
package List;

import invanders.MovingObject;

/**
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * 
 */
public class Node {
    // Variable en la cual se va a guardar el valor.

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
    public MovingObject getEnemy() {
        return enemy;
    }

    public void setEnemy(MovingObject enemy) {
        this.enemy = enemy;
    }

    public void setValor(int valor) {
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    

}
