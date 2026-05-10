import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {
    // PROPIEDADES DE CLASE
    private List<Prestec> prestecs;

    // CONSTRUCTORES DE CLASE
    public GestorBiblioteca() {
        this.prestecs = new ArrayList<>();
    }

    // MÉTODOS DE CLASE
    // Pedir prestado un libro para un usuario
    public void prestarLlibre(Usuari usuari, Llibre llibre) {
        // Si el libro no está prestado
        if (!llibre.esPrestat()) {
            // Pedir prestado el libro
            llibre.prestar();
            Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());
            prestecs.add(prestec);
            usuari.afegirLlibre(llibre);
            System.out.println(usuari.getNom() + " ha agafat el llibre: " + llibre.getTitol());
        } else {
            System.out.println("Aquest llibre ja està prestat.");
        }
    }
}