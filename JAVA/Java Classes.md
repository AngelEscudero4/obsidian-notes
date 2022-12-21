#JAVA 

First, see [Basic Java](Basic%20Java.md).

## Java OOP

OOP stands for **Object-Oriented Programming**.

Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

Object-oriented programming has several advantages over procedural programming:

-   OOP is faster and easier to execute
-   OOP provides a clear structure for the programs
-   OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
-   OOP makes it possible to create full reusable applications with less code and shorter development time

**Tip:** The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.

So, a class is a template for objects, and an object is an instance of a class.

## Java class Attributes & Methods

```java
public class Main {
  String fname = "John";
  String lname = "Doe";
  int age = 24;
  
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
```

## Static vs public

You will often see Java programs that have either `static` or `public` attributes and methods.

In the example above, we created a `static` method, which means that it can be accessed without creating an object of the class, unlike `public`, which can only be accessed by objects

## Access Modifiers

For classes, you can use either public or default:

| Modifier | Description                                                                                                  |
| -------- | ------------------------------------------------------------------------------------------------------------ |
| public   | The class is accessible by any other class                                                                   |
| default  | The class is only accessible by classes in the same package. This is used when you don't specify a modifier. |
 

For attributes, methods and constructors, you can use the one of the following:

| Modifier  | Description                                                                                                                                                 |
| --------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| public    | The code is accessible for all classes                                                                                                                      |
| private   | The code is only accessible within the declared class                                                                                                       |
| default   | The code is only accessible in the same package. This is used when you don't specify a modifier. |
| protected | The code is accessible in the same package and subclasses.                |


## Non-Access Modifiers

For classes, you can use either final or abstract:

| Modifier | Description                                                                                                                                                                                                          |
| -------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| final    | The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)                                                                                                    |
| abstract | The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters) | 

For attributes and methods, you can use the one of the following:

| Modifier     | Description                                                                                                                                                                                       |
| ------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| final        | Attributes and methods cannot be overridden/modified                                                                                                                                              |
| static       | Attributes and methods belongs to the class, rather than an object                                                                                                                                |
| abstract     | Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). | 
| transient    | Attributes and methods are skipped when serializing the object containing them                                                                                                                    |
| synchronized | Methods can only be accessed by one thread at a time                                                                                                                                              |
| volatile     | The value of an attribute is not cached thread-locally, and is always read from the "main memory"                                                                                                 |


## Subclass

```java
class Student extends Main {
    ...
}
```

## Encapsulation

The meaning of **Encapsulation**, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

-   declare class variables/attributes as `private`
-   provide public **get** and **set** methods to access and update the value of a `private` variable

### Why Encapsulation?

-   Better control of class attributes and methods
-   Class attributes can be made **read-only** (if you only use the `get` method), or **write-only** (if you only use the `set` method)
-   Flexible: the programmer can change one part of the code without affecting other parts
-   Increased security of data

## Java Packages & API

A package in Java is used to group related classes. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

-   Built-in Packages (packages from the Java API)
-   User-defined Packages (create your own packages)

### Syntax

```java
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
```

## User-defined Packages

To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:

### Example

└── root
  └── mypack
    └── MyPackageClass.java

To create a package, use the `package` keyword:

### MyPackageClass.java

```java
package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
```

## Java Inheritance (Subclass and Superclass)

In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

-   **subclass** (child) - the class that inherits from another class
-   **superclass** (parent) - the class being inherited from

To inherit from a class, use the `extends` keyword.

```java
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
```

## Java Polymorphism

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Inheritance lets us inherit attributes and methods from another class. **Polymorphism** uses those methods to perform different tasks. This allows us to perform a single action in different ways.

For example, think of a superclass called `Animal` that has a method called `animalSound()`. Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):

## Java Inner Classes

In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

To access the inner class, create an object of the outer class, and then create an object of the inner class:

```java
class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
```


