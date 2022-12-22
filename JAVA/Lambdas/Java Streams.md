#JAVA

Los Streams permiten procesar datos de forma declarativa (como en SQL)

Si combinamos distintas operaciones estas tienen que acabar en una operación terminal, como puede ser `.collect()`.

![Pasted image 20221220120042.png](Pasted%20image%2020221220120042.png)

El paquete que contiene los streams en Java es `java.util.stream`. La clase `Stream` hereda a su vez de la clase `BaseStream`. 

La interfaz genérica es `Stream<T>`

Podemos paralelizar un Stream con `parallel()` o secuencializarlo con `sequential()`

También existen Streams específicos para un tipo de datos, como `IntStream` el cual tiene métodos especiales como la media, etc.

![Pasted image 20221220120552.png](Pasted%20image%2020221220120552.png)

Para hacerlo de forma paralela:
![Pasted image 20221220120820.png](Pasted%20image%2020221220120820.png)


**Stream pipeline** = canalización de flujo -> toma un origen de datos y realiza una serie de operaciones intermedias, finalizando con una operación terminal.

Las operaciones intermedias dan como resultado un nuevo stream y son **perezosas**, es decir, no se ejecutan hasta que no se invoque una operación terminal.

Algunas operaciones intermedias son:
![Pasted image 20221220121055.png](Pasted%20image%2020221220121055.png)

Las operaciones terminales producen un resultado. Algunas de ellas son:
![Pasted image 20221220121242.png](Pasted%20image%2020221220121242.png)
![Pasted image 20221220121341.png](Pasted%20image%2020221220121341.png)
![Pasted image 20221220121404.png](Pasted%20image%2020221220121404.png)

Cuando tenemos un único método se puede utilizar como referenciado para simplificarlo:
 
![Pasted image 20221220131408.png](Pasted%20image%2020221220131408.png)
![[Pasted image 20221220131417.png]]

### Creación de stream
![Pasted image 20221220131636.png](Pasted%20image%2020221220131636.png)

## stream.iterate()
Esta función sirve para generar un numero infinito de eltos, por lo que habrá que limitarlo con `limit()`. 

![Pasted image 20221220132400.png](Pasted%20image%2020221220132400.png)

## stream.generate()
Es igual que `iterate` pero en vez de hacerlo en orden lo hace de una manera random, como por ejemplo:
![[Pasted image 20221220132744.png]]

Para generar streams a partir de arrays:
![Pasted image 20221220133112.png](Pasted%20image%2020221220133112.png)


Para generar streams a partir de listas, sets, etc:
![Pasted image 20221220133249.png](Pasted%20image%2020221220133249.png)

## stream.sorted()

Para que se pueda hacer un sorted debe existir la función `compare` en el objeto o bien crearla dentro de sorted:

![[Pasted image 20221220135012.png]]

Es igual en el caso de cualquier otra función como puede ser max, min, average, etc. teniendo que definirlo:
![Pasted image 20221220135421.png](Pasted%20image%2020221220135421.png)

## stream.reduce()
`.reduce(inicializador, IntBinaryOperator)`
El inicializador es opcional, es el valor que devuelve por defecto si el stream está vacío (es el valor inicial)
IntBinaryOperator es la operación a hacer con la que calcular un valor único entre todos los datos.

## stream.collect()

Para recuperar los datos finales y guardarlos en una lista, un set, etc.

Para ello hago `collect(Collectors.toList())`

Para pasarlo a un map, es necesario en la función toMap especificar cuál es la clave y el valor: `collect(Collectors.toMap(Empleado::getId, Empleado::getNombre)`

🙌 ¡Has completado la última lección de este curso!
Buscar más cursos















