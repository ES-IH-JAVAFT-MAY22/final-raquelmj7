DROP SCHEMA proyectofinal;
CREATE SCHEMA IF NOT EXISTS proyectofinal;
USE proyectofinal;

DROP TABLE IF EXISTS games;

CREATE TABLE games(
id BIGINT NOT NULL AUTO_INCREMENT,
image VARCHAR(255),
`name` VARCHAR(255),
`description` VARCHAR(900),
season VARCHAR(255),
`type` VARCHAR(255),
PRIMARY KEY (id)
);

INSERT INTO games (image, `name`,`description`, season, `type`) VALUES
("src\assets\images\pluviometer.jpg", "Pluviómetro", "Descarga e imprime la plantilla que encontrarás en ESTE ENLACE. Recortadla y montadla juntos.
Luego tendréis que esperar a que llueva, pondréis el pluviómetro donde le caiga la lluvia y así podréis medirla.", "Winter", "Cognitive"),
("src\assets\images\bees.png", "Las abejas ciegas", "En primavera las abejas salen a recolectar el polen de las flores para crear su riquísima miel. En este juego 
el polen será el objeto que elijan nuestros compis de juego. La abeja (un jugador) es ciega y está buscando el polen, el jugador que será 
la abeja ciega abandona la habitación. Los demás eligen un objeto cualquiera: cuadro, silla, mesa, jarrón... Ese objeto será el polen que 
la abeja ciega tiene que recolectar. Cuando el jugador vuelve, a medida que se acerca al objeto (polen) el resto de jugadores imitan el sonido 
del zumbido de una abeja. Si se acerca, el zumbido es más fuerte. Si se aleja, el sonido disminuye. Si el jugador no logra descubrir el objeto 
en 5 minutos o elige uno que no es , ha perdido", "Spring", "Entertainment"),
("src\assets\images\rompecabezas.png", "Rompecabezas casero", "Necesitaremos palitos de madera de los helados. En este juego un jugador será el artista y juez. Tendrá que colocar
los palillos bien juntos y dibujar algo reconocible: una cara, un paisaje, un animal... Por último se separarán los palillos, se les darán la 
vuelta y se mezclarán. Por turnos, los demás deberán colocarlos en la posición original para recomponer la imagen. El juez controlará el
tiempo y ganará el que lo consiga recomponer antes.", "Summer", "Cognitive"),
("src\assets\images\Flat-time-icon-clock-vector-PNG.png", "¿Qué pasó primero?", "Descarga e imprime las imágenes que encontrarás en ESTE ENLACE. Recórtalas y plastifícalas para que no se rompan. 
Luego desordénalas, los niños deberán ponerlas en orden cronológico.", "Winter", "Cognitive"),
("src\assets\images\leafdoll.jpg", "Muñecas de otoño", "Recoged hojas de árbol de colores cuando vayáis de paseo. Cuando lleguéis a casa coged un folio y dibujad
una muñeca. Escoged las hojas que más os gusten y pegadlas a modo de falda, vestido, camiseta, sombrero... ¡Que vuele la creatividad!",
 "Fall", "Cognitive"),
("src\assets\images\hologram.png", "Holograma", "Descarga e imprime la plantilla que encontrarás en ESTE ENLACE. Pide ayuda a un adulto y recortadla.
Necesitaremos reciclar algún plastico no muy grueso y recortar la plantilla otra vez sobre el plástico, después pegaremos los lados de cada 
triángulo. Cuando tengáis la pirámide, tendréis que entrar en este enlace https://www.youtube.com/watch?v=MyC1msvF7_c y poner la pirámide
invertida en el centro. ¡Apagad la luz y que ocurra la magia!", "Winter", "Entertainment"),
("src\assets\images\sellos.jpg", "Sellos naturales", "Se reúnen varias hojas de árboles, a ser posible de diferentes tamaños y formas. Se les aplica una suave capa de témpera por un lado y luego
 se coloca esa cara pintada contra una hoja de papel, apretando con fuerza. Al cabo de unos instantes... ¿Qué ha pasado? ¡La forma de la hoja se ha quedado grabada en
  el papel! Por último, se recortan las figuras hechas con estos sellos naturales y se reparten por la casa para decorarla.", "Fall", "Creative"),
("", "El aguador", "Necesitaremos dos recipiente grandes, otro dos pequeños, un reloj y dos equipos. Por cada equipo, se coloca el recipiente grande lleno de agua a una distancia de al menos cinco metros del
 recipiente pequeño, que deberá estar vacío. Cada equipo se formará en fila y, por turnos, cada jugador debe coger con las manos la mayor cantidad posible de agua del recipiente grande e ir depositándola 
 en el recipiente pequeño hasta que este se llene. El equipo que lo haga en menos tiempo será el ganador.", "Summer", "Entertainment"),
("src\assets\images\mandala.png", "Pequeños artistas", "Juego perfecto para los días lluviosos. Necesitaremos un compás y a un adulto que nos supervise. Con el compás, trazaremos un gran círculo en nuestro folio.
Luego dibujaremos otros círculos concéntricos más pequeños. Ahora, con nuestro lápiz dibujaremos las figuras que más nos gusten en las zonas
vacías entre los círculos, corazones, figuras, animalitos... Para terminar, llenaremos de color y el resultado será... ¡Un mandala totalmente 
personal!", "Winter", "Creative"),
("src\assets\images\eltelefono.png", "El teléfono", "Nos sentaremos todos en el cesped en círculo y, por sorteo, elegiremos a uno para que 
piense una frase. Todos se taparán los oídos y se pondrán de espaldas, el jugador le tocará el hombro al de su derecha para que se gire y 
tendrá que susurrar la frase (solo podrá repetirla una vez) y este, hará lo mismo con el jugador de su derecha, transmitiéndole el mensaje
 que haya entendido. Cuando llegue a la última persona, esta deberá decirlo en voz alta y verán cuanto cambia la frase real con la frase final.",
 "Spring", "Creative"),
("src\assets\images\palabrasencadenadas.png", "Palabras encadenadas", "Juego perfecto para los días lluviosos. Nos sentaremos todos en círculo y, por sorteo, elegiremos a uno de nosotros para que diga una palabra. El que esté sentado 
a su derecha deberá decir una palabra que empiece por la última sílaba de la anterior. Por ejemplo: Yo digo 'Hola', tú podrías decir 'Largo' 
y el siguiente podría decir 'Goma', otro ejemplo puede ser el de la foto. El jugador que no encuentre ninguna palabra perderá e irán quedando
 menos hasta que solo quede uno.", "Winter", "Entertainment"),
 ("src\assets\images\diferencias.png", "La obra de arte", "Saldremos al campo y buscaremos las flores más bonitas y con más colores que encontraremos, por supuesto, ¡no 
las arrancaremos!. Les haremos una fotos y, al llegar a casa y sin mirar la foto, intentaremos recrearla como la recordemos. Luego, cuando 
nuestra obra esté acabada, buscaremos las diferencias con la foto que hicimos anteriormente.", "Spring", "Creative"),
("src\assets\images\storycards.jpg", "Crea tu historia", "Descarga e imprime las imágenes que encontrarás en ESTE ENLACE. Recórtalas y plastifícalas para que no se rompan; 
luego desordénalas. Repártelas entre todos los niños, ellos deberán ponerlas en el orden que prefieran, creando una historia única que 
deberán contarle a los demás.", "Winter", "Creative");



SELECT * from games;