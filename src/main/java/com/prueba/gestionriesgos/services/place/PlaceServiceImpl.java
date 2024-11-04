package com.prueba.gestionriesgos.services.place;

import com.prueba.gestionriesgos.domain.dto.PlaceDTO;
import com.prueba.gestionriesgos.domain.entity.Person;
import com.prueba.gestionriesgos.domain.entity.Place;
import com.prueba.gestionriesgos.domain.mapper.IPlaceMapper;
import com.prueba.gestionriesgos.persistance.IPersonRepository;
import com.prueba.gestionriesgos.persistance.IPlaceRepository;
import com.prueba.gestionriesgos.utils.exception.DataBaseException;
import com.prueba.gestionriesgos.utils.exception.DataDuplicatedException;
import com.prueba.gestionriesgos.utils.exception.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service class for managing Place entities.
 *
 * This class provides methods for creating a new place and retrieving
 * place information based on associated person names. It acts as a layer
 * between the controller and the repository, handling business logic related
 * to Place entities.
 */
@Service
public class PlaceServiceImpl implements IPlaceService {

    private final IPlaceRepository placeRepository;
    private final IPersonRepository personRepository;
    private final IPlaceMapper placeMapper;

    @Autowired
    public PlaceServiceImpl(IPlaceRepository placeRepository,
                            IPersonRepository personRepository,
                            IPlaceMapper placeMapper) {
        this.placeRepository = placeRepository;
        this.personRepository = personRepository;
        this.placeMapper = placeMapper;
    }

    /**
     * Creates a new place with the given details.
     *
     * @param placeDTO The PlaceDTO containing the details of the place to create.
     * @return The created PlaceDTO with the generated ID.
     * @throws DataDuplicatedException If the place already exists.
     * @throws DataBaseException If an error occurs while creating the place.
     */
    @Override
    public PlaceDTO createPlace(PlaceDTO placeDTO) {
        Place place = placeMapper.toEntity(placeDTO);
        try {
            Optional<Person> person = personRepository.findById(place.getPerson().getPersonId());
            if (person.isEmpty()) {
                throw new DataNotFoundException("Person with the given id not found");
            }
            place.setPerson(person.get());
            place = placeRepository.save(place);
        } catch (DataIntegrityViolationException e) {
            throw new DataDuplicatedException("Place already exists");
        } catch (Exception e) {
            throw new DataBaseException("Error creating a place");
        }
        return placeMapper.toDTO(place);
    }
}
