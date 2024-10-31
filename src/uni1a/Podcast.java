package uni1a;

//Subclase Podcast que extiende de ContenidoAudiovisual
public class Podcast extends ContenidoAudiovisual {

	private String podcast;
	private String presentador;
	private int añoPublicacion;
	private String idioma;
	private String listaInvitados;
	
	public Podcast(String podcast, String presentador,String titulo, int duracionEnMinutos, 
			String genero, int añoPublicacion, String idioma, String listaInvitados) {
		super(titulo, duracionEnMinutos, genero);
		this.podcast = podcast;
		this.presentador = presentador;
		this.añoPublicacion = añoPublicacion;
		this.idioma = idioma;
		this.listaInvitados = listaInvitados;
	}

	public String getPodcast() {
		return podcast;
	}

	public void setPodcast(String podcast) {
		this.podcast = podcast;
	}

	public String getPresentador() {
		return presentador;
	}

	public void setPresentador(String presentador) {
		this.presentador = presentador;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getListaInvitados() {
		return listaInvitados;
	}

	public void setListaInvitados(String listaInvitados) {
		this.listaInvitados = listaInvitados;
	}
	
	public void mostrarDetalles() {
		System.out.println("------------------------------------------");
		System.out.println("Detalles del Podcast: ");
		System.out.println("------------------------------------------");
		System.out.println("ID: " + getId());
		System.out.println("Podcast: " + getPodcast());
		System.out.println("Presentador: " + getPresentador());
		System.out.println("Título del episodio: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Año de publicación: " + getAñoPublicacion());
		System.out.println("Idioma: " + getIdioma());
		System.out.println("Invitados: " + getListaInvitados());
		System.out.println("------------------------------------------");
		System.out.println();
		
	}
	
	
}
