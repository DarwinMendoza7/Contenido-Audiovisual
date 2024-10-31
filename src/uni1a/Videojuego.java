package uni1a;

public class Videojuego extends ContenidoAudiovisual {

	private String plataforma;
	private String estiloVisual;
	private String multijugador;
	
	public Videojuego(String titulo, int duracionEnMinutos, String genero,String plataforma,
			String estiloVisual,String multijugador) {
		super(titulo, duracionEnMinutos, genero);
		this.plataforma = plataforma;
		this.estiloVisual = estiloVisual;
		this.multijugador = multijugador;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getEstiloVisual() {
		return estiloVisual;
	}

	public void setEstiloVisual(String estiloVisual) {
		this.estiloVisual = estiloVisual;
	}

	public String getMultijugador() {
		return multijugador;
	}

	public void setMultijugador(String multijugador) {
		this.multijugador = multijugador;
	}
	
	public void mostrarDetalles() {
		System.out.println("Detalles de los Videojuegos :");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración aproximada en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Plataformas: " + getPlataforma());
		System.out.println("Estilo Visual: " + getEstiloVisual());
		System.out.println("Multijugador: " + getMultijugador());
		System.out.println();
	}
	
	
	
}
