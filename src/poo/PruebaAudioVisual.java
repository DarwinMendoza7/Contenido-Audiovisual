package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[6];
        
        //Crear peliculas y actores
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        Actor actor1 = new Actor("Sam Worthington",48,"Australiano");
        Actor actor2 = new Actor("Zoe Saldaña",46,"Estadounidense");
        
        //Agregar actores a la pelicula
        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        
        //Agregar la pelicula al array de contenidos
        contenidos[0] = pelicula;
        
        //Crear series de tv y agregar temporadas
        SerieDeTV series = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        Temporada temporada = new Temporada(73,"Finalizada");

        //Agregar temporada a la serie
        series.agregarTemporada(temporada);
        
        //Agregar las series al array de contenidos
        contenidos[1] = series;
        
        //Crear documental e investigadores
        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
        Investigador investigador1 = new Investigador("Carl Sagan",90,"Estadounidense","Astronomía,Astrofísica");
        Investigador investigador2 = new Investigador("Ann Druyan",75,"Estadounidense","Cosmología, Ciencia popular");
        Investigador investigador3 = new Investigador("Neil deGrasse Tyson",66,"Estadounidense","Astrofísica");
        
        //Agregar investigadores al documental
        documental.agregarInvestigador(investigador1);
        documental.agregarInvestigador(investigador2);
        documental.agregarInvestigador(investigador3);
        
        //Agregar los documentales al array de contenidos
        contenidos[2] = documental;
        
        //Se crean instancias de diferentes tipos de contenido multimedia
        contenidos[3] = new Animacion("Los Simpson",25,"Comedia","2D","Caricaturesco",
        		"Todo tipo de público","Gracie Films 20th Television Animation");
        contenidos[4] = new Videojuego("The Last of Us",1200,"Acción, Aventura, Survival Horror",
        		"Play Station 3, Play Station 4, Play Station 5, PC","Realista","Si");
        contenidos[5] = new Podcast("The Wild Project","Jordi Wild","Dani el Rojo",165,"Sociedad y Cultura",
        		2023,"Español","Dani el Rojo");

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}