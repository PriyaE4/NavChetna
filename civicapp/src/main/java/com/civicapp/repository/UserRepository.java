//repository = folder for all DB access logic
package com.civicapp.repository;

//Provided by Spring Data JPA, it gives you built-in CRUD operations (Create, Read, Update, Delete).
import org.springframework.data.jpa.repository.JpaRepository;
//The entity class (maps to users table).
import com.civicapp.model.User;
//A Java container that may or may not contain a value (helps avoid null errors).
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    /*
     A custom finder method.

Spring Data JPA sees the name findByUsername and automatically generates the SQL:

SELECT * FROM users WHERE username = ?;


Return type is Optional<User> because user might exist or not.

Useful for login: check if a given username exists, then verify password.
     */
    
    
    boolean existsByUsername(String username);
    /*
     Returns true if a user already exists with that username.

Useful for registration: stop duplicate usernames.
     */
}

/*
 Declares your repository interface.

UserRepository = special interface where you define DB queries.

extends JpaRepository<User, Long> means:

Work with the User entity.

The primary key type (id) is Long.

Because you extend JpaRepository, you automatically get methods like:

findAll() → list all users

findById(Long id) → find one user by ID

save(User user) → insert/update a user

deleteById(Long id) → delete user

So you don’t need to write raw SQL.
 */