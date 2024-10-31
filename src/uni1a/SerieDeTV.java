/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private ArrayList<Temporada> listaTemporadas;  //lista de temporadas en la serie

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = new ArrayList<>();
    }
    
    //Método para agregar una temporada a la lista de temporadas
    public void agregarTemporada(Temporada temporada) {
    	listaTemporadas.add(temporada);
    }
    
    //Método para obtener lista de temporadas
    public ArrayList<Temporada> getListaTemporadas(){
    	return listaTemporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    @Override
    public void mostrarDetalles() {
    	System.out.println("------------------------------------------");
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("------------------------------------------");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("------------------------------------------");
        System.out.println("Detalles de la Temporada: ");
        System.out.println("------------------------------------------");
        for(Temporada temporada : listaTemporadas) {
        	
        	System.out.println("Cantidad total de episodios: " + temporada.getCantidadEpisodios());
        	System.out.println("Estado de la serie: " + temporada.getEstadoTemporada());
        	System.out.println("------------------------------------------");
        }
        System.out.println();
    }
}