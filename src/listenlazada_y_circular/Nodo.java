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
public class Nodo {
     private int dato;
    private Nodo siguiente;
    
    public Nodo(int n)
    {
        this.dato = n;
        siguiente = null;
    }
    
    public int getDato()
    {
        return dato;
    }
    
    public Nodo getSiguiente()
    {
        return siguiente;
    }
    
    public void Enlace(Nodo ap)
    {
        siguiente = ap;
    }
    
}
