package uni1a;

//Subclase Animacion que extiende de ContenidoAudiovisual
public class Animacion extends ContenidoAudiovisual {
	
	private String formato;
	private String estiloVisual;
	private String publicoObjetivo;
	private String produccion;
	
	public Animacion(String titulo, int duracionEnMinutos, String genero,
			String formato, String estiloVisual, String publicoObjetivo, String produccion) {
		super(titulo, duracionEnMinutos, genero);
		this.formato = formato;
		this.estiloVisual = estiloVisual;
		this.publicoObjetivo = publicoObjetivo;
		this.produccion = produccion;
		
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
		System.out.println("------------------------------------------");
		System.out.println("Detalles de la Animación: ");
		System.out.println("------------------------------------------");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Formato: " + getFormato());
		System.out.println("EstiloVisual: " + getEstiloVisual());
		System.out.println("Público Objetivo: " + getPublicoObjetivo());
		System.out.println("Producido por: " + getProduccion());
		System.out.println("------------------------------------------");
		System.out.println();
	}
	
	
}
