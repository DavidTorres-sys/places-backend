package com.prueba.gestionriesgos.persistance;

import com.prueba.gestionriesgos.domain.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing Place entities in the database.
 *
 * This interface extends JpaRepository, providing CRUD operations
 * and additional methods for interacting with Place entities stored
 * in the database. The generic parameters specify the type of the
 * entity (Place) and the type of its identifier (Integer).
 */
public interface IPlaceRepository extends JpaRepository<Place, Integer> { }
