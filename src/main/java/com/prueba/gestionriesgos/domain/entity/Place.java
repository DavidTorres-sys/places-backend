package com.prueba.gestionriesgos.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Size;

/**
 * Represents a Place.
 * This class is mapped to the "Place" table in the database.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "place")
public class Place {

    /**
     * The unique identifier for the curb.
     * It is auto-generated by the database and serves as the primary key of the "place" table.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private Integer placecId;

    /**
     * The name of the place.
     */
    @NonNull
    @Size(min = 1, max = 150, message = "Name must be between 1 and 150 characters")
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    /**
     * The country of the place.
     */
    @NonNull
    @Size(min = 1, max = 150, message = "Country must be between 1 and 150 characters")
    @Column(name = "country", nullable = false, length = 50)
    private String country;

    /**
     * The state of the place.
     */
    @NonNull
    @Size(min = 1, max = 150, message = "State must be between 1 and 150 characters")
    @Column(name = "state", nullable = false, length = 50)
    private String state;

    /**
     * The person that are visited the place.
     */
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "person_id")
    private Person person;
}