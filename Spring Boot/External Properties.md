#JAVA #SPRINGBOOT #GOOD_PRACTICES 

Usernames, passwords, urls, API keys, paths, queue names, etc can change, so it is not a good practice to hard code these values in our code. Because of that, we can have external properties to change them easier.


![[Pasted image 20221222120014.png]]

![[Pasted image 20221222120043.png]]

![[Pasted image 20221222120123.png]]

![[Pasted image 20221222120142.png]]

 ![[Pasted image 20221222122511.png]]

## Properties source

In `application.properties`

![[Pasted image 20221222122842.png]]

To use them:
![[Pasted image 20221222122810.png]]

If we want to override the variables via environment or program arguments we can do ir with IntelliJ run config:
![[Pasted image 20221222122953.png]]


If we have multiple environments, we can have an `application.properties` for each environment. The convention is to name the file as `application-{env}.properties`. 

![[Pasted image 20221222123227.png]]

In the application.properties if we specify a profile then it will take the corresponding properties file:

![[Pasted image 20221222123310.png]]