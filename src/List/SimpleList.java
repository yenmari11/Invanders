package List;

import invanders.MovingObject;

/**
 * Clase que define las operaciones básicas que debe tener una lista simple enlazada.
 * @author Yendry Diaz Solis.
 * @version 17/04/2018
 * Nombre de la clase: SimpleList
 * 
 */
public class SimpleList {

    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private Node first;
    // Variable para registrar el tamaño de la lista.
    private int size;

    /**
     * Constructor por defecto.
     */
    public void SimpleList() {
        first = null;
        size = 0;
    }

    /**
     * Consulta si la lista esta vacia.
     * Método isEmpty
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean isEmpty() {
        return first == null;
    }


    /**
     * Agrega un nuevo nodo al inicio de la lista.
     * Método add
     * @param enemy
     */
    public void add(MovingObject enemy) {

        // Define un nuevo nodo.
        Node New = new Node();
        // Agrega al valor al nodo.
        New.setEnemy(enemy);
        // Consulta si la lista esta vacia.
        if (isEmpty()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            first = New;
            // Caso contrario va agregando los nodos al inicio de la lista.
        } else {
            // Crea una copia de la lista.
            Node aux = first;
            // Recorre la lista hasta llegar al ultimo nodo.
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setNext(New);
        }

        // Incrementa el contador de tamaño de la lista.
        size++;
    }

    
    /**
     * Busca si existe un valor en la lista.
     * Método search
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
                // Avanza al siguiente. nodo.
                aux = aux.getNext();
            }
        }

        // Retorna el resultado de la bandera.
        return found;
    }
    
    /**
     * Método que la el tamaño de la lista. 
     * Método Size
     * @return size
     */
    public int Size() {
        return size;
    }

    /**
     * Elimina un nodo que se encuentre en la lista ubicado por su posición.
     * Método remove
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
            } // En caso que el nodo a eliminar este por el medio 
            // o sea el ultimo
            else {
                // Crea una copia de la lista.
                Node aux = first;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < index - 1; i++) {
                    aux = aux.getNext();
                }
                // Guarda el nodo siguiente al nodo a eliminar.
                Node next = aux.getNext();
                // Elimina la referencia del nodo apuntando al nodo siguiente.
                aux.setNext(next.getNext());
            }
            // Disminuye el contador de tamaño de la lista.
            size--;
        }
    }

    
     /**
     * Método que la el tamaño de la lista. 
     * método getSize
     * @return counter
     */
    public int getSize() {
        int counter = 0;
        Node aux = first;
        while (aux != null) {
            aux = aux.getNext();
            counter++;
        }
        return counter;
    }

    /**
     * Obtiene el nodo en x posición de la lista.
     * Método getInPosition
     * @param index
     * @return Un nodo.
     * @throws Exception
     */
    public Node getInPosition(int index) throws Exception {
        // Consulta si el valor existe en la lista.
        if (index < this.size) {
            // Crea una copia de la lista.
            Node aux = first;
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
     * Elimina la lista.
     * Método clear
     */
    public void clear() {
        // Elimina el valor y la referencia a los demas nodos.
        first = null;
        // Reinicia el contador de tamaño de la lista a 0.
        size = 0;
    }

    
    /**
     * Actualiza el valor de un nodo que se encuentre en la lista ubicado por su
     * posición.
     * Método edit
     * @param numberR en la cual se encuentra el nodo a actualizar.
     * @param enemy nodo a editar
     */
    public void edit(int numberR, MovingObject enemy) {
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if (numberR >= 0 && numberR < size) {
            // Consulta si el nodo a eliminar es el primero.
            if (numberR == 0) {
                // Alctualiza el valor delprimer nodo.
                first.setEnemy(enemy);
            } else {
                // En caso que el nodo a eliminar este por el medio 
                // o sea el ultimo
                Node aux = first;
                // Recorre la lista hasta llegar al nodo anterior al eliminar.
                for (int i = 0; i < numberR; i++) {
                    aux = aux.getNext();
                }
                // Alctualiza el valor del nodo.
                aux.setEnemy(enemy);
            }
        }
    }
    
    
    /**
     * verifica cual es la posición menor en x de la lista. 
     * MenorPosiciónX
     *
     * @return int
     */ 
    public int MenorPosicionX(){
        Node nodo = first;
        int menor =1000;
        int velocidad = 0;
        
        for (int f=0; f< size; f++){
            if (nodo.getEnemy().getXPosition()<menor){
                menor = nodo.getEnemy().getXPosition();
                velocidad = nodo.getEnemy().getXVelocity();
            }
            nodo = nodo.getNext();
        }
        return menor+velocidad;
    }
    
    
     /**
     * verifica cual es la posición mayor en x de la lista. 
     * MayorPosiciónX
     *
     * @return int
     */   
    public int MayorPosicionX(){
        Node nodo = first;
        int mayor = -1;
        int velocidad =0;
        for(int f=0; f<size; f++){
            if (nodo.getEnemy().getXPosition()>mayor){
                mayor = nodo.getEnemy().getXPosition();
                velocidad = nodo.getEnemy().getXVelocity();
            }
            nodo = nodo.getNext();
        }
        return mayor +velocidad;
    }
    


}