## Abstract Classes and Methods

Data **abstraction** is the process of hiding certain details and showing only essential information to the user.  

Abstraction can be achieved with either **abstract classes** or interfaces.

The `abstract` keyword is a non-access modifier, used for classes and methods:

-   **Abstract class:** is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
  
-   **Abstract method:** can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

An abstract class can have both abstract and regular methods:

```java
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

## Interfaces

Another way to achieve abstraction in Java, is with interfaces.

An `interface` is a completely "**abstract class**" that is used to group related methods with empty bodies:


```java
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

## Enum

```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
```

```java
for (Level myVar : Level.values()) {
  System.out.println(myVar);
}
```

#### Difference between Enums and Classes

An `enum` can, just like a `class`, have attributes and methods. The only difference is that enum constants are `public`, `static` and `final` (unchangeable - cannot be overridden).

An `enum` cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

#### Why And When To Use Enums?

Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.

## Scanner

```java
Scanner myObj = new Scanner(System.in);  // Create a Scanner object
String userName = myObj.nextLine();  // Read user input
```


| Method        | Description                         |
| ------------- | ----------------------------------- |
| nextBoolean() | Reads a boolean value from the user |
| nextByte()    | Reads a byte value from the user    |
| nextDouble()  | Reads a double value from the user  |
| nextFloat()   | Reads a float value from the user   |
| nextInt()     | Reads a int value from the user     |
| nextLine()    | Reads a String value from the user  |
| nextLong()    | Reads a long value from the user    |
| nextShort()   | Reads a short value from the user   |

## Java Dates

Java does not have a built-in Date class, but we can import the `java.time` package to work with the date and time API. The package includes many date and time classes. For example


| Class             | Description                                                            |
| ----------------- | ---------------------------------------------------------------------- |
| LocalDate         | Represents a date (year, month, day (yyyy-MM-dd))                      |
| LocalTime         | Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns)) | 
| LocalDateTime     | Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)             |
| DateTimeFormatter | Formatter for displaying and parsing date-time objects                 |

Current date -> `LocalDate.now();`
First, see [Basic Java](Basic%20Java.md).First, see [Basic Java](Basic%20Java.md).First, see [Basic Java](Basic%20Java.md).
## Iterators
An `Iterator` is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.

```java
// Get the iterator
Iterator<String> it = cars.iterator();

while(it.hasNext()) {
    System.out.println(it.next());
	if(i < 10) {
	        it.remove();
	      }
	}
```


## Java Wrapper Classes

