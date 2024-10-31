# Proyecto de Contenidos Audiovisuales
## Objetivos y Propósito del Proyecto ##

El objetivo de este proyecto es ampliar y mejorar un sistema de gestión de contenidos audiovisuales utilizando conceptos avanzados de Programación Orientada a Objetos (POO) en Java, como la herencia, asociación, agregación y composición. Este sistema permite gestionar diferentes tipos de contenidos, como peliculas, series de televisión y documentales, facilitando la organización y manipulación de estos recursos.

El propósito principal es proporcionar una aplicación que permite a los usuarios gestionar su biblioteca  de contenidos audiovisuales, agregando nuevas funcionalidades  que mejoren la experiencia del usuario y optimicen la gestión de datos.

## Clases y Funcionalidades nuevas añadidas ##

### Nuevas Clases: ###
**1. Actor:** Relacionada por asociación con la clase Pelicula. Representa a un actor que participa en una película.  
**2. Temporada:** Relacionada por agregación con la clase SerieDeTv. Representa una temporada de una serie.  
**3. Investigador:** Relacionada por composición con la clase Documental. Representa a un investigador que crea documentales.  

### Subclases añadidas: ###
**1. Animacion:** Subclase de ContenidoAudiovisual que representa contenido animado.  
**2. Videojuego:** Subclase de ContenidoAudiovisual que representa videojuegos.  
**3. Podcast:** Subclase de ContenidoAudiovisual que representa episodios de podcast.  

### Funcionalidades nuevas: ###
- Gestión de actores asociados a películas.
- Gestión de temporadas asociadas a series.
- Gestión de investigadores asociados a documentales.
- Métodos para agregar y listar actores, temporadas e investigadores.
- Métodos en las nuevas subclases para manejar características específicas.

## Instruciones para Clonar y Ejecutar el Proyecto ##

**1.** Asegurate de tener Git instalado en tu sistema. Puedes verificarlo abriendo una terminal y ejecutando el siguiente comando:
     
	 git -- version
Si git está instalado, verás la versión correspondiente. Si no está instalado, descárgalo e instálalo desde https://git-scm.com/.  
**2.** Navega a la carpeta donde deseas clonar el proyecto.  
**3.** Haz clic derecho en la carpeta y selecciona "Open Git Bash Here". Esto abrirá una terminal de Git Bash en la ubicación seleccionada.  
**4.** Ejecuta el siguiente comando:
    
	git clone https://github.com/DarwinMendoza7/Contenido-Audiovisual.git
**5.** Para importar el proyecto a Eclipse haz lo siguiente:
- Abre Eclipse.
- Selecciona File luego Import y luego Existing Projects Into Workspace y pulsa en Next.
- Navega hasta la carpeta donde clonaste el proyecto y haz clic en Finish.  

**6.** En la vista de Proyecto, encuentra la clase PruebaAudiovisual, haz clic derecho sobre la clase y selecciona Run As y luego Java Application.

**Para clonar directamente desde Eclipse sigue estos pasos:**

**1.** Inicia Eclipse.  
**2.** Ve al menú File y selecciona la opción Import. Luego expande la carpeta Git y selecciona Projects from Git. A continuación, elige Clone URI y haz clic en Next.  
**3.** En el campo URI pega el enlace del repositorio que vas a clonar: https://github.com/DarwinMendoza7/Contenido-Audiovisual.git y completa el campo de Authentication con tus datos y haz clic en Next.  
**4.** En la selección de ramas (Branch Selection), marca la rama main o master según corresponda y haz click en Next.  
**5.** En local Destination, selecciona la carpeta donde deseas clonar el proyecto y asigna un nombre al proyecto en el campo correspondiente. Luego haz clic en Next.  
**6.** En la ventana Select a wizard to use for importing projects, selecciona Import using the New Project wizard y haz clic en Finish.  
**7.** Se abrirá una ventana donde debes seleccionar el tipo de proyecto, elige Java Project en la carpeta de Java.  
**8.** Aparecerá una ventana para crear el nuevo proyecto. Ingresa el nombre del proyecto que desees, desmarca la opción que dice Use default location, y escoge la carpeta donde se clonó el proyecto. Luego haz clic en Finish.  
**9.** Por último, navega a la clase Prueba Audiovisual, haz clic derecho sobre ella, selecciona Run As, y luego elige Java Application.  

## Mejoras adicionales implementadas ##
- **Optimización del Código:** Se revisaron y optimizaron algunos métodos para mejorar la eficacia y la claridad del código.
- **Documentación:** Se ha mejorado la documentación del código para facilitar su comprensión.
