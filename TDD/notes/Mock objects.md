#TDD #GOOD_PRACTICES

When we need to work with some data connected to a database, it is not recommended to work directly with them. Instead of create tests with this data, it is better to mock objects.

For doing that, we can use [Mockito](https://site.mockito.org/). For using it, we can save it in a lib folder inside the project (if not working with Spring Boot) and add it in the build path.

**NOTE**: It is **impossible** to mock a static method -> solution: create an abstraction that use the static method so I can mock the function that calls the static method. We write more code loosing stability but we can create tests.

For solving that, we can use **Ports and Adapters architecture** or **Hexagonal architecture**, separating the main classes and the infrastructure having simple models and with the possibility of easily mocking.

Example of mock objects: [[InvoiceFilterTest.java]]

Another example:
![[Pasted image 20221223111616.png]]