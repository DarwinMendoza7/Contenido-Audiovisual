package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[6];
        
        //Crear peliculas y actores
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        Actor actor1 = new Actor("Sam Worthington",48,"Australiano","Furia de titanes, Terminator Salvation, Hasta el último hombre");
        Actor actor2 = new Actor("Zoe Saldaña",46,"Estadounidense","Guardianes de la Galaxia, Avengers, Star Trek");
        
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
        
        //Crear animacíon y actores de doblaje
        Animacion animacion = new Animacion("Los Simpson",25,"Comedia","2D","Caricaturesco",
        		"Todo tipo de público","Gracie Films 20th Television Animation");
        Actor actorAnimacion1 = new Actor("Humberto Vélez (Homero Simpson)",69, "Mexicano","Winnie the Pooh (Voz de Winnie), Shrek (voz de Lord Farquaad)");
        Actor actorAnimacion2 = new Actor("Nancy Mackenzie (Marge Simpson)",81, "Peruana", "Scooby-Doo (Daphne Black)");
        Actor actorAnimacion3 = new Actor("Claudia Motta (Bart Simpson)",53,"Mexicana","Spiderman (Voz de Mary Jane)");
        Actor actorAnimacion4 = new Actor("Nallely Solis (Lisa Simpson y Milhouse Van Houten)",41,"Mexicana","One Piece (voz de Tony Chopper), Pretty Cure (voz de Cure Blanca)");
        
        //Agregar actores a la animación
        animacion.agregarActor(actorAnimacion1);
        animacion.agregarActor(actorAnimacion2);
        animacion.agregarActor(actorAnimacion3);
        animacion.agregarActor(actorAnimacion4);
        //Agregar la animación al array de contenidos
        contenidos[3] = animacion;
        
        //Crear podcast e investigadores
        Podcast podcast = new Podcast("The Wild Project","Jordi Wild","Multiversos, Secuencia Fibonacci, Invierno Nuclear",
        		181,"Podcast de divulgación Científica",2022,"Español","Javier Santaolalla");
        Investigador investigadorPodcast = new Investigador("Javier Santaolalla",42,"Español","Físico, especializado en fisica de particulas e Ingeniero de telecomunicaciones");
        
        //Agregar investigadores al podcast
        podcast.agregarInvestigador(investigadorPodcast);
        
        //Agregar el podcast al array de contenidos
        contenidos[4] = podcast;
        
        //se agrega videojuego al array de contenidos
        contenidos[5] = new Videojuego("The Last of Us",1200,"Acción, Aventura, Survival Horror",
        		"Play Station 3, Play Station 4, Play Station 5, PC","Realista","Si");
       

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}