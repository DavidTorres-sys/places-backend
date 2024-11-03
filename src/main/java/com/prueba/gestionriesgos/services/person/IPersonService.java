package com.prueba.gestionriesgos.services.person;

import com.prueba.gestionriesgos.domain.dto.PersonDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing Person entities.
 *
 * This interface provides methods for creating a new person and retrieving
 * person information based on associated place names. It acts as a layer
 * between the controller and the repository, handling business logic related
 * to Person entities.
 */
public interface IPersonService {

    /**
     * Creates a new person with the given details.
     *
     * @param person The PersonDTO containing the details of the person to create.
     * @return The created PersonDTO with the generated ID.
     */
    PersonDTO createPerson(PersonDTO person);

    /**
     * Retrieves a list of persons associated with the specified place name.
     *
     * @param placeName The name of the place for which to retrieve associated persons.
     * @return An Optional containing a list of PersonDTOs associated with the place name,
     *         or an empty Optional if no persons are found.
     */
    Optional<List<PersonDTO>> getPersonByPlaceName(String placeName);
}
