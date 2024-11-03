package com.prueba.gestionriesgos.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

/**
 * Data Transfer Object (DTO) for a Place.
 *
 * This class is used to transfer data between the application and its clients.
 * It represents a simplified version of the Place entity and contains
 * the necessary fields for data representation.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaceDTO {

    /**
     * The unique identifier for the place.
     * This is the primary key used to identify the place in the database.
     */
    private Long placeId;

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
     * The state where the place is situated.
     * This field specifies the state corresponding to the place.
     */
    @Size(min = 1, max = 150)
    private String state;

    /**
     * Id of the person associated with the place.
     */
    private Long personId;
}
