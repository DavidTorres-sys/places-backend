package com.prueba.gestionriesgos.domain.mapper;

import java.util.List;
import java.util.Set;

/**
 * Interface for mapping between Data Transfer Objects (DTOs) and Entities.
 *
 * This interface defines the contract for conversion operations between
 * DTOs and their corresponding entities, facilitating the transfer of data
 * between different layers of the application. Implementations of this
 * interface will provide the actual mapping logic.
 *
 * @param <DTO>   the type of the Data Transfer Object
 * @param <Entity> the type of the Entity
 */
public interface IEntityMapper<DTO, Entity> {

    /**
     * Converts an entity to its corresponding DTO.
     *
     * @param entity the entity to convert
     * @return the converted DTO
     */
    DTO toDTO(Entity entity);

    /**
     * Converts a DTO to its corresponding entity.
     *
     * @param dto the DTO to convert
     * @return the converted entity
     */
    Entity toEntity(DTO dto);

    /**
     * Converts a list of DTOs to a list of entities.
     *
     * @param dtoList the list of DTOs to convert
     * @return the list of converted entities
     */
    List<Entity> toEntity(List<DTO> dtoList);

    /**
     * Converts a list of entities to a list of DTOs.
     *
     * @param entityList the list of entities to convert
     * @return the list of converted DTOs
     */
    List<DTO> toDto(List<Entity> entityList);

    /**
     * Converts a set of DTOs to a set of entities.
     *
     * @param dtoList the set of DTOs to convert
     * @return the set of converted entities
     */
    Set<Entity> toEntity(Set<DTO> dtoList);

    /**
     * Converts a set of entities to a set of DTOs.
     *
     * @param entityList the set of entities to convert
     * @return the set of converted DTOs
     */
    Set<DTO> toDto(Set<Entity> entityList);
}
