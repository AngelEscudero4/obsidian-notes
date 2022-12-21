#JAVA #SPRINGBOOT #JPA

[JDL](https://start.jhipster.tech/jdl-studio/) is a webpage used to create the schema, showing the entities and relationships. This diagram must be implemented as POJOs in java.

JPA requires a **zero args constructor**.

A POJO should have:
- Attributes
- Constructor
- Getters / Setters
- toString
- equals

In order to transform a POJO into a JPA entity it is needed that the model has an id.

For that, first we must annotate the class with `@Entity` and add the id

![[Pasted image 20221221141002.png]]

Typical POJO is:

```java
package com.example.spring_code.domain;  
  
import jakarta.persistence.*;  
  
import java.util.Objects;  
import java.util.Set;  
  
@Entity  
public class Author {  
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;  
  
    private String firstName;  
    private String lastName;  
  
    @ManyToMany(mappedBy =  "authors")  
    private Set<Book> books;  
  
  
    public Author() {  
    }  
  
    public Author(String firstName, String lastName, Set<Book> books) {  
        this.firstName = firstName;  
        this.lastName = lastName;  
        this.books = books;  
    }  
  
    public String getFirstName() {  
        return firstName;  
    }  
  
    public void setFirstName(String firstName) {  
        this.firstName = firstName;  
    }  
  
    public String getLastName() {  
        return lastName;  
    }  
  
    public void setLastName(String lastName) {  
        this.lastName = lastName;  
    }  
  
    public Set<Book> getBooks() {  
        return books;  
    }  
  
    public void setBooks(Set<Book> books) {  
        this.books = books;  
    }  
  
    public void setId(Long id) {  
        this.id = id;  
    }  
  
    public Long getId() {  
        return id;  
    }  
  
    @Override  
    public boolean equals(Object o) {  
        if (this == o) return true;  
        if (o == null || getClass() != o.getClass()) return false;  
  
        Author author = (Author) o;  
  
        return Objects.equals(id, author.id);  
    }  
  
    @Override  
    public int hashCode() {  
        return id != null ? id.hashCode() : 0;  
    }  
  
	@Override  
	public String toString() {  
	    return "Author{" +  
	            "id=" + id +  
	            ", firstName='" + firstName + '\'' +  
	            ", lastName='" + lastName + '\'' +  
	            ", books=" + books +  
	            '}';  
	}
}
```