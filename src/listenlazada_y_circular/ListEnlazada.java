/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listenlazada_y_circular;



/**
 *
 * @author cesaralan
 */
public class ListEnlazada {
    Nodo inicio; // apuntador
    Nodo fin; // apuntador
    int par;
    
    public ListEnlazada()
    {
        inicio = null;
    }
    
    public boolean EstaVacia()
    {
        return inicio == null; // esta comparando
    }
    
    public void Ingresar(int n)
    {
        Nodo n1 = new Nodo(n);
        
        if (EstaVacia())
        {
            inicio = n1;
            fin = n1;
        }
        else
        {
            fin.Enlace(n1);
            fin = n1;
        }
        if(n%2==0)
         {
             ListCircular lc=new ListCircular();
             
             
             lc.insertar(n);
         }
         else
         {
////             System.out.println("El num es impar "+""+impar); 
            
             
         }
    }
    
    public void Visualizar()
    {
        Nodo p = inicio;
        while (p != null)
        {
            System.out.println(p.getDato());
            p = p.getSiguiente();
        }
        
        
    }
    
    public int NumParle()
 
    {   
        Nodo p = inicio; 
        while (p != null)
        {
         
        
//        n=sc.entrada.nextInt();
        if(p.getDato()%2==0)
         {
             ListCircular lc=new ListCircular();
             par=p.getDato();
             lc.insertar(par);
             System.out.println("El numero es par" + par);
             p=p.getSiguiente();
             
             
         }
         else
         {
////             System.out.println("El num es impar "+""+impar); 
             p=p.getSiguiente();
             
         }
       }
        return par;
   }
    
    
}