//model means this file is part of the data model (entities) of your app.
package com.civicapp.model;

//Provides annotations (@Entity, @Id, @Table, etc.) to map Java objects → database tables.
import jakarta.persistence.*;
//Auto-generates boilerplate code like getters, setters, constructors → so you don’t have to write them manually.
import lombok.*;

//This class = database table.
@Entity
/*The actual table in MySQL will be called users.
Without this, Hibernate wouldn’t know how to map it.*/
@Table(name = "users")
@Data   // Lombok: generates getters, setters, toString(),, hashCode() etc.
@NoArgsConstructor //creates constructor with no arguments
@AllArgsConstructor
public class User {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment in db
    private Long id;

    //creates a col in db which can't be empty and no two users can hv same username
    @Column(nullable = false, unique = true) 
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role; // e.g. "CITIZEN", "ADMIN", "WORKER"

    @Column(nullable = false, unique = true) 
    private String email;
}
