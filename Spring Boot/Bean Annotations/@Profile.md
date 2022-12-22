#JAVA #SPRINGBOOT #BEAN_ANNOTATION

Imagine we have two environments, one using an H2 database and another with MySQL. 

With profiles we can control different runtime environments.

Imagine we have one service with the same name that depends only in the language they use (english or spanish). 

![[Pasted image 20221222100241.png]]

![[Pasted image 20221222100300.png]]

The controller will cause an error because we have two beans with the same name. For solving that problem, we set a profile in the service:

![[Pasted image 20221222100452.png]]

 In our `application.propertis` we specify the profile:
![[Pasted image 20221222100531.png]]

If we want to set a default profile we can annotate it:

![[Pasted image 20221222100732.png]]

Now, we do not need to specify in the `application.properties` the profile active, because it will be used the default profile.