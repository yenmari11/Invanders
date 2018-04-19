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
public class DoubleNode {

    // Variable en la cual se va a guardar el valor.
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
    public MovingObject getEnemy() {
        return enemy;
    }

    public void setEnemy(MovingObject enemy) {
        this.enemy = enemy;
    }

    public void setValor(int valor) {
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }

}
