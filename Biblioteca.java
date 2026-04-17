import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // PROPIEDADES DE CLASE
    private List<Llibre> llibres;

    // CONSTRUCTORES DE CLASE
    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }

    // MÉTODOS DE CLASE
    // Getters
    public List<Llibre> getLlibres() {
        return llibres;
    }
    // Agregar libro a la lista de libros
    public void afegirLlibre(Llibre llibre) {
        llibres.add(llibre);
    }
    // Buscar un libro según su título
    public Llibre buscarLlibre(String titol) {
        // Recorrer el listado de libros
        for (Llibre llibre : llibres) {
            // Si el título del libro es igual al título dado
            if (llibre.getTitol().equalsIgnoreCase(titol)) {
                // Devolver el libro
                return llibre;
            }
        }

        // Si no se encuentra el libro, devolver NULL
        return null;
    }

    
}