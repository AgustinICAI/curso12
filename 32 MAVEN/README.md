[Link referencia](http://tutorials.jenkov.com/maven/maven-tutorial.html)


# Instalación
Añadir al path de de windows/linux el directorio bin de la descarga de maven
http://maven.apache.org/download.cgi


# Conceptos principales
## Fichero POM
- El fichero POM (Project Object Model) es la representación del proyecto.
- Escrito en XML
- Se definen de los recursos del proyecto: código fuente, código de prueba, las dependencias, si se utilizan JAR externos, etc. 
- El POM contiene referencias a todos estos recursos.
- El archivo POM debe ubicarse en el directorio raíz del proyecto al que pertenece.

## Build Life Cycles, Phases y Goals

- El proceso de construcción en Maven se divide en Build Life Cycles, Phases(fases) y Goals. Un **Life cycle** de construcción consiste en una secuencia de **Phases** de construcción, y cada Phase construcción consiste en una secuencia de **Goals**. 
- Cuando ejecutas Maven, le pasas un comando a Maven. Este comando es el nombre de un Build Life Cycle, Phase o Goal. 
    - Si se solicita la ejecución de un life cycle, se ejecutan todas las fases de construcción en ese life cycle. 
    - Si se solicita que se ejecute una fase, también se ejecutan todas las fases anteriores en la secuencia predefinida.

## Dependencies and Repositories

- Uno de los principales objetivos por los que se usa Maven es para definir las dependencias que necesita un proyecto. Las dependencias son archivos JAR externos que utiliza el proyecto. 
- Si las dependencias no se encuentran en el repositorio local de Maven, Maven las descarga de un repositorio central de Maven y las coloca en el repositorio local del equipo. Tanto los directorios remotos como los directorios locales son configurables.

# Maven POM Files

- El archivo POM describe qué construir pero no cómo construirlo.
- Cómo construirlo depende de las fases y goals de construcción de Maven. También se puden introducir goals personalizados si es necesario.
- Cada proyecto tiene un archivo POM. El archivo POM se llama pom.xml y debe ubicarse en el directorio raíz de su proyecto. 
- Un proyecto dividido en subproyectos generalmente tendrá un archivo POM para el proyecto principal y un archivo POM para cada subproyecto. 
- Esta estructura permite que el proyecto total se construya en un solo paso, o que cualquiera de los subproyectos se construya por separado.

Para obtener una referencia completa del archivo POM, consulte la Referencia de [POM de Maven](http://maven.apache.org/pom.html).