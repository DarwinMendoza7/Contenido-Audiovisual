/**
 * Class Pelicula
 */
package uni1a;

import java.util.ArrayList;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> actores;  //Lista de actores en la pelicula (Asociación con Actor)

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }
    
    //	Método para agregar un actor a la lista de actores
    public void agregarActor(Actor actor) {
    	actores.add(actor);
    }
    
    //Método para obtener la lista de actores
    public ArrayList<Actor> getActores(){
    	return actores;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    @Override
    public void mostrarDetalles() {
    	System.out.println("--------------------------------------------------------------------");
        System.out.println("Detalles de la película:");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Datos de los actores: ");
        System.out.println("--------------------------------------------------------------------");
        for(Actor actor: actores) {
        	System.out.println("Nombre: "  + actor.getNombre());
        	System.out.println("Edad: " + actor.getEdad());
        	System.out.println("Ncionalidad: " + actor.getNacionalidad());
        	System.out.println("Otras películas en las que ha participado: " + actor.getOtrasPeliculas());
        	System.out.println("--------------------------------------------------------------------");
        }
        System.out.println();
    }
}