#JAVA #SPRINGBOOT #JPA 

Repositories are interfaces which are connected to the database.

```java
package com.example.spring_code.repositories;  
  
import com.example.spring_code.domain.Author;  
import org.springframework.data.repository.CrudRepository;  
  
public interface AuthorRepository extends CrudRepository<Author, Long> {  
}
```

With that, we are going to get save, save all, find by ID, exist by ID, find all, find by ID, delete by ID, delete by entity, delete all from a list and then delete everything in the repository.

The `extends` must be the entity and the id type.