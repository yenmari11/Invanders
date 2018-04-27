package List;

import invanders.MovingObject;

/**
 * Clase que define las operaciones básicas que debe tener una lista circular
 * simple.
 *
 * @author Yendry Diaz Solis.
 * @version 17/04/2018 Nombre de la clase: CircularList
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
     * Método isEmpty 
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
            last.setNext(New);
            // Une el nuevo nodo con la lista existente.
            New.setNext(first);
            // Renombra al nuevo nodo como el inicio de la lista.
           last = New;
           
        }
        // Incrementa el contador de tamaño de la lista.
        size++;
    }

    /**
     * Método que la el tamaño de la lista. 
     * Método Size
     *
     * @return size
     */
    public int Size() {
        return size;
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
                // Elimina el primer nodo apuntando al siguiente.
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
     * Obtiene el nodo en x posición de la lista. Método getInPosition
     *
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
     * Actualiza el valor de un nodo que se encuentre en la lista ubicado por su
     * posición.
     * Método edit
     *
     * @param numberR posición en la cual se encuentra el nodo a actualizar.
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
                Node aux = first;
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
            Node EnemyNode = first;

            for (int f = 0; f < enemyIndex; f++) {
                EnemyNode = EnemyNode.getNext();
            }

            Node BossNode = first;
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
     * 
     * Método MenorPosiciónX
     *
     * @return int
     */
    public int MenorPosicionX() {
        Node nodo = first;
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
     * Método MayorPosiciónX
     *
     * @return int
     */
    public int MayorPosicionX() {
        Node nodo = first;
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
