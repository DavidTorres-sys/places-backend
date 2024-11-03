package com.prueba.gestionriesgos.persistance;

import com.prueba.gestionriesgos.domain.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing Person entities in the database.
 *
 * This interface extends JpaRepository, providing CRUD operations
 * and additional methods for interacting with Person entities stored
 * in the database. The generic parameters specify the type of the
 * entity (Person) and the type of its identifier (Integer).
 */
public interface IPersonRepository extends JpaRepository<Person, Integer> { }
