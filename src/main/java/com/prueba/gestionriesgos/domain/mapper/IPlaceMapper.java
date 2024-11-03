package com.prueba.gestionriesgos.domain.mapper;

import com.prueba.gestionriesgos.domain.dto.PlaceDTO;
import com.prueba.gestionriesgos.domain.entity.Place;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper interface for converting between Place entities and PlaceDTOs.
 *
 * This interface uses MapStruct to generate the implementation for
 * mapping between the Place entity and the PlaceDTO. The generated
 * implementation will handle the conversion logic based on the specified
 * mappings.
 */
@Mapper(componentModel = "spring")
public interface IPlaceMapper extends IEntityMapper<PlaceDTO, Place> {

    /**
     * Converts a Place entity to its corresponding PlaceDTO.
     *
     * @param place the Place entity to convert
     * @return the converted PlaceDTO
     */
    @Mapping(target = "placeId", source = "place.placeId")
    PlaceDTO toDTO(Place place);
}
