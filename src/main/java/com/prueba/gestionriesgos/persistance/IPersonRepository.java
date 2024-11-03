package com.prueba.gestionriesgos.persistance;

import com.prueba.gestionriesgos.domain.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repository interface for accessing Person entities in the database.
 *
 * This interface extends JpaRepository, providing CRUD operations
 * and additional methods for interacting with Person entities stored
 * in the database. The generic parameters specify the type of the
 * entity (Person) and the type of its identifier (Integer).
 */
public interface IPersonRepository extends JpaRepository<Person, Integer> {

    /**
     * Finds a person with the specified first name, age, and occupation.
     *
     * @param firstName The first name of the person to find.
     * @param age The age of the person to find.
     * @param occupation The occupation of the person to find.
     * @return An Optional containing the person with the specified first name, age, and occupation.
     */
    Optional<Person> findByFirstNameAndAgeAndOccupation(String firstName, Integer age, String occupation);
}
