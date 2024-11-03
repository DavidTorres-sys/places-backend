package com.prueba.gestionriesgos.domain.dto;

import lombok.Data;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * Data Transfer Object (DTO) for a Place.
 *
 * This class is used to transfer data between the application and its clients.
 * It represents a simplified version of the Place entity and contains
 * the necessary fields for data representation.
 */
@Data
public class PlaceDTO {

    /**
     * The unique identifier for the place.
     * This is the primary key used to identify the place in the database.
     */
    private Integer placeId;

    /**
     * The name of the place.
     * This field represents the name of the location being described.
     */

    @Size(min = 1, max = 150)
    private String name;

    /**
     * The country where the place is located.
     * This field indicates the country associated with the place.
     */
    @Size(min = 1, max = 150)
    private String country;

    /**
     * The city where the place is situated.
     * This field specifies the city corresponding to the place.
     */
    @Size(min = 1, max = 150)
    private String city;

    /**
     * A list of persons associated with the place.
     * This field contains a collection of PersonDTO objects,
     * representing individuals who are linked to or visited the place.
     */
    private List<PersonDTO> person;
}