Wrapper classes provide a way to use primitive data types (`int`, `boolean`, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

Sometimes you must use wrapper classes, for example when working with Collection objects, such as `ArrayList`, where primitive types cannot be used (the list can only store objects)

The following methods are used to get the value associated with the corresponding wrapper object: `intValue()`, `byteValue()`, `shortValue()`, `longValue()`, `floatValue()`, `doubleValue()`, `charValue()`, `booleanValue()`.

Another useful method is the `toString()` method, which is used to convert wrapper objects to strings.

## Java Exceptions

```java
try {
  //  Block of code to try
} catch(Exception e) {
  //  Block of code to handle errors
} finally {
  //  This code is always executed
}
```

The `finally` statement lets you execute code, after `try...catch`, regardless of the result:

## The throw keyword

The `throw` statement allows you to create a custom error.

The `throw` statement is used together with an **exception type**. There are many exception types available in Java: `ArithmeticException`, `FileNotFoundException`, `ArrayIndexOutOfBoundsException`, `SecurityException`, etc:

## What is a Regular Expression?

A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text, you can use this search pattern to describe what you are searching for.

A regular expression can be a single character, or a more complicated pattern.

Regular expressions can be used to perform all types of **text search** and **text replace** operations.

Java does not have a built-in Regular Expression class, but we can import the `java.util.regex` package to work with regular expressions. The package includes the following classes:

-   `Pattern` Class - Defines a pattern (to be used in a search)
-   `Matcher` Class - Used to search for the pattern
-   `PatternSyntaxException` Class - Indicates syntax error in a regular expression pattern

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}
```

### Flags

Flags in the `compile()` method change how the search is performed. Here are a few of them:

-   `Pattern.CASE_INSENSITIVE` - The case of letters will be ignored when performing a search.
-   `Pattern.LITERAL` - Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.
-   `Pattern.UNICODE_CASE` - Use it together with the `CASE_INSENSITIVE` flag to also ignore the case of letters outside of the English alphabet

### Regular Expression Patterns

The first parameter of the `Pattern.compile()` method is the pattern. It describes what is being searched for.

Brackets are used to find a range of characters:



| Expression | Description                                              |
| ---------- | -------------------------------------------------------- |
| [abc]      | Find one character from the options between the brackets |
| [\^abc]     | Find one character NOT between the brackets              |
| [0-9]      | Find one character from the range 0 to 9                 | 



| Metacharacter | Description                                                                                          |
| ------------- | ---------------------------------------------------------------------------------------------------- |
| \|            | Find a match for any one of the patterns separated by \| as in: cat\|dog\|fish                       | 
| .             | Find just one instance of any character                                                              |
| ^             | Finds a match as the beginning of a string as in: ^Hello                                             |
| $             | Finds a match at the end of the string as in: World$                                                 |
| \d            | Find a digit                                                                                         |
| \s            | Find a whitespace character                                                                          |
| \b            | Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b |
| \uxxxx        | Find the Unicode character specified by the hexadecimal number xxxx                                  |



| Quantifier | Description                                                    |
| ---------- | -------------------------------------------------------------- |
| n+         | Matches any string that contains at least one n                |
| n*         | Matches any string that contains zero or more occurrences of n |
| n?         | Matches any string that contains zero or one occurrences of n  | 
| n{x}       | Matches any string that contains a sequence of X n's           |
| n{x,y}     | Matches any string that contains a sequence of X to Y n's      |
| n{x,}      | Matches any string that contains a sequence of at least X n's  |


## Java Threads

Threads allows a program to operate more efficiently by doing multiple things at the same time.

### Creating a Thread

There are two ways to create a thread.

It can be created by extending the `Thread` class and overriding its `run()` method:

```java
public class Main extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
    }
}  
```

Another way to create a thread is to implement the `Runnable` interface:
```java
public class Main implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

### Running Threads

If the class extends the `Thread` class, the thread can be run by creating an instance of the class and call its `start()` method:
```java
public class Main extends Thread {
  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

If the class implements the `Runnable` interface, the thread can be run by passing an instance of the class to a `Thread` object's constructor and then calling the thread's `start()` method:
```java
public class Main implements Runnable {
  public static void main(String[] args) {
    Main obj = new Main();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

## Concurrency Problems

Because threads run at the same time as other parts of the program, there is no way to know in which order the code will run. When the threads and main program are reading and writing the same variables, the values are unpredictable. The problems that result from this are called concurrency problems.

## Java Lambda Expressions

Lambda Expressions were added in Java 8.

A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

## Syntax

The simplest lambda expression contains a single parameter and an expression:

```java
parameter -> expression
```

To use more than one parameter, wrap them in parentheses:

```java
(parameter1, parameter2) -> expression
```

Expressions are limited. They have to immediately return a value, and **they cannot contain variables, assignments or statements such as `if` or `for`**. In order to do more complex operations, a code block can be used with curly braces. If the lambda expression needs to return a value, then the code block should have a `return` statement.

```java
(parameter1, parameter2) -> { code block }
```

```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.forEach( (n) -> { System.out.println(n); } );
```


Use Java's `Consumer` interface to store a lambda expression in a variable:

```java
Consumer<Integer> method = (n) -> { System.out.println(n); };
numbers.forEach( method );
```


