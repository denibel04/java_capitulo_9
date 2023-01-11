# Conceptos de POO

### 1. ¿Cuáles serían los atributos de la clase PilotoDeFormula1? ¿Se te ocurren algunas instancias de esta clase?

Atributos : nombre, edad, campeonatosGanados, numeroDeCarrerasOficiales, mediaDePuntosPorTemporada
Una instancia sería por ejemplo:
PilotoDeFormula1 fa = new PilotoDeFormula1(“Fernando Alonso”, 41, 32, 189, 5.2)

### 2. A continuación tienes una lista en la que están mezcladas varias clases con instancias de esas clases. Para ponerlo un poco más difícil, todos los elementos están escritos en minúscula. Di cuáles son las clases, cuáles las instancias, a qué clase pertenece cada una de estas instancias y cuál es la jerarquía entre las clases.

Animal {
    Perro { goofy, snoopy, milu, ayudante_de_santa_claus, laika }
    Caballo { rocinante, pegaso, bucefalo }
    Gato { garfield, tom, silvestre }
    Pato { pato_lucas }
    Persona { javier, paula }
Mineral { cuarzo, pirita }

### 3. ¿Cuáles serían los atributos de la clase Vivienda? ¿Qué subclases se te ocurren? 

Atributos: precio, numHabitaciones, metrosCuadrados, direccion, orientación, tieneGaraje, tieneTrastero
Subclases: Piso, Adosado, Cortijo

### 4. Piensa en la liga de baloncesto, ¿qué 5 clases se te ocurren para representar 5 elementos distintos que intervengan en la liga? 

Jugador, Partido, Estadio, Equipo, Arbitro

### 5. Haz una lista con los atributos que podría tener la clase caballo. A continuación haz una lista con los posibles métodos (acciones asociadas a los caballos). 

Atributos: nombre, raza, color, edad, premios
Métodos: relinchar, galopar, trotar, comer, dormir

### 6. Lista los atributos de la clase Alumno ¿Sería nombre uno de los atributos de la clase? Razona tu respuesta. 

Atributos: nombre, género, edad, curso, tfn, expediente
Mi nombre no sería un atributo, sino una instancia para el atributo nombre. Es decir, todos los alumnos tienen nombre, pero solo yo me llamo Denisa.

### 7. ¿Cuáles serían los atributos de la clase Ventana (de ordenador)? ¿cuáles serían los métodos? Piensa en las propiedades y en el comportamiento de una ventana de cualquier programa.

Atributos: esVisible, estaSeleccionada, esIncognito, posicion, anchura, altura, colorDeFondo, título, esResponsive, favicon
Métodos: maximizar, minimizar, restaurar, cerrar, redimensionar, mover

