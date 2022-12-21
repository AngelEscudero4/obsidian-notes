#JAVA 

Basic interface explanation on: [[Java Classes]]

A partir de Java8 las interfaces permiten tener una implementación por defecto para sus métodos. Si un método de una interfaz tiene alguna implementación, es necesario declarar ese método como **default**. La idea es que todas las clases que implementen esta interfaz tengan cierta funcionalidad "por defecto" en los métodos de sus interfaces.

```java
public interface Iterable<T> {
    Iterator<T> iterator();

    default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }
}
```

La otra característica es que las interfaces pueden tener métodos estáticos implementados.

```java
import java.util.List;
 
public interface Producto {
 
    public int getPrecio();
     
    public static int importeTotal(List<Producto> listaProductos) {
         
        return listaProductos.stream().mapToInt((p)->p.getPrecio()).sum();
    }
}
```

Las **interfaces funcionales** se utilizan principalmente para permitir **el paso de funciones a métodos**. Esto es, que podemos pasar una implementación de una función como argumento de un método.

Para que una interfaz sea funcional debe cumplir con un solo requisito: **_Solo debe tener un método abstracto_.**

![Pasted image 20221220104303.png](Pasted%20image%2020221220104303.png)


En una expresión lambda no es necesario especificar el tipo de los parámetros, ya que el compilador es capaz de deducirlo.

Además, si solo se hace una única operación que devuelve un valor no hace falta especificar el return.

![Pasted image 20221220104722.png](Pasted%20image%2020221220104722.png)







