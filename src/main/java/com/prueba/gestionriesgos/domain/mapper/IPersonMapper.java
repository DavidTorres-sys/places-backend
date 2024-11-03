package com.prueba.gestionriesgos.domain.mapper;

import com.prueba.gestionriesgos.domain.dto.PersonDTO;
import com.prueba.gestionriesgos.domain.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper interface for converting between Person entities and PersonDTOs.
 *
 * This interface uses MapStruct to generate the implementation for
 * mapping between the Person entity and the PersonDTO. The generated
 * implementation will handle the conversion logic based on the specified
 * mappings.
 */
@Mapper(componentModel = "spring")
public interface IPersonMapper extends IEntityMapper<PersonDTO, Person> {

    /**
     * Converts a Person entity to its corresponding PersonDTO.
     *
     * @param person the Person entity to convert
     * @return the converted PersonDTO
     */
    @Mapping(target = "personId", source = "person.personId")
    PersonDTO toDTO(Person person);
}
