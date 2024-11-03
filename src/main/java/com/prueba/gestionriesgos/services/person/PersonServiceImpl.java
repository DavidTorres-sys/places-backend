package com.prueba.gestionriesgos.services.person;

import com.prueba.gestionriesgos.domain.dto.PersonDTO;
import com.prueba.gestionriesgos.persistance.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing Person entities.
 *
 * This class provides methods for creating a new person and retrieving
 * person information based on associated place names. It acts as a layer
 * between the controller and the repository, handling business logic related
 * to Person entities.
 */
@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(IPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    /**
     * Creates a new person with the given details.
     *
     * @param person The PersonDTO containing the details of the person to create.
     * @return The created PersonDTO with the generated ID.
     */
    @Override
    public PersonDTO createPerson(PersonDTO person) {
        return null;
    }

    /**
     * Retrieves a list of persons associated with the specified place name.
     *
     * @param placeName The name of the place for which to retrieve associated persons.
     * @return An Optional containing a list of PersonDTOs associated with the place name,
     * or an empty Optional if no persons are found.
     */
    @Override
    public Optional<List<PersonDTO>> getPersonByPlaceName(String placeName) {
        return Optional.empty();
    }
}
