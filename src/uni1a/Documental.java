/**
 * Class Documental
 */
package uni1a;

import java.util.ArrayList;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private ArrayList<Investigador> investigadores;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

    public void agregarInvestigador(Investigador investigador) {
    	investigadores.add(investigador);
    }
    
    public ArrayList<Investigador> getInvestigadores(){
    	return investigadores;
    }
    
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Datos del Investigador: ");
        for(Investigador investigador : investigadores) {
        	System.out.println("Nombre: " + investigador.getNombre());
        	System.out.println("Edad: " + investigador.getEdad());
        	System.out.println("Nacionalidad: " + investigador.getNacionalidad());
        	System.out.println("Área de especialización: " + investigador.getAreaEspecializacion());
        }
        System.out.println();
    }
}