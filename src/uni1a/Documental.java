/**
 * Class Documental
 */
package uni1a;

import java.util.ArrayList;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private ArrayList<Investigador> investigadores;  //lista de investigadores en el documental (Composición con investigador)

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

    //Método para agregar un investigador a la lista de investigadores
    public void agregarInvestigador(Investigador investigador) {
    	investigadores.add(investigador);
    }
    
    //Metodo para obtener la lista de investigadores
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
    	System.out.println("--------------------------------------------------------------------");
        System.out.println("Detalles del Documental:");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Datos del Investigador: ");
        System.out.println("--------------------------------------------------------------------");
        for(Investigador investigador : investigadores) {
        	System.out.println("Nombre: " + investigador.getNombre());
        	System.out.println("Edad: " + investigador.getEdad());
        	System.out.println("Nacionalidad: " + investigador.getNacionalidad());
        	System.out.println("Área de especialización: " + investigador.getAreaEspecializacion());
        	System.out.println("--------------------------------------------------------------------");
        }
        System.out.println();
    }
}