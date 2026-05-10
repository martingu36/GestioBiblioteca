public class Llibre {

    // Propietats de la Classe
    private String titol;
    private String autor;
    private boolean prestat;
    private String categoria;
    private int vegadesPrestat;
    
    public Llibre(String titol, String autor, int index) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
        this.categoria = setCategoria(index);
        this.vegadesPrestat = 0;
    }

    public String getCategoria (){
        return this.categoria;
    }

    public int getVegadesPrestat() {
        return vegadesPrestat;
    }

    public void actualitzaContador() {
        this.vegadesPrestat++;
    }

    //Enum de categories 
    public String setCategoria(int index){
        String [] categoria = {"Historia", "Literatura", "Ciencia", "Filosofía"};
        return categoria[index];
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public boolean esPrestat() {
        return prestat;
    }

    public void prestar() {
        prestat = true;
    }

    public void retornar() {
        prestat = false;
    }

    

    

    @Override
    public String toString() {
        return titol + " de " + autor + (prestat ? " (En préstec)" : " (Disponible)");
    }
}