package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        Actor actor1 = new Actor("Sam Worthington",48,"Australiano");
        Actor actor2 = new Actor("Zoe Saldaña",46,"Estadounidense");
        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        contenidos[0] = pelicula;
        
        SerieDeTV series = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        Temporada temporada = new Temporada(73,"Finalizada");
        series.agregarTemporada(temporada);
        contenidos[1] = series;
        
        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
        Investigador investigador1 = new Investigador("Carl Sagan",90,"Estadounidense","Astronomía,Astrofísica");
        Investigador investigador2 = new Investigador("Ann Druyan",75,"Estadounidense","Cosmología, Ciencia popular");
        Investigador investigador3 = new Investigador("Neil deGrasse Tyson",66,"Estadounidense","Astrofísica");
        documental.agregarInvestigador(investigador1);
        documental.agregarInvestigador(investigador2);
        documental.agregarInvestigador(investigador3);
        contenidos[2] = documental;

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}