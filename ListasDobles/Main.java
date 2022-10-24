
package ListasDobles;
import javax.swing.JOptionPane;
import java.*;

public class Main {

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        int opcion = 0, elemento;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un nodo al inicio \n"
                        + "2. Agregar un nodo al final\n"
                        + "3. Mostrar la lista de inicio a fin\n"
                        + "4. Mostrar al lista de fin a inicio\n"
                        + "5. Eliminar nodo al inicio\n"
                        + "6. Eliminar nodo al final\n"
                        + "7. Salir\n"
                        + "Que deseas hacer?", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el elemento del nodo",
                                "Agregando nodo al inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.AgregarAlInicio(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el elemento del nodo",
                                "Agregando nodo al final",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlFinal(elemento);
                        break;
                    case 3:
                        if (!lista.estVacia()) {
                            lista.mostrarListaInicioFin();
                        } else {
                            JOptionPane.showMessageDialog(null, "no hay nodos aun",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!lista.estVacia()) {
                            lista.mostrarListaFinInicio();
                        } else {
                            JOptionPane.showMessageDialog(null, "no hay nodos aun",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!lista.estVacia()) {
                            elemento = lista.EliminarDelInicio();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento,
                                    "Eliminando nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "no hay nodos aun",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 6:
                        if (!lista.estVacia()) {
                            elemento = lista.EliminarDelFinal();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento,
                                    "Eliminando nodo del final", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "no hay nodos aun",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "aplicacion finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion no registrada",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 7);
    }
}
