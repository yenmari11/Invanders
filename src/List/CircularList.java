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
public class CircularList {

    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private Node first;
    // Puntero que indica el final de la lista o el ultimo nodo.
    private Node last;
    // Variable para registrar el tamaño de la lista.
    private int size;

    /**
     * Constructor por defecto.
     */
    public void CircularList() {
        first = null;
        last = null;
        size = 0;
    }

    /**
     * Consulta si la lista esta vacia.
     *
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Agrega un nuevo nodo al inicio de la lista.
     *
     * @param enemy
     */
    public void add(Enemy enemy) {

        // Define un nuevo nodo.
        Node New = new Node();
        // Agrega al valor al nodo.
        New.setEnemy(enemy);
        // Consulta si la lista esta vacia.
        if (isEmpty()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            first = New;
            last = New;
            // Y el puntero del ultimo debe apuntar al primero.
            last.setNext(first);
            // Caso contrario va agregando los nodos al inicio de la lista.
        } else {
            // Une el nuevo nodo con la lista existente.
            New.setNext(first);
            // Renombra al nuevo nodo como el inicio de la lista.
            first = New;
            last.setNext(first);
        }
        // Incrementa el contador de tamaño de la lista.
        size++;
    }

    /**
     * Busca si existe un valor en la lista.
     *
     * @param index
     * @return true si existe el valor en la lista.
     */
    public boolean search(int index) {
        // Crea una copia de la lista.
        Node aux = first;
        // Bandera para indicar si el valor existe.
        boolean found = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.

        while (aux != null && found != true) {
            // Consulta si el valor del nodo es igual al de referencia.
            if (index == 0) {
                // Canbia el valor de la bandera.
                found = true;
            } else {
                // Avanza al siguiente nodo.
                aux = aux.getNext();
            }
        }
        // Retorna el resultado de la bandera.
        return found;
    }

    public int Size() {
        return size;
    }

    /**
     * Consulta la posición de un elemento en la lista
     *
     * @param referencia valor del nodo el cual se desea saber la posición.
     * @return un valor entero entre [0,n] que indica la posición del nodo.
     * @throws Exception
     */
    /**
     * Elimina un nodo que se encuentre en la lista ubicado por su posición.
     *
     * @param index
     */
    public void remove(int index) {
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if (index >= 0 && index < size) {
            // Consulta si el nodo a eliminar es el primero
            if (index == 0) {
                // Elimina el primer nodo apuntando al siguinte.
                first = first.getNext();
                // Apuntamos con el ultimo nodo de la lista al inicio.
                last.setNext(first);
            } // En caso que el nodo a eliminar este por el medio 
            // o sea el ultimo
            else {
                // Crea una copia de la lista.
                Node aux = first;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < index - 1; i++) {
                    aux = aux.getNext();
                }
                if (aux.getNext() == last) {
                    aux.setNext(first);
                    last = aux;
                } else {
                    // Guarda el nodo siguiente del nodo a eliminar.
                    Node next = aux.getNext();
                    // Enlaza el nodo anterior al de eliminar con el 
                    // sguiente despues de el.
                    aux.setNext(next.getNext());
                    // Actualizamos el puntero del ultimo nodo
                }
            }

            // Disminuye el contador de tamaño de la lista.
            size--;
        }
    }

    /**
     * Obtiene el nodo en x posición de la lista
     *
     * @param index
     * @return Un nodo.
     * @throws Exception
     */
    public Node getInPosition(int index) throws Exception {
        // Consulta si el valor existe en la lista.
        if (index >= 0 && index < size) {
            // Consulta si la posicion es el inicio de la lista.
            if (index == 0) {
                // Retorna el valor del inicio de la lista.
                return first;
            } else {
                // Crea una copia de la lista.
                Node aux = first;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < index; i++) {
                    aux = aux.getNext();
                }
                // Retorna el valor del nodo.
                return aux;
            }
            // Crea una excepción de Posicion inexistente en la lista.
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }

    }

    /**
     * Elimina la lista
     */
    public void clear() {
        // Elimina el valor y la referencia a los demas nodos.
        first = null;
        // Elimina el valor y la referencia al primer nodo.
        last = null;
        // Reinicia el contador de tamaño de la lista a 0.
        size = 0;
    }

}
