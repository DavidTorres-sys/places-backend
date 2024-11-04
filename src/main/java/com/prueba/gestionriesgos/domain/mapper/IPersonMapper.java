package com.prueba.gestionriesgos.domain.mapper;

import com.prueba.gestionriesgos.domain.dto.PersonDTO;
import com.prueba.gestionriesgos.domain.entity.Person;
import org.mapstruct.Mapper;

/**
 * Mapper interface for converting between Person entities and PersonDTOs.
 *
 * This interface uses MapStruct to generate the implementation for
 * mapping between the Person entity and the PersonDTO. The generated
 * implementation will handle the conversion logic based on the specified
 * mappings.
 */
@Mapper(componentModel = "spring")
public interface IPersonMapper extends IEntityMapper<PersonDTO, Person> { }
