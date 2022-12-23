#JAVA #SPRINGBOOT 

Lombok adds automatically getters and setters, constructors, etc.

![[Pasted image 20221223093608.png]]

![[Pasted image 20221223093633.png]]

![[Pasted image 20221223093700.png]]

![[Pasted image 20221223093718.png]]

![[Pasted image 20221223093733.png]]

![[Pasted image 20221223093743.png]]


![[Pasted image 20221223093800.png]]

![[Pasted image 20221223093837.png]]
In order to use lombok it is needed to add the dependency in the `pom.xml`

![[Pasted image 20221223094022.png]]

If after that the IDE detect as an error Lombok annotations see if it is needed a plugin for that

Instead of adding Lombok to our project, we can create our own constructors, getters and setters, etc.

For using the logger it is enough with the annotation, it is not needed to create the own object:
![[Pasted image 20221223094430.png]]

When we have bidirectional relationships, Lombok creates a circular reference so that we need to exclude those properties from the hash code.

![[Pasted image 20221223094740.png]]

