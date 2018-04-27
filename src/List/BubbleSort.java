/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;
import List.CircularList;

/**
 *
 * @author yenma
 */
public class BubbleSort {
    
    private Node first;
    private Node last;

    public BubbleSort() {
    
    }
    
        /**
     * Constructor por defecto.
     */
  
    /**
     * Constructor por defecto.
     * @param circular
     */
    
    /**
     * Constructor por defecto.
     * @param circular
     * @return list which is sorted
     * 
     * @throws java.lang.Exception
     */
    public CircularList bubbleSort(CircularList circular) throws Exception {
        int lengthlist=circular.Size();
        first =circular.getInPosition(0);
        last= circular.getInPosition(lengthlist-1);
        
        int aux=0;
        for(int i=0;i<lengthlist;i++){
            for(int j=0;j<lengthlist-1;j++){
                
                //System.out.println("posicion j :"+circular.getInPosition(j).getEnemy()+"  posicion j+1 : "+circular.getInPosition(j).getEnemy());
                if(circular.getInPosition(j+1).getEnemy().vida<circular.getInPosition(j).getEnemy().vida){
                    
                    aux=circular.getInPosition(j+1).getEnemy().vida;
                    circular.getInPosition(j+1).getEnemy().setVida(circular.getInPosition(j).getEnemy().vida);
                    circular.getInPosition(j).getEnemy().setVida(aux);
                    //circular.edit(j, aux.getEnemy());
                    //System.out.println("posicion j :"+circular.getInPosition(j).getEnemy().vida+"  posicion j+1 : "+circular.getInPosition(j).getEnemy().vida);
                }
                
            }
        }
        return circular;
        
    }
    
    private void swap(Node node1, Node node2) {
        Node aux = node1;
        Node aux2 = node2;
    node1=aux2;
    node2=aux;
    System.out.println("intercambio");
    System.out.println(node2.getEnemy().vida);
    System.out.println(node1.getEnemy().vida);
    System.out.println("intercambio");
}
public void ImprimeLista(CircularList circular) throws Exception {
        int lengthlist=circular.Size();

        
        Node aux=circular.getInPosition(0);
        for(int i=0;i<lengthlist;i++){
            System.out.println("El valor de la vida es: "+ circular.getInPosition(i).getEnemy().vida);
        }
        System.out.println("largo "+circular.Size());
    }
        
    }

    

