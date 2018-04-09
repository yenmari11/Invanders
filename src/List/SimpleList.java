
package List;

import invanders.Enemy;

/**
 *
 * @author Yendry Diaz Solis
 */

public class SimpleList {


    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private Nodo inicio;
    // Variable para registrar el tamaño de la lista.
    private int size;
     /**
     * Constructor por defecto.
     */
    public void SimpleList (){
        inicio = null;
        size = 0;
    }
      /**
     * Consulta si la lista esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){
        return inicio == null;
    }
    /**
     * Consulta cuantos elementos (nodos) tiene la lista.
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    //public int Size(){
      //  return size;
    //}
/**
     * Agrega un nuevo nodo al inicio de la lista.
     * @param valor
     */   
    public void add(Enemy enemy){
        
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setEnemy(enemy);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
        // Caso contrario va agregando los nodos al inicio de la lista.
        } else{
            // Une el nuevo nodo con la lista existente.
            nuevo.setNext(inicio);
            // Renombra al nuevo nodo como el inicio de la lista.
            inicio = nuevo;
        }
        // Incrementa el contador de tamaño de la lista.
        size++;
    }


  

             
/**
     * Busca si existe un valor en la lista.
     * @param index
     * @return true si existe el valor en la lista.
     */
    public boolean search(int index){
        // Crea una copia de la lista.
        Nodo aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (index == 0){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getNext();
            }
        }
    
        // Retorna el resultado de la bandera.
        return encontrado;
    }
    
    public int Size (){
        int contador = 0; 
        Nodo aux = inicio;
        while (aux!= null){
            contador+= 1;
            aux = aux.getNext();
            
        }   
        return contador;
    } 

/**
     * Consulta la posición de un elemento en la lista
     * @param referencia valor del nodo el cual se desea saber la posición.
     * @return un valor entero entre [0,n] que indica la posición del nodo. 
     * @throws Exception 
     */

    /**
     * Elimina un nodo que se encuentre en la lista ubicado
     * por su posición.
     * @param posicion en la cual se encuentra el nodo a eliminar.
     */
    public void remove(int index){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(index>=0 && index<size){
            // Consulta si el nodo a eliminar es el primero
            if(index == 0){
                // Elimina el primer nodo apuntando al siguinte.
                inicio = inicio.getNext();
            }
            // En caso que el nodo a eliminar este por el medio 
            // o sea el ultimo
            else{
                // Crea una copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < index-1; i++) {
                    aux = aux.getNext();
                }
                // Guarda el nodo siguiente al nodo a eliminar.
                Nodo next = aux.getNext();
                // Elimina la referencia del nodo apuntando al nodo siguiente.
                aux.setNext(next.getNext());
            }
            // Disminuye el contador de tamaño de la lista.
            size--;
        }
    }

    /**
     * Obtiene el nodo en x posición de la lista
     * @param index
     * @return Un nodo.
     * @throws Exception
     */
    public Nodo getInPosition(int index) throws Exception{
        // Consulta si el valor existe en la lista.
        if(index < this.size){
                    // Crea una copia de la lista.
            Nodo aux = inicio;
            // COntado para almacenar la posición del nodo.
            
            // Recoore la lista hasta llegar al nodo de referencia.
            while( index >0 ){//&& aux != null ){
                
                aux = aux.getNext();
                index -= 1;
            }
            return aux;
        }
        else{
            throw new Exception("Valor inexistente en la lista.");
          
        }
            // Retorna el valor del contador.
        // Crea una excepción de Valor inexistente en la lista.
   
    }
    
     /**
     * Elimina la lista
     */
    public void clear(){
        // Elimina el valor y la referencia a los demas nodos.
        inicio = null;
        // Reinicia el contador de tamaño de la lista a 0.
        size = 0;
    }

  
}

