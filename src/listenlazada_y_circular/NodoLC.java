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
class NodoLC {
 int dato;
NodoLC siguiente;

//constructor
public NodoLC (int d)
{
dato=d;
siguiente=this;
}
}