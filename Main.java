import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ===== INICIALIZACIÓN =====
        Biblioteca biblioteca = new Biblioteca();
        GestorBiblioteca gestor = new GestorBiblioteca();
        List<Usuari> usuaris = new ArrayList<>();

        // ===== LIBROS =====
        Llibre l1 = new Llibre("1984", "George Orwell", 0);
        Llibre l2 = new Llibre("El Quijote", "Cervantes", 1);
        Llibre l3 = new Llibre("Breve historia del tiempo", "Hawking", 2);
        biblioteca.afegirLlibre(l1);
        biblioteca.afegirLlibre(l2);
        biblioteca.afegirLlibre(l3);

        // ===== USUARIOS =====
        Usuari u1 = new Usuari("Carla");
        Usuari u2 = new Usuari("Joan");
        usuaris.add(u1);
        usuaris.add(u2);

        // ===== DEMOSTRACIÓN =====
        System.out.println("\n=== LLIBRES DISPONIBLES ===");
        for (Llibre l : biblioteca.getLlibres()) {
            System.out.println(l);
        }

        System.out.println("\n=== PRÉSTAMOS ===");
        gestor.prestarLlibre(u1, l1);
        gestor.prestarLlibre(u1, l2);
        gestor.prestarLlibre(u2, l3);

        System.out.println("\n=== HISTORIAL CARLA ===");
        u1.listarHistorial();

        System.out.println("\n=== HISTORIAL JOAN ===");
        u2.listarHistorial();

        System.out.println("\n=== BÚSQUEDA POR CATEGORÍA (CIENCIA) ===");
        for (Llibre l : biblioteca.buscarPerCategoria("Ciencia")) {
            System.out.println(l);
        }

        System.out.println("\n=== TOP LIBROS MÁS PRESTADOS ===");
        biblioteca.mostrarTopLlibres(3);

        System.out.println("\n=== ESTADÍSTICAS GENERALES ===");
        gestor.estadistiquesPrestecs();
    }
}