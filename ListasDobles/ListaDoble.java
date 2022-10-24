

package ListasDobles;
import javax.swing.JOptionPane;
public class ListaDoble {
    private NodoDoble inicio, fin;
    public ListaDoble(){
    inicio=fin=null;
    }
    public boolean estVacia(){
    return inicio==null;
    }
    //metodo para agregar al final
    public void agregarAlFinal(int elemento){
        if (!estVacia()) {
            fin=new NodoDoble(elemento, null, fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new NodoDoble(elemento);
        }
    }
    //metodo para agregar al inicio
    public void AgregarAlInicio(int elemento){
    if (!estVacia()) {
            inicio=new NodoDoble(elemento, inicio,null );
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new NodoDoble(elemento);
        }
    }
    //metodo para mostrar lista
    public void mostrarListaInicioFin(){
        if (!estVacia()) {
            String datos="<=>";
            NodoDoble auxiliar=inicio;
            while(auxiliar!=null){
                datos=datos+"["+auxiliar.dato+"] <=>";
                auxiliar=auxiliar.siguiente;
                JOptionPane.showMessageDialog(null, datos, "Mostrar Lista de inicio a fin ", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public void mostrarListaFinInicio(){
        if (!estVacia()) {
            String datos="<=>";
            NodoDoble auxiliar=fin;
            while(auxiliar!=null){
                datos=datos+"["+auxiliar.dato+"] <=>";
                auxiliar=auxiliar.anterior;
                JOptionPane.showMessageDialog(null, datos, "Mostrar Lista de fin a inicio ", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    //eliminar del inicio
    public int EliminarDelInicio(){
        int elemento=inicio.dato;
        if (inicio==fin) {
            inicio=fin=null; 
        }else{
        inicio=inicio.siguiente;
        inicio.anterior=null;
        }
        return elemento;
    }
    
    public int EliminarDelFinal(){
    int elemento=fin.dato;
        if (inicio==fin) {
            inicio=fin=null;
        }else{
        fin=fin.anterior;
        fin.siguiente=null;
        }
        return elemento;
    }
}
