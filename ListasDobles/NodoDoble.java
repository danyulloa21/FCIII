package ListasDobles;
public class NodoDoble {

    public int dato;
    NodoDoble siguiente, anterior;

    public NodoDoble(int elemento) {
        this(elemento, null, null);
    }

    public NodoDoble(int elemento, NodoDoble s, NodoDoble a) {
        dato = elemento;
        siguiente=s;
        anterior = a;
    }

}
