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
    // Buscar libros según categoría
    public List<Llibre> buscarPerCategoria(String categoria) {
        List<Llibre> resultat = new ArrayList<>();

        for (Llibre llibre : llibres) {
            if (llibre.getCategoria().equalsIgnoreCase(categoria)) {
                resultat.add(llibre);
            }
        }

        return resultat;
    }
    // Ordenar libros según cantidad de prestaciones
    public List<Llibre> llibresMesPrestats() {
        List<Llibre> ordenats = new ArrayList<>(llibres);

        ordenats.sort((a, b) ->
            Integer.compare(b.getVegadesPrestat(), a.getVegadesPrestat())
        );

        return ordenats;
    }
    // Mostrar libros más prestados
    public void mostrarTopLlibres(int top) {
        List<Llibre> ordenats = llibresMesPrestats();

        System.out.println("=== Llibres més prestats ===");

        for (int i = 0; i < Math.min(top, ordenats.size()); i++) {
            Llibre l = ordenats.get(i);

            System.out.println(
                (i + 1) + ". " +
                l.getTitol() +
                " (" + l.getVegadesPrestat() + " préstecs)"
            );
        }
    }
}