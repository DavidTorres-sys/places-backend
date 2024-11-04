package com.prueba.gestionriesgos.services.person;

import com.prueba.gestionriesgos.domain.dto.PersonDTO;
import com.prueba.gestionriesgos.domain.entity.Person;
import com.prueba.gestionriesgos.domain.mapper.IPersonMapper;
import com.prueba.gestionriesgos.persistance.IPersonRepository;
import com.prueba.gestionriesgos.utils.exception.DataBaseException;
import com.prueba.gestionriesgos.utils.exception.DataDuplicatedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
    private final IPersonMapper personMapper;

    @Autowired
    public PersonServiceImpl(IPersonRepository personRepository,
                             IPersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    /**
     * Creates a new person with the given details.
     *
     * @param personDTO The PersonDTO containing the details of the person to create.
     * @return The created PersonDTO with the generated ID.
     */
    @Override
    public PersonDTO createPerson(PersonDTO personDTO) {
        Person person = personMapper.toEntity(personDTO);
        try {
            person = personRepository.save(person);
        } catch (DataIntegrityViolationException e) {
            throw new DataDuplicatedException("Person already exists");
        } catch (Exception e) {
            throw new DataBaseException("Error creating person");
        }
        return personMapper.toDTO(person);
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
