#JAVA 

This operator is commonly used on [[Expresion lambda]]

The **double colon (::) operator**, also known as **method reference operator** in Java, is used to call a method by referring to it with the help of its class directly. They behave exactly as the lambda expressions. The only difference it has from lambda expressions is that this uses direct reference to the method by name instead of providing a delegate to the method.

For example, instead of:
```java
stream.forEach( s-> System.out.println(s));
```

We can do:

```java
stream.forEach(System.out::println);
```

**When and how to use double colon operator?**

Method reference or double colon operator can be used to refer:

-   a static method,
-   an instance method, or
-   a constructor.