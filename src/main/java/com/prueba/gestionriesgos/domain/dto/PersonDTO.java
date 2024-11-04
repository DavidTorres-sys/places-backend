package com.prueba.gestionriesgos.domain.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * Data Transfer Object (DTO) for a Person.
 *
 * This class is used to transfer data related to a person between the
 * application and its clients. It represents a simplified version of the
 * Person entity and contains the necessary fields for data representation.
 */
@Data
public class PersonDTO {

    /**
     * The first name of the person.
     * This field holds the first name of the individual.
     */
    @Size(min = 1, max = 150)
    private String firstName;

    /**
     * The age of the person.
     * This field represents the age of the individual in years.
     */
    @Min(value= 0, message = "Age must be a positive number")
    private Integer age;

    /**
     * The occupation of the person.
     * This field describes the job or profession of the individual.
     */
    @Size(min = 1, max = 150)
    private String occupation;

}
