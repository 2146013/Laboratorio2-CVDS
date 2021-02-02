# " Apache Maven"

![alt](maven.png)


El objetivo de Maven consiste en facilira el proceso de contruccion para los 
desarrolladores para esto se encuentran mejores precticas para la constuccion de 
los programas, lo desarrolladores prefieren Maven ya que cuenta con proporcionar 
un sistema de construccion uniforme.

# "Las Fases de Maven son:"

1. validate - validar que el proyecto es correcto y que toda la información necesaria está disponible
2. compile - compila el código fuente del proyecto
3. test- probar el código fuente compilado utilizando un marco de prueba unitario adecuado. Estas pruebas no deberían requerir que el  código esté empaquetado o implementado
4. package - tomar el código compilado y empaquetarlo en su formato distribuible, como un JAR.
5. verify - ejecutar las comprobaciones de los resultados de las pruebas de integración para garantizar que se cumplen los criterios de calidad
6. install - instalar el paquete en el repositorio local, para usarlo como una dependencia en otros proyectos localmente
7. deploy - hecho en el entorno de compilación, copia el paquete final en el repositorio remoto para compartirlo con otros desarrolladores y proyectos.

# "Ciclo de Vida"

Cada uno de estos ciclos de vida de compilación se define mediante una lista diferente de 
fases de compilación, en la que una fase de compilación representa una etapa del ciclo de vida.
El ciclo de vida de la compilación es una serie de etapas comunes a través de las cuales todas 
las compilaciones del proyecto progresan naturalmente. Los objetivos de los complementos están 
vinculados a etapas específicas del ciclo de vida.

# " Para qué sirven los plugins"

Los plugins son complementos que nos permiten ejecutar diferentes acciones como lo son 
crear un proyecto, crear archivos de tipo jar, crear archivos war, compilar código, 
código de prueba unitaria, crear documentacion entre otros.Estos nos permiten reutilizar
la logica de compilacion comun en varios proyectos.
Uno de los plugins mas usados y simples en Maven en Clean es responsable de eliminar el 
directorio de destino de un proyecto Maven. Cuando ejecuta "mvn clean", Maven ejecuta el 
objetivo "clean" tal como se define en el complemento Clean, y se elimina el directorio de destino

# " Que es y para que sirve el repositorio central"

Este repositorio contiene un gran numero de librerias que son compartidas por la comunidad de 
Maven pra el uso de sus proyectos individuales y asi tambien pueden ayudar y compartir a este repositorio
para poder colaborar y subir sus proyectos a este repositorio y asi tambien poder ayudar 
a otras personas.


## Compilar y Ejecutar

¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

Todas las instrucciones funcionan pero cada una muestra el mensaje que corresponde a cada caso.En el caso de que la entrada este en la clase enumeración se muetra un mensaje confirmando la creación del objeto como se muestra en la imagen siguiente:

![alt](Ejecuciones.png)


