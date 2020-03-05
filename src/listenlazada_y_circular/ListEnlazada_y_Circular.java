
package listenlazada_y_circular;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ListEnlazada_y_Circular {

    public static void main(String[] args) {
ListEnlazada lis = new ListEnlazada();
ListCircular lc=new ListCircular();

        int opc;
        int num;
        String ope;
Scanner sc=new Scanner (System.in);
 
       
    do
    {
        ope=JOptionPane.showInputDialog(null,"1.Ingresar" +"\n "+ "2.Visualizar"+"\n "+"3.Num Par"+"\n " + "4.Insertar LC"+"\n"+"5.Mostrar Lista Circular");
                                             
        
        switch(ope){
            case"1":
                  num = sc.nextInt();
                  lis.Ingresar(num);
                  
               break;
                
            case"2":
                    System.out.println("--------------------------------------------");
                    System.out.println("Datos de la lista enlazada");
                    lis.Visualizar();
                    
                   
               break;  
            
            case"3":
                     System.out.println("--------------------------------------------");
                     System.out.println("Numeros Pares");
                     lis.NumParle();
                     
               break;  
                
            case"4":    
                     System.out.println("--------------------------------------------");
                     System.out.println("Insertar datos a la lista circular");
                     
                     lc.insertar(lis.par);
                     
                break;  
            
            case "5":    
                     
                     if(!lc.estaVacia()) 
	                {
                           System.out.println("--------------------------------------------");
                           System.out.println("Muestra datos de la lista circular");
	                   lc.mostrarLista();
                        }
                 else
	                {
	                   JOptionPane.showMessageDialog(null, "aun no ahy nodos",
	                   "lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                    
                default:
                JOptionPane.showMessageDialog(null, "opcion invalida");
        }
        }
    while(!ope.equals("5"));
        
    }
}