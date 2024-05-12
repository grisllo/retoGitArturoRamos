# Memoria retoGitArturoRamos
![portadaGit](img/portadaGit.png)

## 1.-Crea un repositorio nuevo que se llame retogit.
A través del botón New en la pestaña Repositories de la página principal de nuestro perfil de GitHub accedemos a esta primera ventana donde vamos a configurar las primeras opciones. 
Le damos un nombre al nuevo repositorio y le proporcionamos una descripción. Lo marcamos como público en este caso para que sea visible por necesidad de la última sección de este ejercicio. También le añadimos un README para detallar todo el proceso. De momento no especificamos la licencia. Pulsamos en Create repository y ya lo tenemos.
 
2.-Realiza la subida de la carpeta src de un proyecto en java.
Procedemos a la subida de archivos al proyecto a través del botón Add file/Upload files.
 
Arrastramos los archivos pertinentes de un proyecto de java a la caja de la ventana de GitHub y una vez estén estos preparados procedemos a realizar el Commit changes para registrar y confirmar esta acción.
 
El término commit es importante porque refleja que se va a realizar una instantánea de un momento específico del proyecto (función principal realmente de los repositorios como este). Estos, al final, son los cambios que podemos consultar y comentar de cualquier proyecto gestionado de esta manera. Es por esto que es importante también darles un nombre descriptivo y especificar en la descripción en si qué estamos haciendo de una manera lo más clara posible.
Efectivamente, el proyecto “baraja” de Java se ha importado correctamente.
 

3.-Crea una nueva rama que se llame desarrolloPersona.
Desde la pestaña main (justo debajo del nombre del proyecto) despliego el menú y le doy un nombre a la futura rama o branch para poder crearla pulsando Create. Esto es para trabajar en paralelo sobre los archivos sin perturbar la línea principal del proyecto cuya integridad siempre ha de respetarse.
 

4.-Descarga el contenido de la rama a tu repositorio local.
Una vez creada la rama en el paso anterior abrimos GitHub Desktop y vemos como ya nos aparecen nuestros repositorios en la ventana principal. Seleccionamos el que nos interesa y procedemos a clonarlo para poder trabajar con el a nivel local.
 
 
Una vez clonado ya tenemos listo el repositorio. Nos situamos en la rama desarrolloPersona seleccionándola en las pestañas superiores, concretamente en Current Branch.
 

5.-Crea una clase nueva y realiza la actualización de la rama en el repositorio, documenta este proceso con el comentario “Nueva clase – nombre de la clase”.
Vamos a abrir el repositorio en VS Code para poder crear una nueva clase en el proyecto. Esto lo hacemos ya directamente desde la ventana principal a través del botón Open in Visual Studio Code. 
En VS Code creamos la clase y guardamos.
 
Volvemos a GitHub Desktop y vemos los cambios realizados en el proyecto que difieren con la rama del repositorio que tenemos clonado. Para hacer efectivos estos cambios y registrar el proceso le damos un nombre a este commit, una descripción explicándolo y confirmamos.
 
Una vez hecho esto no hay cambios aparentes y nos sugiere un push, que será para llevarnos estos cambios a nivel local a nuestro repositorio online. 
 
Al confirmar este push y teniendo ya actualizado el repositorio en la web se nos da la opción de comparar los cambios y solicitar un pull request. Esto lo dejaremos para más adelante, cuando queramos fusionar las ramas. Un pull consiste en la recepción de los cambios por parte de la rama principal o main de alguna de las ramas complementarias. Para esto hay que pasar por un proceso de solicitud y revisión de la que normalmente se encargan los responsables del proyecto.
 
Comprobamos que la nueva clase se ha creado dentro del proyecto. Ahí tenemos la clase Comodin.
 

6.-Modifica algún atributo de la clase nueva y realiza la actualización de la rama en el repositorio, documenta este proceso con el comentario “Edición clase – nombre de la clase”.
Similar al paso anterior abrimos el proyecto en VS Code para modificar la clase creada con anterioridad. Una vez guardados los cambios en el VS Code vemos en el GitHub Desktop que se han producido los cambios. Le damos un nombre a la actualización y una descripción de la acción realizada y confirmamos a través del Commit.
 
Volvemos a realizar el push de los cambios hacia el repositorio web. Comprobamos que está todo actualizado y que nos sugiere la comparación de cambios y el Pull request.
 
 

7.-Realiza una comprobación de los cambios.
Para comprobar los cambios pulsamos en Compare & pull request. Nos aparece un desglose con los cambios que hay respecto a la rama main para que seamos conscientes de los cambios que iríamos a traer a la rama main.
 
Si estamos conforme a estos cambios creamos la solicitud pulsando en Create pull request dándole un nombre y descripción apropiadas.
 

8.-Fusiona la rama “desarrolloPersona” con la rama principal “main”.
Para fusionar ambas ramas tenemos que abrir primero una solicitud de Pull anterior, esto quiere decir que queremos traer los cambios al proyecto principal como ya se ha explicado en el apartado 5.
Viendo la solicitud con su respectivo comentario vemos, que se nos propone una solicitud de fusión o merge que vamos a aceptar para iniciar el proceso.
 
Como somos nosotros mismos los responsables del proyecto podemos confirmar el merge sin restricciones. Lo hacemos dándole el archiconocido dúo de título (representativo) y descripción (precisa). 
 
Y ya está, hemos logrado una fusión satisfactoria.
