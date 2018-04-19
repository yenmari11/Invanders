/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;
import invanders.MovingObject;
/**
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * 
 */
public class DoubleList {
        // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private DoubleNode first;
    private DoubleNode last;
    // Variable para registrar el tamaño de la lista.
    private int size;

     /**
     * Constructor por defecto.
     */
    public void DoubleList() {
        last = null;
        first = null;
        size = 0;
    }
        /**
     * Consulta si la lista esta vacia.
     *
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean isEmpty(){
        return first==null;
    }
    /**
     * Agrega un nuevo nodo al inicio de la lista.
     *
     * @param enemy
     */
    public void add(MovingObject enemy){
           // Define un nuevo nodo.
        DoubleNode New = new DoubleNode();
        // Agrega al valor al nodo.
        New.setEnemy(enemy);
        // Consulta si la lista esta vacia.
        if(isEmpty()){
             // Inicializa la lista agregando como inicio al nuevo nodo.
            last=New;
            first=last;
              // Caso contrario va agregando los nodos al inicio de la lista.
        } else{
             // Crea una copia de la lista.
            DoubleNode aux = first;
             // Recorre la lista hasta llegar al ultimo nodo.
            while(aux.getNext()!=null){
                aux = aux.getNext();   
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setNext(New);
            New.setPrevious(aux);   
        }
           // Incrementa el contador de tamaño de la lista.
        size++;
    }
    
        public int Size() {
        return size;
    }
    
    public int getSize() {
        int counter = 0;
        DoubleNode aux = first;
        while (aux != null) {
            aux = aux.getNext();
            counter++;
        }
        return counter;
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
                last= first.getPrevious().getPrevious();
            } // En caso que el nodo a eliminar este por el medio 
            // o sea el ultimo
            else {
                // Crea una copia de la lista.
                DoubleNode aux = first;
             
                // Recorre la lista hasta llegar al nodo anterior al eliminar.
                for (int i = 0; i < index - 1; i++) {
                    aux = aux.getNext();
                
                }
                // Guarda el nodo siguiente al nodo a eliminar.
                DoubleNode next = aux.getNext();
                DoubleNode previous = aux;
                // Elimina la referencia del nodo apuntando al nodo siguiente.
                
                aux.setNext(next.getNext());
                 aux.setPrevious(previous.getPrevious());
                
            }
            // Disminuye el contador de tamaño de la lista.
            size--;
        }
    }

    
        /**
     * Elimina la lista
     */
    public void clear() {
        // Elimina el valor y la referencia a los demas nodos.
        first = null;
        last= null;
        // Reinicia el contador de tamaño de la lista a 0.
        size = 0;
    }
    
    /**
     * Obtiene el nodo en x posición de la lista
     *
     * @param index
     * @return Un nodo.
     * @throws Exception
     */
    public DoubleNode getInPosition(int index) throws Exception {
        // Consulta si el valor existe en la lista.
        if (index < this.size) {
            // Crea una copia de la lista.
            DoubleNode aux = first;
            // COntado para almacenar la posición del nodo.

            // Recoore la lista hasta llegar al nodo de referencia.
            while (index > 0) {//&& aux != null ){

                aux = aux.getNext();
                index -= 1;
            }
            return aux;
        } else {
            throw new Exception("Valor inexistente en la lista.");

        }
        // Retorna el valor del contador.
        // Crea una excepción de Valor inexistente en la lista.

    }

    
        /**
     * Actualiza el valor de un nodo que se encuentre en la lista ubicado por su
     * posición.
     *
     * @param numberR en la cual se encuentra el nodo a actualizar.
     * @param enemy
     */
    public void edit(int numberR, MovingObject enemy) {
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if (numberR >= 0 && numberR < size) {
            // Consulta si el nodo a editar es el primero.
            if (numberR == 0) {
                // Alctualiza el valor del primer nodo.
                first.setEnemy(enemy);
            } else {
                // En caso que el nodo a eliminar este por el medio 
                // o sea el ultimo
                DoubleNode aux = first;
                // Recorre la lista hasta llegar al nodo anterior al eliminar.
                for (int i = 0; i < numberR; i++) {
                    aux = aux.getNext();
                  
                }
                // Actualiza el valor del nodo.
                aux.setEnemy(enemy);
            }
        }
    }
    
    
}
