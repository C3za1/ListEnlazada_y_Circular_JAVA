
package listenlazada_y_circular;

import javax.swing.JOptionPane;

public class ListCircular {
NodoLC ultimo;
public ListCircular(){
ultimo=null;

}
//metodo para saber cuando la lista esta bacia
public boolean estaVacia(){
return ultimo==null;
}



//metodo para insertar nodos

public ListCircular insertar(int elemento){
NodoLC nuevo=new NodoLC (elemento);
if(ultimo!=null){
nuevo.siguiente=ultimo.siguiente;
ultimo.siguiente=nuevo;
}
ultimo=nuevo;
return this;
}



//metodo para rrecorer o mostrar la lista

public void mostrarLista(){
NodoLC auxiliar=ultimo.siguiente;
String cadena="";
do
{
cadena=cadena + "["+auxiliar.dato+"]->";
auxiliar=auxiliar.siguiente;
    System.out.println(auxiliar.dato);
}
while(auxiliar!=ultimo.siguiente);
JOptionPane.showMessageDialog(null,cadena, "Modtrando la lista circular",JOptionPane.INFORMATION_MESSAGE);
}

}
