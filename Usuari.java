import java.util.ArrayList;
import java.util.List;

public class Usuari {
    private String nom;
    private List<Llibre> llibresPrestats;

    public Usuari(String nom) {
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public List<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }

    public void afegirLlibre(Llibre llibre) {
        llibresPrestats.add(llibre);
    }

    public void retornarLlibre(Llibre llibre) {
        llibresPrestats.remove(llibre);
    }

    /*Metodos propios de la clase Usuario */

    //Listar usuarios
    public static void listarUsuaris(List<Usuari> usuaris) {
        for (Usuari usuari : usuaris) {
            System.out.println(usuari.getNom());
        }
    }

    //Eliminamos el Usuario teniendo en cuenta el nombre del usuario 
    public static void eliminarUsuari(List<Usuari> usuaris , String nomUsuario){
      usuaris.removeIf(u -> u.getNom().equalsIgnoreCase(nomUsuario));
    }

    //Buscar Usuario

    public static void buscarUsuario(List<Usuari> usuaris, String nomUsuario){
        Boolean encontrado = false;
        for (Usuari usuari : usuaris) {
            if (usuari.getNom().equalsIgnoreCase(nomUsuario)) {
                System.out.println("Usuario encontrado :" +  usuari.toString());
                encontrado = true;
                break;
            }
        }
         if (!encontrado) {
                System.out.println("El usuario" +  nomUsuario + "No existe");
            } 
    }

}