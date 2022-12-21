Follow the instructions of this [page](https://www.cherryservers.com/blog/how-to-install-and-setup-postgresql-server-on-ubuntu-20-04). 

- See the service health: `service postgresql status`
- Start the service: `service postgresql start`
- Stop the service: `service postgresql stop`

- To connect local database in Dbeaver:

![[Pasted image 20221221134306.png]]

If we want to connect it with Spring Boot after creating the project with the [[Spring Initalizr]], it is needed to add in the application.properties file:
![[Pasted image 20221221135945.png]]
If we want that SpringBoot updates automatically the model and creates new tables if needed then add in the application.properties file:
![[Pasted image 20221221144934.png]]

