/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import invanders.Boss;
import invanders.Enemy;

/**
 *
 * @author yenma
 */
public class main {
    /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        SimpleList lista = new SimpleList();
        
        System.out.println("<<-- Ejemplo de lista simple -->>\n");
        
        Enemy enemy1 = new Enemy(0,0,0,0,null,0, true,0,0);
          Boss boss1 = new Boss(0,0,0,0,null,0,true,0,0);
           Enemy enemy2 = new Enemy(0,0,0,0,null,0,true,0,0);
             Boss boss2 = new Boss(0,0,0,0,null,0,true,0,0);
        int bossHealth=5;
           
        int numberVidas = (int)(Math.random()*bossHealth)+1;
        if (numberVidas==1){
            numberVidas+=1;
        System.out.println("random con 1");
        System.out.println(numberVidas);
                System.out.println("fin random 1");
        } else{
                           System.out.println("random");
        System.out.println(numberVidas);
                System.out.println("fin random");
        }

        
       lista.add(enemy1);

        lista.add(enemy2);
     
        lista.add(boss1);
   
     
        System.out.println("<<-- Lista -->>");
        
         
       // lista.listar();
        
        System.out.println("\n\n<<-- Tamaño -->");
        System.out.println(lista.getSize());
        
    
        System.out.println("\nElimina el nodo en la posición 1");
         // lista.remove(0);
          //lista.remove(1);
          //lista.remove(0);
          lista.edit(0, boss2);
           
        
          
          

        //lista.getInPosition(1);        
        //lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getSize());
        

        System.out.println("\nConsulta si la lista está vacia");
        System.out.println(lista.isEmpty());
        
        System.out.println("\n\n<<-- Fin de ejemplo lista simple -->>");
    }   
}

