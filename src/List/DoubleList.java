


package List;

import invanders.MovingObject;

/**
 * Clase que define las operaciones básicas que debe tener una lista doblemente
 * enlazada.
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018 Nombre de la clase: DoubleList
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
     * Método isEmpty
     *
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean isEmpty() {
        return first == null;
    }

    
    /**
     * Agrega un nuevo nodo al inicio de la lista. 
     * Método add
     *
     * @param enemy
     */
    public void add(MovingObject enemy) {
        // Define un nuevo nodo.
        DoubleNode New = new DoubleNode();
        // Agrega al valor al nodo.
        New.setEnemy(enemy);
        // Consulta si la lista esta vacia.
        if (isEmpty()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            last = New;
            first = last;
            // Caso contrario va agregando los nodos al inicio de la lista.
        } else {
            // Crea una copia de la lista.
            DoubleNode aux = first;
            // Recorre la lista hasta llegar al ultimo nodo.
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setNext(New);
            New.setPrevious(aux);
        }
        // Incrementa el contador de tamaño de la lista.
        size++;
    }

    /**
     * Método que la el tamaño de la lista.
     * método Size
     *
     * @return size
     */
    public int Size() {
        return size;
    }

    /**
     * Método que la el tamaño de la lista. 
     * método getSize
     *
     * @return counter
     */
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
     * Elimina un nodo que se encuentre en la lista ubicado por su posición.
     * Método remove
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
                last = first.getPrevious().getPrevious();
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
     * Elimina la lista.
     * Método clear
     */
    public void clear() {
        // Elimina el valor y la referencia a los demas nodos.
        first = null;
        last = null;
        // Reinicia el contador de tamaño de la lista a 0.
        size = 0;
    }

    /**
     * Obtiene el nodo en x posición de la lista.
     * Método getInPosition
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
     * Método edit
     *
     * @param numberR en la cual se encuentra el nodo a actualizar.
     * @param enemy nodo a editar
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

    /**
     * Intercambia la posición x de los nodos.
     * Método intercambiar
     *
     * @param enemyIndex
     * @param bossIndex
     */
    public void intercambiar(int enemyIndex, int bossIndex) {
        if (enemyIndex < size && bossIndex < size) {
            DoubleNode EnemyNode = first;

            for (int f = 0; f < enemyIndex; f++) {
                EnemyNode = EnemyNode.getNext();
            }

            DoubleNode BossNode = first;
            for (int y = 0; y < bossIndex; y++) {
                BossNode = BossNode.getNext();
            }

            int EnemyPosition = EnemyNode.getEnemy().getXPosition();
            int BossPosition = BossNode.getEnemy().getXPosition();

            EnemyNode.getEnemy().setXPosition(BossPosition);
            BossNode.getEnemy().setXPosition(EnemyPosition);

        }
    }

    /**
     * verifica cual es la posición menor en x de la lista. 
     * MenorPosiciónX
     *
     * @return int
     */
    public int MenorPosicionX() {
        DoubleNode nodo = first;
        int menor = 1000;
        int velocidad = 0;

        for (int f = 0; f < size; f++) {
            if (nodo.getEnemy().getXPosition() < menor) {
                menor = nodo.getEnemy().getXPosition();
                velocidad = nodo.getEnemy().getXVelocity();
            }
            nodo = nodo.getNext();
        }
        return menor + velocidad;
    }

    /**
     * verifica cual es la posición mayor en x de la lista. 
     * MayorPosiciónX
     *
     * @return int
     */
    public int MayorPosicionX() {
        DoubleNode nodo = first;
        int mayor = -1;
        int velocidad = 0;
        for (int f = 0; f < size; f++) {
            if (nodo.getEnemy().getXPosition() > mayor) {
                mayor = nodo.getEnemy().getXPosition();
                velocidad = nodo.getEnemy().getXVelocity();
            }
            nodo = nodo.getNext();
        }
        return mayor + velocidad;
    }

}
