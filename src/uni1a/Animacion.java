package uni1a;

import java.util.ArrayList;

//Subclase Animacion que extiende de ContenidoAudiovisual
public class Animacion extends ContenidoAudiovisual {
	
	private String formato;
	private String estiloVisual;
	private String publicoObjetivo;
	private String produccion;
	private ArrayList<Actor> actores; //Lista de actores asociados (Asociación con Actor)
	
	public Animacion(String titulo, int duracionEnMinutos, String genero,
			String formato, String estiloVisual, String publicoObjetivo, String produccion) {
		super(titulo, duracionEnMinutos, genero);
		this.formato = formato;
		this.estiloVisual = estiloVisual;
		this.publicoObjetivo = publicoObjetivo;
		this.produccion = produccion;
		this.actores = new ArrayList<>();  //inicializamos la lista de actores
	}

	public void agregarActor(Actor actor) {
		actores.add(actor);
	}
	
	public ArrayList<Actor> getActores(){
		return actores;
	}
	
	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getEstiloVisual() {
		return estiloVisual;
	}

	public void setEstiloVisual(String estiloVisual) {
		this.estiloVisual = estiloVisual;
	}

	public String getPublicoObjetivo() {
		return publicoObjetivo;
	}

	public void setPublicoObjetivo(String publicoObjetivo) {
		this.publicoObjetivo = publicoObjetivo;
	}

	public String getProduccion() {
		return produccion;
	}

	public void setProduccion(String produccion) {
		this.produccion = produccion;
	}
	
	public void mostrarDetalles() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Detalles de la Animación: ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Formato: " + getFormato());
		System.out.println("EstiloVisual: " + getEstiloVisual());
		System.out.println("Público Objetivo: " + getPublicoObjetivo());
		System.out.println("Producido por: " + getProduccion());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Datos de los actores de doblaje: ");
		System.out.println("--------------------------------------------------------------------");
		for(Actor actor: actores) {
        	System.out.println("Nombre: "  + actor.getNombre());
        	System.out.println("Edad: " + actor.getEdad());
        	System.out.println("Ncionalidad: " + actor.getNacionalidad());
        	System.out.println("Otras animaciones en las que ha participado: " + actor.getOtrasPeliculas());
        	System.out.println("--------------------------------------------------------------------");
        }
		System.out.println();
	}
}
